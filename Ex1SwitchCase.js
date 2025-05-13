let a;
let b;
let t = Math.floor(0);

let clave;

a = parseFloat(prompt("Ingrese numero: "));
b = parseFloat(prompt("Ingrese numero: "));
clave = parseFloat(prompt("1 suma\n2 - resta" + "\n3 - multiplicacion\n4 - division"));

switch (clave) {
    case 1: t = a + b;
        break;
    case 2: t = a - b;
        break;
    case 3: t = a * b;
        break;
    case 4: if (!b == 0) {
        t = a / b;
    } else {
        alert("No se puede dividir por 0");
    }
    break;
    default: alert("ERROR");
        break;
}
alert("El resultado es: " + t);
