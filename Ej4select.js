tot = 0;
let c;

for (let i = 0; i < 10; i++) {
    c = (Math.random() * 12 + 1);
    console.log("Carta: " + c);
    tot = tot + c;
}
alert("Total: " + tot);
