package TestPakage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormData1
 */
@WebServlet("/Three_param1")
public class FormData1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<table border=1 align=center>\n"
				+ "<tr>\n"
				+ "<th>ParamNames</th> <th>ParamValues</th>"
				+ "</tr>");
		Enumeration<String> paramNames = request.getParameterNames(); //1 tập hợp enum là tên của parameter
		while(paramNames.hasMoreElements()) {
			String paramName = paramNames.nextElement();//lấy ra các paramname
			pw.println("<tr>"
					+"<td>"+paramName+"</td>");
			String[]paramValues = request.getParameterValues(paramName);	 //value có thể có nhiều giá trị	
			pw.println("<td>");
			if(paramValues.length==1) {
				pw.println(paramValues[0]);
			} else { //nếu có nhiều giá trị thì in theo dạng danh sách
				pw.println("<ul>");
				for (int i = 0; i < paramValues.length; i++) {
					pw.println("<li>"+paramValues[i]);
				}
				pw.println("</ul>");
			}
			pw.println("</td>");
		}
		pw.println("</table>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
