let x=5;
let y=6;
let a=2;
let b=3;

let c=4;
let d=6;
c++;
d--;

function add(){
    document.getElementById('add-ans').innerHTML = a+b;
}

function sub(){
    document.getElementById("sub-ans").innerHTML= b-a ;
}

function mul(){
    document.getElementById("mul-ans").innerHTML= a*b ;
}

function expo(){
    document.getElementById("expo-ans").innerHTML= a**b ;
}

function div(){
    document.getElementById("div-ans").innerHTML= y/a ;
}

function mod(){
    document.getElementById("mod-ans").innerHTML= x%a ;
}

function inc(){
    document.getElementById("inc-ans").innerHTML= c ;
}

function dec(){
    document.getElementById("dec-ans").innerHTML= d ;}