let ch = parseFloat(prompt("Ingrese cant horas"));
let che = parseFloat(prompt("Ingrese cant horas"));
let cat = parseInt(prompt("Ingrese categoria 1, 2, 3"));

let ph, phe;

switch (cat) {
    case 1:
        ph = 14;
        phe = 20.5;
        break;
    case 2:
        ph = 17;
        phe = 24;
        break;
    case 3:
        ph = 21;
        phe = 34;
        break;
    default:
        ph = 0;
        phe = 0;
        alert("Error");
        break;
}

if (che > 30) {
    phe *= 0.93;
}

let s = ch * ph + che * phe;

alert("Cobra: " + s);

