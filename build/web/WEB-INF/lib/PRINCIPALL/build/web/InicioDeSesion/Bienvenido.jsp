          <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            
         
        </script>
    </head>
    <body>
        <%@page import="java.sql.*,java.io.*" %>
        
        <% 
            String clavee;
            String nick;
            Connection c=null;
            Statement s=null;
            ResultSet r=null;
            
            try {
                  Class.forName("com.mysql.jdbc.Driver").newInstance();
                  c = DriverManager.getConnection("jdbc:mysql://localhost/HHB","root","n0m3l0");
                  s = c.createStatement();
                } 
            catch (SQLException error) {
                    out.print(error.toString());
                }
            
            try {
                   clavee = request.getParameter("contrasenia"); 
                   nick =  request.getParameter("nomUsua"); 
                   r = s.executeQuery("select * from personas where contraseña='"+clavee+"' and nickname ='"+nick+"';");
                   
                   if(r.next()){
                    c.close();
                
                out.print("<META HTTP-EQUIV='REFRESH' CONTENT='.0000001; URL=http://localhost:8080/HHB/Chat2/chat1.html'/>");
                   }
                   else{
                       out.println("<script> alert('Los datos no coinciden.')</script>");
                       out.println("<META HTTP-EQUIV='REFRESH' CONTENT='.0000001; URL=http://localhost:8080/HHB/InicioDeSesion/InicioSesion.html'/>");
                   }
                } 
            catch (SQLException error) {
                    out.print(error.toString());
                }
            
        %>
        
    </body>
</html>