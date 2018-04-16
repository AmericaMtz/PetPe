<%@page import="java.io.*;"%>
<%@page import="java.sql.*;"%>
<html>
    <head>
        <title>ADOPTA</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="../DocumentosCSS/MAdopta.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="../JavaScript/MAdopta.js"></script>
        <script src="../../../JavaScript/Perros.js"></script>
    </head>
    <body>
       <header>
           <nav>
               <ul>
                  <li> <a href="../PaginaPrincipal/index.html">Inicio</a></li>               </ul> 
               <img id="logo" src="../Resourses/Images/logoPP.png" >
               <ul>
                   <li><a href="../Quejas/Quejas.html">Quejas y Sugerencias</a></li>
                   <li><a href="../InicioDeSesion/InicioDeSesion.html">Cerrar Sesion</a></li>
               </ul> 
           </nav> 
        </header>
        <section id="banner">
           
        </section>
        <%
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
                out.println("<div id='openModal' class='algo'>");
              out.println("<div>");
                      out.println("<a href='#close' title='Close' class='close' onclick='close();'><div style='float: left'></div><div class='tache'><img src='../Resourses/Images/close.svg' width=3 height=2></div></a>"); 
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
              
              
              out.println("<a href='#openModal3'> <figure> <img src='../Resourses/Images/animalesAdopta/pug.jpg'></figure> </a>");
                out.println("<div id='openModal3' class='algo'>");
              out.println("<div>");
                      out.println("<a href='#close' title='Close' class='close' onclick='close();'><div style='float: left'></div><div class='tache'><img src='../Resourses/Images/close.svg' width=30 height=20></div></a>"); 
                    out.println("<div class='title'> ");
                        out.println("<h1><b>Max</b></h1></div>");
                        out.println("<br>");
                        out.println("<p> Perro - Pug</p>");
                        out.println("<br>");
                        out.println("<p> 2 año </p>");
                      out.println("<br>");
                      out.println("<img src='../Resourses/Images/animalesAdopta/pug.jpg' width=50% height=50% class='ABC'>");
                        out.println("<br>");
                        out.println("<p> Tiene la cara aplastada el perro jeje </p>");
                  out.println("</div>");
              out.println("</div>");
              
              out.println("<a href='#openModal4'> <figure> <img src='../Resourses/Images/animalesAdopta/minilop.jpg'></figure> </a>");
                out.println("<div id='openModal4' class='algo'>");
              out.println("<div>");
                      out.println("<a href='#close' title='Close' class='close' onclick='close();'><div style='float: left'></div><div class='tache'><img src='../Resourses/Images/close.svg' width=30 height=20></div></a>"); 
                    out.println("<div class='title'> ");
                        out.println("<h1><b>Bugs</b></h1></div>");
                        out.println("<br>");
                        out.println("<p> Conejo - Mini Lop</p>");
                        out.println("<br>");
                        out.println("<p> 1 año </p>");
                      out.println("<br>");
                      out.println("<img src='../Resourses/Images/animalesAdopta/minilop.jpg' width=50% height=50% class='ABC'>");
                        out.println("<br>");
                        out.println("<p> Come zanahorias  </p>");
                  out.println("</div>");
              out.println("</div>");
              
              out.println("<a href='#openModal5'> <figure> <img src='../Resourses/Images/animalesAdopta/payaso.jpg'></figure> </a>");
                out.println("<div id='openModal5' class='algo'>");
              out.println("<div>");
                      out.println("<a href='#close' title='Close' class='close' onclick='close();'><div style='float: left'></div><div class='tache'><img src='../Resourses/Images/close.svg' width=30 height=20></div></a>"); 
                    out.println("<div class='title'> ");
                        out.println("<h1><b>Nemo</b></h1></div>");
                        out.println("<br>");
                        out.println("<p> Pez - Payaso</p>");
                        out.println("<br>");
                        out.println("<p> 2 meses </p>");
                      out.println("<br>");
                      out.println("<img src='../Resourses/Images/animalesAdopta/payaso.jpg' width=50% height=50% class='ABC'>");
                        out.println("<br>");
                        out.println("<p> No hace nada </p>");
                  out.println("</div>");
              out.println("</div>");
              
              out.println("<a href='#openModal5'> <figure> <img src='../Resourses/Images/animalesAdopta/payaso.jpg'></figure> </a>");
                out.println("<div id='openModal5' class='algo'>");
              out.println("<div>");
                      out.println("<a href='#close' title='Close' class='close' onclick='close();'><div style='float: left'></div><div class='tache'><img src='../Resourses/Images/close.svg' width=30 height=20></div></a>"); 
                    out.println("<div class='title'> ");
                        out.println("<h1><b>Nemo</b></h1></div>");
                        out.println("<br>");
                        out.println("<p> Pez - Payaso</p>");
                        out.println("<br>");
                        out.println("<p> 2 meses </p>");
                      out.println("<br>");
                      out.println("<img src='../Resourses/Images/animalesAdopta/payaso.jpg' width=50% height=50% class='ABC'>");
                        out.println("<br>");
                        out.println("<p> No hace nada </p>");
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
        %>
    </body>
</html>