<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*;"%>
<%@page import="java.sql.*;"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            String nick = request.getParameter("nomUsua");
            String contra = request.getParameter("contrasenia");
            
                Connection con=null;
                Statement sta= null;
                ResultSet r = null;

                try
                {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    con= DriverManager.getConnection("jdbc:mysql://localhost/PP","root","n0m3l0");
                    sta= con.createStatement();
                }
                catch(SQLException error) {
                    out.print(error.toString());
                }
                try{
                CallableStatement ps = con.prepareCall("{call InicioP(?,?,?)}");
                    ps.setString(1, nick);//nick
                    ps.setString(2, contra);//nick
                    ps.registerOutParameter(3, Types.INTEGER);
                    ps.execute();
                    int resultado = ps.getInt(3);
                    ps.close();
                    if(resultado==3){
                        out.print("<script> alert('Usted a entrado'); </script>");
                    }
                    else
                        if(resultado==4){
                            out.print("<script> alert('Contraseña incorrecta'); </script>");
                        }
                    else
                        if(resultado==5){
                            out.print("<script> alert('El registro no existe'); </script>");
                        }
                }catch(SQLException error) {
                    out.print(error.toString());
                }
        %>
     
    </body>
</html>
