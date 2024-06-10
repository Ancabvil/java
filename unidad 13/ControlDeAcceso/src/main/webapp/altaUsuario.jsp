<%-- 
    Document   : altausuario
    Created on : 16 may 2024, 9:06:55
    Author     : cabre
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
        <!-- Materialize -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/css/materialize.min.css">
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <title>Nuevo Usuario</title>
    </head>
    <body>
        <%  

          Class.forName("org.mariadb.jdbc.Driver");
          Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3310/control_acceso","root", "");
          Statement s = conexion.createStatement();
          request.setCharacterEncoding("UTF-8");
                    
            String consulta = "SELECT COUNT(*) FROM usuario WHERE id='"
            + request.getParameter("usuario")
            + "'";
            
            ResultSet coincidencias = s.executeQuery(consulta);
            coincidencias.next();
            if (coincidencias.getInt(1) != 0) {
            out.print("Lo siento, el usuario ya existe.");
            conexion.close();
            } else {
                // Inserta los datos en la base de datos
            String insercion = "INSERT INTO usuario VALUES ('"
            + request.getParameter("usuario")
            + "', '" + request.getParameter("clave") + "')";
            out.println(insercion);
            s.execute(insercion);
            conexion.close();
            }
        %>
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <!-- Materialize -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/js/materialize.min.js"></script>

        <script>document.location = "admin.jsp"</script>

    </body>
</html>
