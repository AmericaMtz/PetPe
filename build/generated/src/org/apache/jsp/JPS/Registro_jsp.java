package org.apache.jsp.JPS;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;;
import java.sql.*;;

public final class Registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

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
            out.println(nom+", "+appat+", "+apmat+", "+correo+", "+cel+", "+nick+", "+contra+", "+colo+", "+dele);
            
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
                
                CallableStatement ps = con.prepareCall("{AltasP(?,?,?,?,?,?,?,?,?,?)}");
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
                    ps.registerOutParameter("resu", Types.INTEGER);
                    ps.execute();
                    int resultado = ps.getInt("resu");
                    
                    out.println(resultado);

                }catch(SQLException error) {
                    out.print(error.toString());
                }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
