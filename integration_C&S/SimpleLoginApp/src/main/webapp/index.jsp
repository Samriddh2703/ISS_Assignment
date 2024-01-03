<!-- index.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Login</title>
</head>
<body>
    <form action="login" method="POST">
        <table align="center">
            <tr><td colspan="2"><h2>Sign In</h2></td></tr>
            <tr><td>User Name</td><td><input type="text" name="userName"></td></tr>
            <tr><td>Password</td><td><input type="password" name="password"></td></tr>
            <tr><td><a href="register.jsp">Register</a></td><td><button type="submit">Login</button></td></tr>
            <tr><td><%=request.getAttribute("message")==null?"":request.getAttribute("message")%></td></tr>
        </table>
    </form>
</body>
</html>
