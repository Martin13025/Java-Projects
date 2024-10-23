let cant = 0;

for (let i = 0; i <= 20; i++) {
    let n = Math.floor(Math.random() * 10);
    if (n === 0) {
        cant++;
    }
}

alert("Cantidad de ceros: " + cant);


