<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import = "Mypack.Users" %>    
<%@ page import = "Mypack.DAO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>IndexProcess Page</title>
</head>
<body>

	<!--%
				
				
				request.setAttribute("listuser",DAO.ExportUsers());
				
				RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
				rd.forward(request,response);
			
	
	%-->
	
	
	<%
				
				
				request.setAttribute("liststudent",DAO.ExportStudent());
				
				RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
				rd.forward(request,response);
			
	
	%>
	
	

</body>
</html>