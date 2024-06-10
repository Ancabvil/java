<%@page import="clases.Carrito"%>
<%
    
  int codigo = Integer.parseInt(request.getParameter("codigo"));
  Cookie cookie = dameCookie(request, "carrito") ;
  Carrito carrito = new Carrito(cookie.getValue());
  carrito.meteProductoConCodigo(codigo);
  
  cookie = new Cookie("carrito", carrito.toString());
                cookie.setPath("/");
                cookie.setMaxAge(365 * 24 * 60 * 60);
                response.addCookie(cookie);
  
    
  response.sendRedirect("index.jsp");
%>

<%!
    public static Cookie dameCookie(HttpServletRequest request, String nombre) {
        Cookie[] cookies = request.getCookies();
            if (cookies != null) {
               for (Cookie cookie : cookies) {
                   if (cookie.getName().equals(nombre)) {
                       return cookie;
                      }
                }
            }
            return null;
        }

%>