<%-- 
    Document   : borraVideojuego
    Created on : 
    Author     : 
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3310/juegos_steam","root", "");
            Statement s = conexion.createStatement();                    
            request.setCharacterEncoding("UTF-8");
        String borrar ="DELETE FROM videojuego WHERE identificador=" + Integer.valueOf(request.getParameter("identificador")); 
        ResultSet borrado = s.executeQuery(borrar);
        s.close();
        conexion.close();
        %>
        <script>document.location = "index.jsp";</script>
    </body>
</html>
