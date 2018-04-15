<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*;"%>
<%@page import="java.sql.*;"%>
<!DOCTYPE html>
<html>
    <head>
        <title>REGISTRO</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <LINK REL=StyleSheet HREF="../DocumentosCSS/Estilos.css" TYPE="text/css" MEDIA=screen>
        <script src="../JavaScript/Registro.js"></script>
    </head>
    <body>
        <div class="contenedor">
            <form name="formulario" onSubmit="return validarPasswd()" method="post" action="../JPS/Registro.jsp">
                <center>
                    <p class="titulo"> REGÍSTRATE </p>
                    <br><br>
                    <INPUT type="text" id="noms" name="nombre" placeholder="Nombre(s)" maxlength="25" onkeyup="mayus(this);" onkeypress="letras()" required/> 
                    <INPUT type="text" id="appat" name="appat" placeholder="Apellido Paterno" maxlength="20" onkeyup="mayus(this);" onkeypress="letras()" required/>
                    <INPUT type="text" id="apmat" name="apmat" placeholder="Apellido Materno" maxlength="20" onkeyup="mayus(this);" onkeypress="letras()" required/> 
                    <br><br>

                        <%

                            out.println("<select id='delegacion' name='delegacion'>");
                                out.println("<option value='opc0'>Delegacion</option>");
                                Connection con = null;
                                Statement sta = null;
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
                                    r = sta.executeQuery("select Nom_Delegacion from cat_delegaciones;");
                                    while(r.next()){
                                        String delegacion = r.getString("Nom_Delegacion");
                                        out.println("<option value='"+delegacion+"'>"+delegacion+"</option>");
                                    }
                                }
                                catch(SQLException error) {
                                    out.print(error.toString());
                                }
                            out.println("</select>");
                            
                            
                            out.println("<select id='colonia' name='colonia'>");
                                out.println("<option value='opc0'>Colonia</option>");
                                try{
                                    r = sta.executeQuery("select Nom_Colonia from cat_colonias;");
                                    while(r.next()){
                                        String colonia = r.getString("Nom_Colonia");
                                        out.println("<option>"+colonia+"</option>");
                                    }
                                }
                                catch(Exception error) {
                                    out.print(error.toString());
                                }
                            out.println("</select>");
                        %>
                    <br><br>
                    <INPUT type="text" id="correo" name="correo" placeholder="Correo Electrónico" maxlength="50" required/>
                    <INPUT type="text" id="cel" name="celu" placeholder="Celular" maxlength="10" minlength="10" onkeypress="nume()" required/>
                    <br><br>
                    <INPUT type="text" id="nina" name="nn" placeholder="Nick Name" maxlength="25" onkeyup="mayus(this);" required/>
                    <INPUT type="password" id="con" name="contra" placeholder="Contraseña" maxlength="20" required/>
                    <INPUT type="password" id="concom" name="contracom" placeholder="Confirma Contraseña" maxlength="20" required/>
                    <br><br><br>
                    <p align="right">
                        <INPUT type="submit" class="boton" name="bot" value="Registra" id="botreg">
                    </p>
                </center>
            </form>
        </div>
    </body>
</html>