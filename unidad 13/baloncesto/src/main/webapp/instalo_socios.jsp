<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="estilos.css" />
<title>Listado Socios</title>
</head>
<body>
<h1>Listado de Socios</h1>
<%
Class.forName("org.mariadb.jdbc.Driver");
Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/baloncesto","root", "");
Statement s = conexion.createStatement();
ResultSet listado = s.executeQuery ("SELECT * FROM socio");
while (listado.next()) {
out.println(listado.getString("socioID") + " " + listado.getString("nombre") + "<br>");
}
conexion.close();
%>
</body>
</html>
