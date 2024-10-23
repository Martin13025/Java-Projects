let ch = parseFloat(prompt("Ingrese cant horas"));
let vh = parseFloat(prompt("Ingrese valor por hora"));

let sb = ch * vh;
let os = sb * 0.07;
let jub = sb * 0.10;
let sn = sb - os - jub;

alert("***** Recibo de sueldo ****** \nSueldo bruto: " + sb + "\nDescuento obra social: " + os + "\nDescuento jubilación: " + jub + "\nSueldo neto a cobrar: " + sn);

