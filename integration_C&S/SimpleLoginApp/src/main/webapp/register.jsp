<!-- register.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Registration</title>
</head>
<body>
    <form action="register" method="POST">
        <table align="center">
            <tr><td colspan="2"><h2>Registration</h2></td></tr>
            <tr><td>Name</td><td><input type="text" name="name"></td></tr>
            <tr><td>User Name</td><td><input type="text" name="userName"></td></tr>
            <tr><td>Password</td><td><input type="password" name="password"></td></tr>
            <tr><td>&nbsp;</td><td><button type="submit">Register</button></td></tr>
        </table>
    </form>
</body>
</html>
