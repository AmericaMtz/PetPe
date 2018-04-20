<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>REGISTRA A TU MASCOTA!
        </title>
        <link rel="shortcut icon" type="image/png" href="../Resourses/Images/logoPP.png"/>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <LINK REL=StyleSheet HREF="../DocumentosCSS/Estilos1.css" TYPE="text/css" MEDIA=screen>
        
        <script type="text/javascript" src="../JavaScript/tcal.js"></script> 
           
           <script >
           var dato;
            function Agregar()
            { 
                dato= Combo.options[Combo.selectedIndex].value;
           
                if(dato === 'Perro')
                {
                    Pe=["Schnauzer","Pug","Chihuahua", "Salchicha", "Husky", "BÃ³xer", "Beagle"];
                    var cuantos= Combo2.length;
                    var contador = 0;  
                    for(contador=1; contador<= cuantos; contador++)
                    {
                        Combo2.options[1]=null;
                    }
                    for(i=0 ; i < Pe.length; i++)
                    {
                        Combo2.options[i+1]=new Option(Pe[i]);
                    }
                    
                }
                    if(dato === 'Gato')
                    {
                        Ga=["SiÃ¡mes", "Ragdoll", "Bengala", "Azul ruso", "BurmÃ©s", "Egipcio", "Korat"];
                        var cuantos= Combo2.length;
                        var contador = 0;
                        for(contador=1; contador<= cuantos; contador++)
                        {
                            Combo2.options[1]=null;
                        }
                        for(i=0 ; i < Ga.length; i++){
                        Combo2.options[i+1]=new Option(Ga[i]);
                    }
                    
                    }

                        if(dato === 'Pez')
                        {
                            Pe=["Betta", "Tetra NeÃ³n", "Payaso", "Joya", "Ãngel", "LimÃ³n", "Guppys"];
                            var cuantos= Combo2.length;
                            var contador = 0;
                            for(contador=1; contador<= cuantos; contador++)
                            {
                                Combo2.options[1]=null;
                            }
                            for(i=0 ; i < Pe.length; i++)
                            {
                                Combo2.options[i+1]=new Option(Pe[i]);
                            }
                        }
                            if(dato === 'Conejo')
                            {
                                Co=["Californiano", "Cabeza de LeÃ³n", "Mini Rex", "Mini Lop", "Holandes"];
                                var cuantos= Combo2.length;
                                var contador = 0;
                                for(contador=1; contador<= cuantos; contador++)
                                {
                                    Combo2.options[1]=null;
                                }
                                for(i=0 ; i < Co.length; i++)
                                {
                                    Combo2.options[i+1]=new Option(Co[i]);
                                }
                    
                            }
                }
                 function numeros()
             {
                 if(event.keyCode < 48 || event.keyCode >57)
                    event.returnValue = false;
            }
           </script>
    </head>
    
    
            <body>
                
                <div id="contenedor_carga"><div id="contereal">
            <div id="preloader_1">
                <span></span>
            <span></span>
            <span></span>
            <span></span>
            <span></span>
            </div>
            </div>
                </div>
        <form name=""  method="post" action="/RegistroMascota" enctype="multipart/form-data">
            <div class="dos" id="derechod">
                    
            </div>
                <div class="uno" id="derecho"><center>
                        <p  style="font-family:'Eras Bold ITC'; color: #ff6600; font-size: 3.5em;"> REGISTRA A TU MASCOTA! </p>
                        <input type="text" id="nommas" name="nommas" placeholder="Nombre de la mascota" style="width:250px; height:35px; font-size: 15px;" maxlength="30" />
                    <br><br>
                    <select id="Combo" onchange="Agregar()" name="Tipo">
                        <option value="op" selected>Selecciona alguna...</option>
                        <option value="Perro">Perro</option>
                        <option value="Gato">Gato</option>
                        <option value="Pez">Pez</option>
                        <option value="Conejo">Conejo</option>
                    </select>
                    <select id="Combo2" name="Raza">
                        <option value="op0" selected> Selecciona alguna raza...</option>
                    </select>
                    <br> <br>
                    <input type="text" id="edadmas" name="edadmas" onkeypress="numeros()" placeholder="Edad de la mascota" maxlength="3" style="width:250px; height:35px; font-size: 15px;"/>
                    <br> <br>
                    </center>
                    <div id="radios">
              <label for="Macho"></label>
              <input  id="Macho" name="radio" type="radio" value="Macho"/>Macho<br><br>
              <label for="Hembra"></label>
              <input  id="Hembra" name="radio" type="radio" value="Hembra"/>Hembra<br>
              
              
              <span id="slider"></span>
            </div>
                    <center><div>
                    <textarea name="Descripcion" placeholder="Realiza una breve descripción acerca de tu mascota."  maxlength="50"
                              style="width: 400px; height: 150px" ></textarea>
                    <br> <br>
                    
                    
                    <input type="file" name="data" />
                    <p align="right">
                        <input type="submit" class="boton" value="Registra" id="botreg" />
                    </p>
                        </div></center>
                    </div>
                
                
        </form>
                <script>
            var contenedor=document.getElementById('contenedor_carga');
            window.onload=function(){
                contenedor.style.visivility='hidden';
                contenedor.style.opacity='0';
                setTimeout(uno,1200);
            }
            function uno(){
                contenedor.style.display='none';
            }
            
        </script>
    </body>
</html>