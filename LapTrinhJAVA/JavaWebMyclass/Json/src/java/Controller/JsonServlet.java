/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.SQLService;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class AjaxServlet
 */
//@WebServlet("/JsonServlet")
public class JsonServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    SQLService service = null;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public JsonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
//        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        
        service = new SQLService("root", "longvip98", "SucKhoe");
        
        String processData = request
                .getParameter("processData");
        response.setContentType("application/json");
        response.setHeader("Cache-Control", "no-cache");
        ArrayList<HashMap<String, String>> list = service.ListCategory();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(list);
            response.getWriter().write(json);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

}
