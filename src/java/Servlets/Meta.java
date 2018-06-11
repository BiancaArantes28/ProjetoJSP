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
import model.bean.MetaBean;
import model.dao.MetaDao;

/**
 *
 * @author internet
 */
@WebServlet(name = "Meta", urlPatterns = {"/Meta"})
public class Meta extends HttpServlet {

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
        //processRequest(request, response);
        
        
        
            /* TODO output your page here. You may use following sample code. */
            String funcao = request.getParameter("funcao");
            MetaDao meta = new MetaDao();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date data_atual = new Date(System.currentTimeMillis());
            if(funcao.equals("lista")){
                request.setAttribute("messagem","");
                request.setAttribute("listaMetas", new MetaDao().buscaMetas());
                request.getRequestDispatcher("/listaMetas.jsp").forward(request, response);
            }
            if(funcao.equals("editar")){
                int id = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("meta", new MetaDao().buscaMetaporId(id));
                request.getRequestDispatcher("/formeditmeta.jsp").forward(request, response);
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
        MetaDao meta = new MetaDao();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data_atual = new Date(System.currentTimeMillis());
        if (funcao.equals("cadastrarmeta")) {
                String tipometa = request.getParameter("tipo_meta");
                float peso_meta = Float.parseFloat(request.getParameter("peso_meta"));
                MetaBean metaObject = new MetaBean(tipometa, peso_meta);
                metaObject.setDataIni(data_atual);
                meta.cadastrar(metaObject);
                response.sendRedirect("cliente.jsp");
            }
        if(funcao.equals("alterar")){
            int id = Integer.parseInt(request.getParameter("id"));
            String tipometa = request.getParameter("tipo_meta");
            float pesometa = Float.parseFloat(request.getParameter("peso_meta"));
            
            //MetaBean metaBean = new MetaBean(tipometa, pesometa);
            MetaDao metaDao = new MetaDao();
            MetaBean metaBean = metaDao.buscaMetaporId(id);
            metaBean.setId(id);
            metaBean.setTipometa(tipometa);
            metaBean.setObjetivo(pesometa);
            boolean resultado = metaDao.alterarMeta(metaBean);
            System.out.print(resultado);
            
            request.getRequestDispatcher("cliente.jsp").forward(request, response);
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
