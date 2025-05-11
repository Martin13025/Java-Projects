let n;

let c1 = 0;
let c2 = 0;
let c3 = 0;
let c4 = 0;

for (let i = 1; i < 100; i++) {
  n = Math.floor(Math.random() * 10);
  console.log(" - " + n);
  if (n < 25) {
    c1++;
  } else if (n < 50) {
    c2++;
  } else if (n < 75) {
    c3++;
  } else {
    c4++;
  }
}
alert("Quantity: " + c1 + " <50" + c2 + " <75" + c3 + " <100" + c4);
