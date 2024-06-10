<%-- 
    Document   : logout
    Created on : 17 may 2024, 19:17:00
    Author     : cabre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>logout</title>
    </head>
    <body>
        <% session.invalidate(); 
response.sendRedirect("index.jsp");
%>
        
    </body>
</html>
