<%-- 
    Document   : tabla
    Created on : 26 abr 2024, 12:16:37
    Author     : cabre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tabla de multiplicar</h1>
        <% int n = Integer.parseInt(request.getParameter("numero")); %>
    <table>
        <% 
        for (int i = 0; i<11; i++){
            out.print("<tr><td>" + i + " x " + n + "</td><td> = </td><td>" + i * n + "</td></Tr>" );
            }
        %>
    </table>
    </body>
    
</html>
