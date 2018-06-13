/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.bean.MetaBean;
import model.bean.UsuarioBean;
import model.dao.MetaDao;
import model.dao.UsuarioDao;

/**
 *
 * @author internet
 */
@WebServlet(name = "Logar", urlPatterns = {"/Logar"})
public class Logar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //doPost(request, response);
        response.sendRedirect("login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String login = request.getParameter("user");
            String senha = request.getParameter("senha");

            HttpSession session = request.getSession();
            // UsuarioDao usuario = new UsuarioDao();
            UsuarioBean usuario = new UsuarioDao().autenticar(login, senha);
            if (usuario != null) {
                response.sendRedirect("cliente.jsp");
                session.setAttribute("usuario", usuario.getNome());
                session.setAttribute("peso", usuario.getPeso());
                session.setMaxInactiveInterval(60 * 5);

            } else {
                response.sendRedirect("login.jsp");
                session.invalidate();
            }
        } catch (NullPointerException e) {
            response.sendRedirect("login.jsp");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    // DICA: https://www.javatpoint.com/servlet-http-session-login-and-logout-example
}
