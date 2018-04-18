package org.apache.jsp.RegistroMascota;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RMascota_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>REGISTRA A TU MASCOTA!</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <LINK REL=StyleSheet HREF=\"../DocumentosCSS/Estilos.css\" TYPE=\"text/css\" MEDIA=screen>\r\n");
      out.write("        \r\n");
      out.write("        <script type=\"text/javascript\" src=\"../JavaScript/tcal.js\"></script> \r\n");
      out.write("           \r\n");
      out.write("           <script >\r\n");
      out.write("           var dato;\r\n");
      out.write("            function Agregar()\r\n");
      out.write("            { \r\n");
      out.write("                dato= Combo.options[Combo.selectedIndex].value;\r\n");
      out.write("           \r\n");
      out.write("                if(dato === 'Perro')\r\n");
      out.write("                {\r\n");
      out.write("                    Pe=[\"Schnauzer\",\"Pug\",\"Chihuahua\", \"Salchicha\", \"Husky\", \"BÃ³xer\", \"Beagle\"];\r\n");
      out.write("                    var cuantos= Combo2.length;\r\n");
      out.write("                    var contador = 0;  \r\n");
      out.write("                    for(contador=1; contador<= cuantos; contador++)\r\n");
      out.write("                    {\r\n");
      out.write("                        Combo2.options[1]=null;\r\n");
      out.write("                    }\r\n");
      out.write("                    for(i=0 ; i < Pe.length; i++)\r\n");
      out.write("                    {\r\n");
      out.write("                        Combo2.options[i+1]=new Option(Pe[i]);\r\n");
      out.write("                    }\r\n");
      out.write("                    \r\n");
      out.write("                }\r\n");
      out.write("                    if(dato === 'Gato')\r\n");
      out.write("                    {\r\n");
      out.write("                        Ga=[\"SiÃ¡mes\", \"Ragdoll\", \"Bengala\", \"Azul ruso\", \"BurmÃ©s\", \"Egipcio\", \"Korat\"];\r\n");
      out.write("                        var cuantos= Combo2.length;\r\n");
      out.write("                        var contador = 0;\r\n");
      out.write("                        for(contador=1; contador<= cuantos; contador++)\r\n");
      out.write("                        {\r\n");
      out.write("                            Combo2.options[1]=null;\r\n");
      out.write("                        }\r\n");
      out.write("                        for(i=0 ; i < Ga.length; i++){\r\n");
      out.write("                        Combo2.options[i+1]=new Option(Ga[i]);\r\n");
      out.write("                    }\r\n");
      out.write("                    \r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                        if(dato === 'Pez')\r\n");
      out.write("                        {\r\n");
      out.write("                            Pe=[\"Betta\", \"Tetra NeÃ³n\", \"Payaso\", \"Joya\", \"Ãngel\", \"LimÃ³n\", \"Guppys\"];\r\n");
      out.write("                            var cuantos= Combo2.length;\r\n");
      out.write("                            var contador = 0;\r\n");
      out.write("                            for(contador=1; contador<= cuantos; contador++)\r\n");
      out.write("                            {\r\n");
      out.write("                                Combo2.options[1]=null;\r\n");
      out.write("                            }\r\n");
      out.write("                            for(i=0 ; i < Pe.length; i++)\r\n");
      out.write("                            {\r\n");
      out.write("                                Combo2.options[i+1]=new Option(Pe[i]);\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                            if(dato === 'Conejo')\r\n");
      out.write("                            {\r\n");
      out.write("                                Co=[\"Californiano\", \"Cabeza de LeÃ³n\", \"Mini Rex\", \"Mini Lop\", \"Holandes\"];\r\n");
      out.write("                                var cuantos= Combo2.length;\r\n");
      out.write("                                var contador = 0;\r\n");
      out.write("                                for(contador=1; contador<= cuantos; contador++)\r\n");
      out.write("                                {\r\n");
      out.write("                                    Combo2.options[1]=null;\r\n");
      out.write("                                }\r\n");
      out.write("                                for(i=0 ; i < Co.length; i++)\r\n");
      out.write("                                {\r\n");
      out.write("                                    Combo2.options[i+1]=new Option(Co[i]);\r\n");
      out.write("                                }\r\n");
      out.write("                    \r\n");
      out.write("                            }\r\n");
      out.write("                }\r\n");
      out.write("                 function numeros()\r\n");
      out.write("             {\r\n");
      out.write("                 if(event.keyCode < 48 || event.keyCode >57)\r\n");
      out.write("                    event.returnValue = false;\r\n");
      out.write("            }\r\n");
      out.write("           </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"contenedor_carga\"><div id=\"contereal\">\r\n");
      out.write("           <div id=\"preloader_1\">\r\n");
      out.write("                <span></span>\r\n");
      out.write("            <span></span>\r\n");
      out.write("            <span></span>\r\n");
      out.write("            <span></span>\r\n");
      out.write("            <span></span>\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"principal\" disabled=\"false\">\r\n");
      out.write("        <form name=\"\"  method=\"post\" action=\"/RegistroMascota\" enctype=\"multipart/form-data\">\r\n");
      out.write("            <div class=\"dos\" id=\"derechod\">\r\n");
      out.write("                    \r\n");
      out.write("            </div>\r\n");
      out.write("                <div class=\"uno\" id=\"derecho\"><center>\r\n");
      out.write("                        <p style=\"font-family:'Eras Bold ITC'; color: #ff6600; font-size: 3.5em;\"> REGISTRA A TU MASCOTA! </p>\r\n");
      out.write("                        <input type=\"text\" id=\"nommas\" name=\"nommas\" placeholder=\"Nombre de la mascota\" style=\"width:250px; height:35px; font-size: 15px;\" maxlength=\"30\" />\r\n");
      out.write("                    <br><br>\r\n");
      out.write("                    <select id=\"Combo\" onchange=\"Agregar()\" name=\"Tipo\">\r\n");
      out.write("                        <option value=\"op\" selected>Selecciona alguna...</option>\r\n");
      out.write("                        <option value=\"Perro\">Perro</option>\r\n");
      out.write("                        <option value=\"Gato\">Gato</option>\r\n");
      out.write("                        <option value=\"Pez\">Pez</option>\r\n");
      out.write("                        <option value=\"Conejo\">Conejo</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <select id=\"Combo2\" name=\"Raza\">\r\n");
      out.write("                        <option value=\"op0\" selected> Selecciona alguna raza...</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <br> <br>\r\n");
      out.write("                    <input type=\"text\" id=\"edadmas\" name=\"edadmas\" onkeypress=\"numeros()\" placeholder=\"Edad de la mascota\" maxlength=\"3\" style=\"width:250px; height:35px; font-size: 15px;\"/>\r\n");
      out.write("                    <br> <br>\r\n");
      out.write("                    </center>\r\n");
      out.write("                    \r\n");
      out.write("                    <div id=\"contenedorsito\">\r\n");
      out.write("                    \r\n");
      out.write("                    <div id=\"radios\">\r\n");
      out.write("              <text style=\"color: white\">Macho<label for=\"Macho\"></label>\r\n");
      out.write("              <input  id=\"Macho\" name=\"radio\" type=\"radio\" value=\"Macho\"/><br><br>\r\n");
      out.write("              <text style=\"color: white\">Hembra<label for=\"Hembra\"></label>\r\n");
      out.write("              <input  id=\"Hembra\" name=\"radio\" type=\"radio\" value=\"Hembra\"/>\r\n");
      out.write("              \r\n");
      out.write("              <span id=\"slider\"></span>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("                        <div>\r\n");
      out.write("                    <textarea name=\"Descripcion\" placeholder=\"Realiza una breve descripción acerca de tu mascota.\"  maxlength=\"50\"\r\n");
      out.write("                              style=\"width: 400px; height: 150px\" ></textarea>\r\n");
      out.write("                              \r\n");
      out.write("                    <br> <br>\r\n");
      out.write("                    <input type=\"file\" name=\"data\" />\r\n");
      out.write("                    <p align=\"right\">\r\n");
      out.write("                        <input type=\"submit\" class=\"boton\" value=\"Registra\" id=\"botreg\" />\r\n");
      out.write("                    </p>\r\n");
      out.write("                \r\n");
      out.write("</div></div>\r\n");
      out.write("                <div class=\"dos\" id=\"izquierdo\">\r\n");
      out.write("                    <img src=\"I:\\Desktop\\PetPe\\build\\web\\data\\1523939545741.jpg\" width=\"500px\" alt=\"MALDITASEA\">\r\n");
      out.write("                </div>\r\n");
      out.write("                    </div>    \r\n");
      out.write("        </form>\r\n");
      out.write("        </div>\r\n");
      out.write("            \r\n");
      out.write("        <script>\r\n");
      out.write("             var contenedor=document.getElementById('contenedor_carga');\r\n");
      out.write("            window.onload=function(){\r\n");
      out.write("               \r\n");
      out.write("                contenedor.style.visivility='hidden';\r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("                contenedor.style.opacity='0';\r\n");
      out.write("            }\r\n");
      out.write("            function uno(){\r\n");
      out.write("                contenedor.remove();\r\n");
      out.write("            }\r\n");
      out.write("            setTimeout(uno, 1200);\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
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
