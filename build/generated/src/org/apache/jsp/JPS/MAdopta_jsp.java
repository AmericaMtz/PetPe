package org.apache.jsp.JPS;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;;
import java.sql.*;;

public final class MAdopta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>ADOPTA</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../DocumentosCSS/MAdopta.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"../JavaScript/MAdopta.js\"></script>\n");
      out.write("        <script src=\"../../../JavaScript/Perros.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <header>\n");
      out.write("           <nav>\n");
      out.write("               <ul>\n");
      out.write("                  <li> <a href=\"../PaginaPrincipal/index.html\">Inicio</a></li>               </ul> \n");
      out.write("               <img id=\"logo\" src=\"../Resourses/Images/logoPP.png\" >\n");
      out.write("               <ul>\n");
      out.write("                   <li><a href=\"../Quejas/Quejas.html\">Quejas y Sugerencias</a></li>\n");
      out.write("                   <li><a href=\"../InicioDeSesion/InicioDeSesion.html\">Cerrar Sesion</a></li>\n");
      out.write("               </ul> \n");
      out.write("           </nav> \n");
      out.write("        </header>\n");
      out.write("        <section id=\"banner\">\n");
      out.write("           \n");
      out.write("        </section>\n");
      out.write("        ");

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
        
        out.println("<div id='conteframe'>"); 
        
            out.println("<a href='#openModal'> <figure><img src='../Resourses/Images/animalesAdopta/schnauzer.jpg'></figure> </a>");
            out.println("<p class='texto'><a href='#openModal</a></p></div>");
                out.println("<div id='openModal' class='algo'>");
              out.println("<div>");
                      out.println("<a href='#close' title='Close' class='close' onclick='close();'><div style='float: left'></div><div class='tache'><img src='../Resourses/Images/close.svg' width=30 height=20></div></a>"); 
                    out.println("<div class='title'> ");
                        out.println("<h1><b>BLACKY</b></h1></div>");
                        out.println("<br>");
                        out.println("<p> Perro - Schnauzer </p>");
                        out.println("<br>");
                        out.println("<p> 9 AÑOS </p>");
                      out.println("<br>");
                      out.println("<img src='../Resourses/Images/animalesAdopta/schnauzer.jpg' width=50% height=50% class='ABC'>");
                        out.println("<br>");
                        out.println("<p> Ella es Blacky, es prieta y le gusta comer jeje </p>");
                  out.println("</div>");
              out.println("</div>");
              
              out.println("<a href='#openModal2'> <figure> <img src='../Resourses/Images/animalesAdopta/siames.jpg'></figure> </a>");
            out.println("<p class='texto' hidden><a href='#openModal2'>siames</a></p></div>");
                out.println("<div id='openModal2' class='algo'>");
              out.println("<div>");
                      out.println("<a href='#close' title='Close' class='close' onclick='close();'><div style='float: left'></div><div class='tache'><img src='../Resourses/Images/close.svg' width=30 height=20></div></a>"); 
                    out.println("<div class='title'> ");
                        out.println("<h1><b>Kukun</b></h1></div>");
                        out.println("<br>");
                        out.println("<p> Gato - Siames</p>");
                        out.println("<br>");
                        out.println("<p> 1 año </p>");
                      out.println("<br>");
                      out.println("<img src='../Resourses/Images/animalesAdopta/siames.jpg' width=50% height=50% class='ABC'>");
                        out.println("<br>");
                        out.println("<p> Esta bonito jeje </p>");
                  out.println("</div>");
              out.println("</div>");
              
            /*out.println("<figure><img src='../Resourses/Images/animalesAdopta/10.jpg'></figure>");
            out.println("<figure><img src='../Resourses/Images/animalesAdopta/11.jpg'></figure>");
            out.println("<figure><img src='../Resourses/Images/animalesAdopta/12.jpg'></figure>");
            out.println("<figure><img src='../Resourses/Images/animalesAdopta/13.jpg'></figure>");
            out.println("<figure><img src='../Resourses/Images/animalesAdopta/14.jpg'></figure>");
            out.println("<figure><img src='../Resourses/Images/animalesAdopta/15.jpg'></figure>");
            out.println("<figure><img src='../Resourses/Images/animalesAdopta/2.jpg'></figure>");
            out.println("<figure><img src='../Resourses/Images/animalesAdopta/3.jpg'></figure>");
            out.println("<figure><img src='../Resourses/Images/animalesAdopta/4.jpg'></figure>");
            out.println("<figure><img src='../Resourses/Images/animalesAdopta/5.jpg'></figure>");
            out.println("<figure><img src='../Resourses/Images/animalesAdopta/6.jpg'></figure>");
            out.println("<figure><img src='../Resourses/Images/animalesAdopta/7.jpg'></figure>");
            out.println("<figure><img src='../Resourses/Images/animalesAdopta/8.jpg'></figure>");
            out.println("<figure><img src='../Resourses/Images/animalesAdopta/9.jpg'></figure>"); */
        out.println("</div>");
        
      out.write("\n");
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
