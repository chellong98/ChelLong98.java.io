<%-- 
    Document   : LoginPage
    Created on : Feb 23, 2018, 10:00:34 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2><%=request.getAttribute("msgRegister") !=null ? request.getAttribute("msgRegister") : ""%></h2>
        <form action="RegisterController" method="post">
            Username: <input type="text" name="username"/>
            <br>
            <br>
            Password: <input type="password" name="password"/>
            <br>
            <br>
            <input type="submit" value="register"/>
        </form>
    </body>
</html>