<%-- 
    Document   : index
    Created on : 3 may 2024, 19:15:47
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
        <title>Control de Acceso</title>
    </head>
    <body>
        <%
          Class.forName("org.mariadb.jdbc.Driver");
          Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3310/control_acceso","root", "");
          Statement s = conexion.createStatement();

          request.setCharacterEncoding("UTF-8");
          
          String consulta = "SELECT COUNT(*) FROM usuario WHERE id='"
          + request.getParameter("id")
          +"' AND contraseña='"
          +request.getParameter("contraseña")
          + "'";
          
          ResultSet coincidencias = s.executeQuery(consulta);
          coincidencias.next();
          
          String icono;
          String mensaje;
          String enlace;
          
          if (coincidencias.getInt(1)==0){
            icono = "<i class=\"material-icons red-text large\">lock</i>";
            mensaje = "<p>Lo siento, acceso denegado.</p>"; //candado cerrado
            enlace = "index.jsp";
                }else if(request.getParameter("id").equals("admin")) {
            icono = "<i class=\"material-icons teal-text large\">lock_open</i>";
            mensaje = "<p>Acceso de administración.</p>"; // candado abierto
            enlace = "admin.jsp";
            }else{
            icono = "<i class=\"material-icons teal-text large\">lock_open</i>";
            mensaje = "<p>Acceso permitido a la aplicación.</p>"; // candado abierto
            enlace = "indexp.jsp";
            };
        %>

        <div class="container">
            <div class="row"></div>
            <div class="row">
                 
            <div class="row col m3"></div>
                <div class="col m6 card-panel grey lighten-5 center">
                    <h5 class="center"> Control de acceso</h5>
                    <%= icono %>
                    <%= mensaje %>
                    <p class="center">
                        <a href="<%= enlace %>" class="btn waves-effect waves-light center">
                        Aceptar
                        <i class="material-icons">check_circle</i></a>
                    </p>
                    <br>
                </div>    
        </div>
        </div>
   <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<!-- Materialize -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/js/materialize.min.js"></script>
    </body>
</html>
