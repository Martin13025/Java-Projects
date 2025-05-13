let radio;
let perim;
let area;

const p = 3.1416;


radio = parseFloat(prompt("Ingrese radio: "));
perim = 2 * p * radio;
area = p * (radio * radio);

alert("El perimentro es: " + perim + "\nEl area es: " + area);
