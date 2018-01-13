package ChelLong.javaweb.myPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestHtml")
public class TestHtml extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public TestHtml() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<head>");
		out.println("<meta charset="+"UTF-8"+">");
		out.println("<title> kết quả </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<td> Hello");
		out.println("<td> Chellong98.act@gmail.com học viện ACT");
		out.println("</tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("</body>");
	}

}
