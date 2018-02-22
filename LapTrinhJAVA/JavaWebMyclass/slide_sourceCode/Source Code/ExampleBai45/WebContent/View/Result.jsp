<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result Page</title>
</head>
<body>
	<c:if test="${ketqua != null}">
			${ketqua}
	</c:if>
	
	<c:if test="${ketqua == null}">
			<c:forEach items="${listemp}" var="list">
					
					${list.name}
					<br/>
				
			</c:forEach>
	</c:if>
	
</body>
</html>