/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.bean.UsuarioBean;
import model.dao.UsuarioDao;

/**
 *
 * @author HélioFerreira
 */
@WebServlet(name = "Usuario", urlPatterns = {"/Usuario"})
public class Usuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String funcao = request.getParameter("funcao");
        
        switch(funcao){
            case "editar":
                String username = (String)request.getParameter("usuario");
                request.setAttribute("user", new UsuarioDao().buscaUsuarioUsuario(username));
                request.getRequestDispatcher("/formeditusuario.jsp").forward(request, response);
                
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String funcao = request.getParameter("funcao");
        HttpSession session = request.getSession();
        switch(funcao){
            case "alterar":
                int id = Integer.parseInt(request.getParameter("id"));
                String nome = (String)request.getParameter("nome");
                String usuario = (String)request.getParameter("usuario");
                float peso = Float.parseFloat(request.getParameter("peso"));
                
                UsuarioBean usuarioBean = new UsuarioBean();
                usuarioBean.setId(id);
                usuarioBean.setNome(nome);
                usuarioBean.setPeso(peso);
                usuarioBean.setUsuario(usuario);
                boolean resultado = new UsuarioDao().alterarUsuario(usuarioBean);
                System.out.print(resultado);
                if(resultado){
                    session.setAttribute("usuario", nome);
                    session.setAttribute("peso", peso);
                    request.setAttribute("messagem","Usuario Editado com sucesso!");
                    request.setAttribute("user", usuarioBean);
                    request.getRequestDispatcher("/cliente.jsp").forward(request, response);
                }else{
                    request.setAttribute("messagem","Usuário não editada!");
                    request.getRequestDispatcher("/formeditusuario.js").forward(request, response);
                }
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
