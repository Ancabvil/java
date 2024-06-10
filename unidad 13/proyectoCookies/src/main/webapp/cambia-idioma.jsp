<%-- 
    Document   : cambia-idioma
    Created on : 22 may 2024, 19:40:20
    Author     : cabre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cambia Idioma</title>
    </head>
    <body><%
    session.setAttribute("idioma",request.getParameter("idioma"));
    response.sendRedirect("index.jsp");
        %>
    </body>
</html>
