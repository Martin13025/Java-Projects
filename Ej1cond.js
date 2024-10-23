let a = parseInt(prompt("Ingrese numero"));
let b = parseInt(prompt("Ingrese numero"));
let c = parseInt(prompt("Ingrese numero"));

if (a >= b && a >= c) {
    alert("El mayor es: " + a);
} else if (b >= a && b >= c) {
    alert("El mayor es: " + b);
} else {
    alert("El mayor es: " + c);
}

