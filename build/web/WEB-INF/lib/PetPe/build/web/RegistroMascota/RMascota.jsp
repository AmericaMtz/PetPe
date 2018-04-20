<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>REGISTRA A TU MASCOTA!</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <LINK REL=StyleSheet HREF="../DocumentosCSS/Estilos.css" TYPE="text/css" MEDIA=screen>
        
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
        <div id="principal" disabled="false">
        <form name=""  method="post" action="/RegistroMascota" enctype="multipart/form-data">
            <div class="dos" id="derechod">
                    
            </div>
                <div class="uno" id="derecho"><center>
                        <p style="font-family:'Eras Bold ITC'; color: #ff6600; font-size: 3.5em;"> REGISTRA A TU MASCOTA! </p>
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
                    
                    <div id="contenedorsito">
                    
                    <div id="radios">
              <text style="color: white">Macho<label for="Macho"></label>
              <input  id="Macho" name="radio" type="radio" value="Macho"/><br><br>
              <text style="color: white">Hembra<label for="Hembra"></label>
              <input  id="Hembra" name="radio" type="radio" value="Hembra"/>
              
              <span id="slider"></span>
            </div>
            
                        <div>
                    <textarea name="Descripcion" placeholder="Realiza una breve descripción acerca de tu mascota."  maxlength="50"
                              style="width: 400px; height: 150px" ></textarea>
                              
                    <br> <br>
                    <input type="file" name="data" />
                    <p align="right">
                        <input type="submit" class="boton" value="Registra" id="botreg" />
                    </p>
                
</div></div>
                <div class="dos" id="izquierdo">
                    <img src="I:\Desktop\PetPe\build\web\data\1523939545741.jpg" width="500px" alt="MALDITASEA">
                </div>
                    </div>    
        </form>
        </div>
            
        <script>
             var contenedor=document.getElementById('contenedor_carga');
            window.onload=function(){
               
                contenedor.style.visivility='hidden';
                

                contenedor.style.opacity='0';
            }
            function uno(){
                contenedor.remove();
            }
            setTimeout(uno, 1200);
        </script>
    </body>
</html>