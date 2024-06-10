<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/styles.css" >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Texto por cadena</title>
    </head>
    <body>
        <% request.setCharacterEncoding("utf-8"); %>
        Texto introducido:
        <% out.print(request.getParameter("nombre"));%>
    </body>
</html>
