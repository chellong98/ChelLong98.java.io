<%-- 
    Document   : home
    Created on : Mar 25, 2018, 8:57:29 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<!DOCTYPE html>
<html>
    	<script type="text/javascript" src="./vendor/bootstrap.js"></script>
	<link rel="stylesheet" href="./vendor/bootstrap/css/bootstrap.min.css">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <table class="table-bordered table-success">
            <tr>
                <th>id</th>
                <th>name</th>
                <th>salary</th>
            </tr>
            <c:forEach items="${listemp}" var="list">
                <tr>
                    <td>${list.id}</td>
                    <td>${list.name}</td>
                    <td>${list.salary}</td>
                </tr>
            </c:forEach>
        </table>
        
        <nav aria-label="Page navigation example">
        <ul class="pagination">
          <li class="page-item"><a class="page-link" href="HomeForward?pageid=${numberpage-1}">Previous</a></li>
          <li class="page-item"><a class="page-link" href="HomeForward?pageid=1">1</a></li>
          <li class="page-item"><a class="page-link" href="HomeForward?pageid=2">2</a></li>
          <li class="page-item"><a class="page-link" href="HomeForward?pageid="<%=request.getAttribute("pageid")%>>Next</a></li>
        </ul>
      </nav>
        
    </body>
</html>
