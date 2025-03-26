let a;
let b;
let prom;
let answer;

do {
    a = parseFloat(prompt("ingrese numero"));
    b = parseFloat(prompt("ingrese numero"));
    prom = (a + b) / 2;
    alert("promedio " + prom);
    answer = prompt("desea calcular otro?");
} while (answer.toLowerCase() === "si");
