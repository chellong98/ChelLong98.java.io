package TestPakage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormData
 */
@WebServlet("/three_params")
public class FormData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();//đối tượng ghi của response
		pw.println("<ul>\n"
				+ "<li><b>Param1</b>"
				+ request.getParameter("param1") + "\n" //lấy giá trị của input param 1
				+ "<li><b>Param2</b>"
				+ request.getParameter("param2") + "\n" 
				+ "<li><b>Param3</b>"
				+ request.getParameter("param3") + "\n"
				);
		pw.println("</ul>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
