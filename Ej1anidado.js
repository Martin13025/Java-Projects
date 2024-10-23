let cat = prompt("Ingrese categoria a, b o c");
let s = parseFloat(prompt("Ingrese sueldo"));

if (cat.toLowerCase() === "a") {
    s = s * 1.15;
} else if (cat.toLowerCase() === "b") {
    s = s * 1.10;
} else if (cat.toLowerCase() === "c") {
    s = s * 1.05;
} else {
    alert("Error");
    s = 0;
}

alert("Cobra: " + s);

