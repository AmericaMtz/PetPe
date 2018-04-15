package org.apache.jsp.Registro;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;;
import java.sql.*;;

public final class R_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>REGISTRO</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <LINK REL=StyleSheet HREF=\"../DocumentosCSS/Estilos.css\" TYPE=\"text/css\" MEDIA=screen>\n");
      out.write("        <script>\n");
      out.write("        function validarPasswd(){\n");
      out.write("            var p1 = document.getElementById(\"con\").value;\n");
      out.write("            var p2 = document.getElementById(\"concom\").value;\n");
      out.write("            if(p1 === p2){\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("                alert(\"Las contraseñas no coinciden\");\n");
      out.write("                return false;\n");
      out.write("        }\n");
      out.write("        function mayus(e) {\n");
      out.write("            e.value = e.value.toUpperCase();\n");
      out.write("        }\n");
      out.write("        function letras(){\n");
      out.write("            var letras = \" abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ\";\n");
      out.write("            var x = event.keyCode;\n");
      out.write("            var letra = String.fromCharCode(x);\n");
      out.write("            var n = letras.indexOf(letra);\n");
      out.write("            var texto = noms.value;\n");
      out.write("            if (letra === ' '){\n");
      out.write("                if(texto.indexOf(' ') !== -1)\n");
      out.write("                    event.returnValue = false;\n");
      out.write("            }\n");
      out.write("            if (n===-1)\n");
      out.write("                event.returnValue= false;\n");
      out.write("        }\n");
      out.write("        function nume(){\n");
      out.write("            var numeros = \"1234567890\";\n");
      out.write("            var x = event.keyCode;\n");
      out.write("            var numero = String.fromCharCode(x);\n");
      out.write("            var n = numeros.indexOf(numero);\n");
      out.write("            if (n===-1)\n");
      out.write("                event.returnValue= false;\n");
      out.write("        }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"contenedor\">\n");
      out.write("            <form name=\"formulario\" onSubmit=\"return validarPasswd()\" method=\"post\" action=\"../JPS/Registro.jsp\">\n");
      out.write("                <center>\n");
      out.write("                    <p class=\"titulo\"> REGÍSTRATE </p>\n");
      out.write("                    <br><br>\n");
      out.write("                    <INPUT type=\"text\" id=\"noms\" name=\"nombre\" placeholder=\"Nombre(s)\" maxlength=\"25\" onkeyup=\"mayus(this);\" onkeypress=\"letras()\" required/> \n");
      out.write("                    <INPUT type=\"text\" id=\"appat\" name=\"appat\" placeholder=\"Apellido Paterno\" maxlength=\"20\" onkeyup=\"mayus(this);\" onkeypress=\"letras()\" required/>\n");
      out.write("                    <INPUT type=\"text\" id=\"apmat\" name=\"apmat\" placeholder=\"Apellido Materno\" maxlength=\"20\" onkeyup=\"mayus(this);\" onkeypress=\"letras()\" required/> \n");
      out.write("                    <br><br>\n");
      out.write("\n");
      out.write("                        ");


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
                        
      out.write("\n");
      out.write("                    <br><br>\n");
      out.write("                    <INPUT type=\"text\" id=\"correo\" name=\"correo\" placeholder=\"Correo Electrónico\" maxlength=\"50\" required/>\n");
      out.write("                    <INPUT type=\"text\" id=\"cel\" name=\"celu\" placeholder=\"Celular\" maxlength=\"10\" onkeypress=\"nume()\" required/>\n");
      out.write("                    <br><br>\n");
      out.write("                    <INPUT type=\"text\" id=\"nina\" name=\"nn\" placeholder=\"Nick Name\" maxlength=\"25\" onkeyup=\"mayus(this);\" required/>\n");
      out.write("                    <INPUT type=\"password\" id=\"con\" name=\"contra\" placeholder=\"Contraseña\" maxlength=\"20\" required/>\n");
      out.write("                    <INPUT type=\"password\" id=\"concom\" name=\"contracom\" placeholder=\"Confirma Contraseña\" maxlength=\"20\" required/>\n");
      out.write("                    <br><br><br>\n");
      out.write("                    <p align=\"right\">\n");
      out.write("                        <INPUT type=\"submit\" class=\"boton\" name=\"bot\" value=\"Registra\" id=\"botreg\">\n");
      out.write("                    </p>\n");
      out.write("                </center>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
