<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%
	String bgColor = request.getParameter("bgcolor");
	if(bgColor==null || bgColor.trim().equals("")) {
		bgColor="WHITE";
	}
%>
<body bgcolor="<%=bgColor%>"> 
<!-- khai báo hàm, biến java trong html -->
	<%! 
		private String ramDomHeading() { 
			return ("<h2>" + Math.random() + "<h2>");
	}
	%>
	<h2>Ramdom Heading</h2><%=ramDomHeading() %>
	<%! private int accessCount = 0; %>
	<h2>Access to page since server reboot: <%=++accessCount %></h2> <!-- số lượt truy cập vào server mỗi lần reboot -->
	
</body>
</html>