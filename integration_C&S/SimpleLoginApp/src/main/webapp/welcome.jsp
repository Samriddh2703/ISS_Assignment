<!-- welcome.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Welcome</title>
</head>
<body>
    <div align="center">Welcome <%=request.getAttribute("message") %><br><a href="index.jsp">Logout</a></div>
</body>
</html>
