<%-- 
    Document   : index
    Created on : 21 abr 2024, 12:52:33
    Author     : cabre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="paquetePokemon" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <ul>
        <%
            String pokemon = "C:\\pokemon2\\src\\main\\java\\paquetePokemon\\pokedex.json";
            GestorPokemon gestor = new GestorPokemon();
            gestor.importarJSON(pokemon);
        %>
        </ul>
    </body>
</html>
