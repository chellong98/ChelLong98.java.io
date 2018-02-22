<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Display Page</title>
</head>
<body>
		<!--table border = "1">
				
				<c:forEach items = "${listuser}" var = "list">
				
					
						<tr>
						
							<td>
								${list.name1}
							</td>
							
							<td>
								${list.name2}
							</td>
							
						</tr>
					
				</c:forEach>
		
		</table-->
		
		<table border = "1">
				
				<c:forEach items = "${liststudent}" var = "list">
				
					<c:if test="${(list.num > 3) && (list.num < 6)}">
						<tr>
						
							<td>
								${list.num}
							</td>
							
							<td>
								${list.username}
							</td>
							
						</tr>
					</c:if>
				</c:forEach>
		
		</table>
		
		
</body>
</html>