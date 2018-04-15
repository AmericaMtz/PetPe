function validarPasswd(){
    var p1 = document.getElementById("con").value;
    var p2 = document.getElementById("concom").value;
    if(p1 === p2){
        return true;
    }
    else
        alert("Las contraseñas no coinciden");
        return false;
}

function letras(){
    var letras = " abcdefghijklmnñopqrstuvwxyz";
    var x = event.keyCode;
    var letra = String.fromCharCode(x);
    var n = letras.indexOf(letra);
    var texto = noms.value;
    if (letra === ' '){
        if(texto.indexOf(' ') !== -1)
            event.returnValue = false;
    }
    if (n===-1)
        event.returnValue= false;
}