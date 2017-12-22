package TestPakage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class repeatVisitor
 */
@WebServlet("/repeat-visitor")
public class repeatVisitor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean newbie = true;
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(Cookie c : cookies) {
				if(c.getName().equals("repeatVisitor") && c.getValue().equals("yes")) { //nếu cookie đã tồn tại
					newbie = false;
					break;
				}
			}
		}
		String title;
		if(newbie) { //nếu chưa có newbie này
			Cookie returnVisitorCookie = new Cookie("repeatVisitor", "yes");
			returnVisitorCookie.setMaxAge(60*60*24);//tồn tại trong 24h
			response.addCookie(returnVisitorCookie);//thêm cookies vào đối tượng trả về
			title="Welcome Aboad";
		} else {
			title="Welcome back";
		}
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<h1>"+title+"</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
