<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*;"%>
<%@page import="java.sql.*;"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <%
            String nom = request.getParameter("nombre");
            String appat = request.getParameter("appat");
            String apmat = request.getParameter("apmat");
            String correo = request.getParameter("correo");
            String cel = request.getParameter("celu");
            String nick = request.getParameter("nn");
            String contra = request.getParameter("contra");
            String colo = request.getParameter("colonia");
            String dele = request.getParameter("delegacion");
            String idcol = "";
            String iddel = "";
            
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
                    r = sta.executeQuery("select Id_Colonia from cat_colonias where Nom_Colonia='"+colo+"';");
                    if(r.next()){
                        idcol = r.getString("Id_Colonia");
                    }
                    r = sta.executeQuery("select Id_Delegacion from cat_delegaciones where Nom_Delegacion='"+dele+"';");
                    if(r.next()){
                        iddel = r.getString("Id_Delegacion");
                    }
                
                CallableStatement ps = con.prepareCall("{call AltasP(?,?,?,?,?,?,?,?,?,?,?)}");
                    ps.setInt(1, 0);//id
                    ps.setString(2, nick);//nick
                    ps.setString(3, nom);//nombre
                    ps.setString(4, appat);//apellido paterno
                    ps.setString(5, apmat);//apellido materno
                    ps.setString(6, contra);//contraseña
                    ps.setString(7, correo);//correo
                    ps.setString(8, cel);//telefono
                    ps.setString(9, idcol);//colonia
                    ps.setString(10, iddel);//delegacion
                    ps.registerOutParameter(11, Types.INTEGER);
                    ps.execute();
                    int resultado = ps.getInt(11);
                    ps.close();
                    if(resultado==1){
                        out.print("<script> alert('Persona agregada'); </script>");
                    }
                    else
                        if(resultado==2){
                            out.print("<script> alert('Persona ya existe'); </script>");
                        }
                    
                }catch(SQLException error) {
                    out.print(error.toString());
                }
        %>
    </body>
</html>

