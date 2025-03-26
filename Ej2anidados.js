let a;
let b;
let c;

let t;

a = parseInt(prompt("Ingrese numero"));
b = parseInt(prompt("Ingrese numero"));
c = parseInt(prompt("Ingrese numero"));

if (a > b) {
    if (a < c) {
        t = a + b + c;
    } else {
        t = a * b * c;
    }
} else {
    t = a * b * c;
}
alert("Resultado: " + t);
