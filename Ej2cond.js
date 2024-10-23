let a = parseInt(prompt("Ingrese numero"));
let b = parseInt(prompt("Ingrese numero"));
let c = parseInt(prompt("Ingrese numero"));

if (a <= b && a <= c) {
    if (b <= c) {
        alert("El orden es: " + a + "-" + b + "-" + c);
    } else {
        alert("El orden es: " + a + "-" + c + "-" + b);
    }
} else if (b <= a && b <= c) {
    if (a <= c) {
        alert("El orden es: " + b + "-" + a + "-" + c);
    } else {
        alert("El orden es: " + b + "-" + c + "-" + a);
    }
} else {
    if (a <= b) {
        alert("El orden es: " + c + "-" + a + "-" + b);
    } else {
        alert("El orden es: " + c + "-" + b + "-" + a);
    }
}

