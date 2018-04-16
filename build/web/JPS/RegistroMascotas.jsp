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
            String nom = (request.getParameter("nommas")).toUpperCase();
            String tip = (request.getParameter("Tipo")).toUpperCase();
            String raza = (request.getParameter("Raza")).toUpperCase();
            String edad = (request.getParameter("edadmas")).toUpperCase();
            String desc = (request.getParameter("Descripcion")).toUpperCase();
            String sex= (request.getParameter("sexo")).toUpperCase();
            String img= (request.getParameter("Archivo")).toUpperCase()+" "+(new java.util.Date());
            String col=null;
            String idraz="";
            String idtip ="";
            
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
                    r = sta.executeQuery("select Id_Raza from cat_razas where Nom_Raza='"+raza+"';");
                    if(r.next()){
                        idraz = r.getString("Id_Raza");
                    }
                    r = sta.executeQuery("select Id_Tipo from cat_Tipos where Nom_Tipo='"+tip+"';");
                    if(r.next()){
                        idtip = r.getString("Id_Tipo");
                    }
                    
                
                CallableStatement ps = con.prepareCall("{call sp_Alta_Masc(?,?, ?, ?,?, ?, ?, ?,?)}");
                    ps.setInt(1, 0);//id
                    ps.setString(2, nom);//nombre
                    ps.setString(3, sex);//sexo
                    ps.setString(4, idraz);//raza
                    
                    ps.setString(5, edad);//edas
                    ps.setString(6, desc);//colonia
                    ps.setString(7, col);//descripcion
                    ps.setString(8, img);//imagen

                    ps.registerOutParameter(9, Types.INTEGER);
                    ps.execute();
                    
                    
                    int resultado = ps.getInt(9);
                    ps.close();
                    if(resultado==1){
                        out.print("<script> alert('Mascota agregada'); </script>");
                    }
                    else
                        if(resultado==2){
                            out.print("<script> alert('Mascota ya existe'); </script>");
                           
                        }
                     out.print("<META HTTP-EQUIV='REFRESH' CONTENT='0.00000001;URL=http://localhost:8080/PetPe/MOfrece/Ofrece.html'>");
                }catch(SQLException error) {
                    out.print(error.toString());
                }
        %>
    </body>
</html>

