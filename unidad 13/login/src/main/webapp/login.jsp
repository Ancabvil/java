<%-- 
    Document   : login
    Created on : 17 may 2024, 19:22:13
    Author     : cabre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
    </head>
    <body>
        <%
        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");
    if (usuario.equals("pepe") && contrasena.equals("1234")) {
        session.setAttribute("usuario", usuario);
        response.sendRedirect("perfil.jsp");
        } else {
            session.setAttribute("error", "Usuario o contraseña incorrecto");
            response.sendRedirect("login.jsp");
        }
        %>
    </body>
</html>
