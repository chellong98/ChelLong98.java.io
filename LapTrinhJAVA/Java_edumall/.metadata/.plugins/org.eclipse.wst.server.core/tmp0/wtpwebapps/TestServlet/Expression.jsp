<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>JSP Expressions</h2>
	<ul>
		<li>Curent time: <%=new java.util.Date() %>
		<li> Server: <%= application.getServerInfo() %>
		<li> Session ID: <%= session.getId() %>
		<li> The <code>testParam</code> form parameter: <%= request.getParameter("testParam") %>
	</ul>
</body>
</html>