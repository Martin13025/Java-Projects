let invoiceCount = 0; 
let initialReading, finalReading, totalKv = 0, consumption; 
let totalAmount, totalCost = 0; 
let clientType, clientName; 

clientName = prompt("Ingrese nombre / * para terminar");

while (clientName !== "*") {
    totalAmount = 0;
    consumption = 0;
    clientType = prompt("Ingrese tipo cliente A,B,C,D * para terminar");
    if (clientType === "*") {
        break;
    }

    initialReading = parseInt(prompt("Ingrese registro inicial"));
    finalReading = parseInt(prompt("Ingrese registro final"));
    consumption = finalReading - initialReading;

    if (clientType.toUpperCase() === "A" || clientType.toUpperCase() === "C") {
        if (consumption < 140) {
            totalAmount = consumption * 3.2;
        } else if (consumption < 300) {
            totalAmount = consumption * 4;
        } else {
            totalAmount = consumption * 4.5;
        }
        invoiceCount++;
        totalCost += totalAmount;
        totalKv += consumption;
    } else if (clientType.toUpperCase() === "B" || clientType.toUpperCase() === "D") {
        if (consumption < 200) {
            totalAmount = consumption * 4.5;
        } else {
            totalAmount = consumption * 5.3;
        }
        invoiceCount++;
        totalCost += totalAmount;
        totalKv += consumption;
    } else {
        alert("ERROR!");
    }

    clientName = prompt("Ingrese nombre / * para terminar");
}

alert("Total $ " + totalCost + "\nTotal kv: " + totalKv + "\nCant facturas: " + invoiceCount);





