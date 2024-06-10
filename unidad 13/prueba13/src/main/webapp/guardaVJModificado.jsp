<%-- 
    Document   : guardaVJModificado
    Created on : 
    Author     : 
--%>

<!-- TODO: Importa clases de bibliotecas para la construcción de sentencias SQL, 
manejador de la BBDD y gestión de la conexión -->
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
        // TODO: Invocación a manejador BBDD, creación de conexión y sentencia SQL
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3310/juegos_steam","root", "");
            Statement s = conexion.createStatement();                    
            request.setCharacterEncoding("UTF-8");
        
        // TODO: Ejecución de sentencia SQL 
        // Actualiza los datos del videojuego en la base de datos 
       String consulta = "SELECT * FROM videojuego WHERE identificador="
                                + Integer.valueOf(request.getParameter("identificador"));      
      ResultSet juegos = s.executeQuery(consulta);
      juegos.last();
      
      if(juegos.getRow!=0){
            out.print("<script type=\"text/javascript\">alert(\"Lo siento, el juego con código " + request.getParameter("identificador") + " ya existe en la base de datos.\");</script>");
            out.print("<script>document.location = \"agregaVideojuego.jsp\"</script>");
            }else{
            String insertar="INSERT INTO videojuegos VALUES (" + Integer.valueOf(request.getParameter("identificador"))
                           + ", '" + request.getParameter("nombre")
                           + ", " + request.getParameter("fecha")
                           + "', " + Double.valueOf(request.getParameter("precio"))
                           + ", " + request.getParameter("descripcion")
                           + ", '" + request.getParameter("imagen") + "')";
                           s.execute(insertar);
            }
      

        // TODO: Cierre de la conexión a la BBDD
        conexion.close();
        %>
        <script>document.location = "index.jsp";</script>
    </body>
</html>
