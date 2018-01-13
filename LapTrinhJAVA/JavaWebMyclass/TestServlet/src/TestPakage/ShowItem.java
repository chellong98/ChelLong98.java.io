package TestPakage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShowItem
 */
@WebServlet("/show-items")
public class ShowItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowItem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();//đối tượng HttpSession đại diện cho 1 user session
//		chỉ cho phép 1 user truy cập vào 1 session trong 1 thời điểm
		synchronized (session) { //đồng bộ hóa thread xem thêm: https://viblo.asia/p/java-synchronized-blocks-jlA7GK04vKZQ
			@SuppressWarnings("unchecked")//bỏ qua các cảnh báo, xem thêm: http://o7planning.org/vi/10197/huong-dan-su-dung-java-annotation
			List<String>previousItems = (List<String>)session.getAttribute("previousItems");//lưu giá trị trong đối tượng session, xem thêm: https://nguyenhung5188.blogspot.com/2014/09/session-trong-servlet.html
			if(previousItems == null) {
				previousItems = new ArrayList<String>();
			}
			String newItem = request.getParameter("newItem");//lấy ra giá trị ở ô input
			if(newItem!=null && (!newItem.trim().equals(""))) { //nếu ô input k null và không là những khoảng trắng
				previousItems.add(newItem); //thêm giá trị ô input vào previousItems
			}
			session.setAttribute("previousItems", previousItems); //@param: tên đối tượng, giá trị đối tượng
			
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			if(previousItems.size()==0) {
				pw.println("no Item");
			} else {
				pw.print("<ul>");
				for(String item : previousItems) {
					pw.println("<li>"+item);
				}
				pw.print("</ul>");
			}
			
		}
	}

}
