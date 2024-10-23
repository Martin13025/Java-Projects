let nom = prompt("Ingrese nombre");
let anac = parseInt(prompt("Ingrese año nacimiento"));
let aa = parseInt(prompt("Ingrese año actual"));

let edad = aa - anac;
let edf = 2050 - anac;

alert(nom + " su edad es: " + edad + "\nEn el 2050: " + edf);
