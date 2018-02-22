/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Servlet implementation class AjaxServlet
 */
public class AjaxServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjaxServlet() {
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

        String processData = request
                .getParameter("processData");
        response.setContentType("application/json");
        response.setHeader("Cache-Control", "no-cache");
        Map<String, String> personMap
                = new HashMap<String, String>();
        if (null != processData && processData.
                equalsIgnoreCase("JSON")) {
            personMap.put("processData", processData);
            personMap.put("firstName", "Java");
            personMap.put("lastName", "chellong");
        } else {
            for (int i = 0; i < 5; i++) {
                personMap.put("firstName" + i, "Java");
                personMap.put("lastName" + i, "chellong");
            }
        }

        Gson gson = new GsonBuilder().setPrettyPrinting()
                .create();
        String json = gson.toJson(personMap);
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
