let n1;
let n2;
let n3;
let prom;
let mat;

n1 = parseFloat(prompt("Ingrese nota: "));
n2 = parseFloat(prompt("Ingrese nota: "));
n3 = parseFloat(prompt("Ingrese nota: "));
mat = parseFloat(prompt("Ingrese marticula: "));

prom = (n1 + n2 + n3) / 3;
alert("Matricula: " + mat + "\nPromedio: " + prom);
