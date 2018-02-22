package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DB.DBConnection;

import java.sql.*;


@WebServlet("/TestconnectionController")
public class TestconnectionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public TestconnectionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
			Connection conn = DBConnection.CreateConnection();
			PrintWriter out = response.getWriter();
			
			if (conn != null)
			{
				try 
				{
					out.println("<h1>Connector Success</h1>");
					conn.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
				
			}
			else
			{
				out.println("<h1>Connector Failed</h1>");
			}
			
	}

}
