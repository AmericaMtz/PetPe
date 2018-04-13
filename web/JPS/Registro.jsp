<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*;"%>
<%@page import="java.sql.*;"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <script>
        function mensaje(){
            alert("Registro dado de alta");
        }
        </script>
    <body>
        <%
            String appate = request.getParameter("appat");
            String apmate= request.getParameter("apmat");
            String nombree= request.getParameter("nombre");
            String fecha= request.getParameter("date");
            int matricu = Integer.parseInt(request.getParameter("matri"));
            int cel = Integer.parseInt(request.getParameter("celu"));
            String correoo= request.getParameter("correo");
            String nickname= request.getParameter("nn");
            String contras= request.getParameter("contra");
            
            
            Connection con=null;
            Statement sta= null;
            
            try
            {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con= DriverManager.getConnection("jdbc:mysql://localhost/HHB","root","n0m3l0");
                sta= con.createStatement();
            }
            catch(SQLException error) {
                out.print(error.toString());
            }
            try{
                sta.executeUpdate("INSERT INTO personas VALUES('"+appate+"','"+apmate+"','"+nombree+"','"+fecha+"','"+matricu+"','"+cel+"',"
                        + "'"+correoo+"','"+nickname+"','"+contras+"');");
                
                out.println("<script>mensaje();</script>");
                con.close();
                
                out.print("<META HTTP-EQUIV='REFRESH' CONTENT='.0000001; URL=http://localhost:8080/PetPeti/InicioDeSesion/InicioDeSesion.html'/>");
            }
            catch(SQLException error){
                out.print(error.toString());
            }
        %>
    </body>
</html>

