package org.apache.jsp.InicioDeSesion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class Bienvenido_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("          \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("         \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
 
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
            
        
      out.write("\n");
      out.write("        \n");
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
