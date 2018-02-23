/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import BEAN.Account;
import DAO.RegisterDAO;
import DB.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Administrator
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {

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
        Connection conn = DBConnection.createConnection();
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Account acc = new Account();
        acc.setUsername(username);
        acc.setPassword(password);

        boolean check = RegisterDAO.InsertAcount(conn, acc);
        System.out.println(check);
        if (check) {
            try {
                request.setAttribute("msgRegister", "Register success");
                RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/RegisterPage.jsp");
                rd.forward(request, response);
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            request.setAttribute("msgRegister", "Register fail");
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/RegisterPage.jsp");
            rd.forward(request, response);
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
