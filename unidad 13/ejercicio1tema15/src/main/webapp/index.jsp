<%-- 
    Document   : index
    Created on : 17 may 2024, 18:07:27
    Author     : cabre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cuentavisitas</title>
    </head>
    <body>
        
        <%
            session.setAttribute(
            "n",
            session.getAttribute("n") == null ? 1 : (Integer)session.getAttribute("n") + 1
        );
%>
<h1><%= session.getAttribute("n") %></h1>

<a href="reinicio.jsp">Resetea.</a>
      
        
    </body>
</html>
