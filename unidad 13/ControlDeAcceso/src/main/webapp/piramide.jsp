<%-- 
    Document   : grabasocio
    Created on : 9 may 2024, 17:32:16
    Author     : cabre
--%>

<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.Connection" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Materialize -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/css\
/materialize.min.css">
<link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

        <title>Piramido</title>
    </head>
    <body>
        <div class="container center">
            <% 
                int alturaTotal = Integer.parseInt(request.getParameter("altura"));
                int altura = 1;
                int i = 0;
                
                while (altura <= alturaTotal){
                for(i = 1; i < altura*2; i++){
                out.print("O");
                }
                out.print("</br>");
                altura ++;
                }
                %>
        </div>
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <!-- Materialize -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/js/materialize.min.js"></script>
        </body>
</html>
