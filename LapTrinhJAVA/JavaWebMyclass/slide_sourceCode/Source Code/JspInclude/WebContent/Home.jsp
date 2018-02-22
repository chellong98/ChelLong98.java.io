<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>
</head>
<body>
	<jsp:include page="Header.jsp"/>
	<jsp:include page="Menu.jsp"/>
	
	<div style="float:left;padding:10px;width:80%;border-left:1px solid pink;">  
		<h1>Welcome to JSP/SERVLET course</h1>
		<br/>
		<h5><a href="Detail.jsp">Course Detail</a></h5>
	</div>
	
	<jsp:include page="Footer.jsp"/>
</body>
</html>