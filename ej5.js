let numero1 = 10;
let numero2 = 2;
console.log(dividirSiMayor(numero1, numero2));

function dividirSiMayor(a, b) {
    if (a > b && b !== 0) {
        return (a / b).toString();
    } else {
        return "No se puede realizar la división";
    }
}

