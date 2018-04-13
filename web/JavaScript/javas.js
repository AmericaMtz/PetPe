function letras(){
                var letras=" abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
                var x=event.keyCode;
                var letra=String.fromCharCode(x);
                var n=letras.indexOf(letra);
                if(n=== -1)
                    event.returnValue=false; 
            }
           
function corre(){
    var x = event.keyCode;
    var y = String.fromCharCode(x);
    var texto = correo.value;
    if (y === '.'){
        if(texto.indexOf('.') !== -1)
            event.returnValue = false;
    }
    if (y === '@'){
        if(texto.indexOf('@') !== -1)
            event.returnValue = false;
    }
}

function contrahabi(){
    dato = document.getElementById("con").value;
    if(dato !== ""){
        document.getElementById("concom").disabled = false;
    }
}

function confirma(){
    uno = document.getElementById("con").value;
    dos = document.getElementById("concom").value;
    if(uno !== dos){
        alert("la contraseña no coincide");
    }
    else
        alert("contraseña aceptada");
}

function app(){
    var letras = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    var x = event.keyCode;
    var letra = String.fromCharCode(x);
    var n = letras.indexOf(letra);
    if (n===-1)
        event.returnValue= false;
}
         
function nume(){
    var numeros = "1234567890";
    var x = event.keyCode;
    var numero = String.fromCharCode(x);
    var n = numeros.indexOf(numero);
    if (n===-1)
        event.returnValue= false;
}



