const correctAnswerMessage = "/-Respuesta Correcta-/";
const incorrectAnswerMessage = "/-Incorrecto-/";

const icons = [
    "img/bandera1.jpg",
    "img/bandera2.jpg",
    "img/bandera3.png",
    "img/bandera4.jpg",
    "img/bandera5.jpg",
    "img/bandera6.jpg",
    "img/bandera7.jpg",
    "img/bandera8.png",
    "img/bandera9.jpg",
    "img/bandera10.png"
];

const correctAnswers = [
    "Argentina", "Mexico", "Brasil", "Chile", "Uruguay",
    "Bolivia", "Paraguay", "Peru", "Colombia", "Venezuela"
];

let correctCount = 0;

function askQuestion(index) {
    return new Promise((resolve) => {
        const flagImage = document.createElement("img");
        flagImage.src = icons[index];
        flagImage.alt = "Flag";

        const questionContainer = document.createElement("div");
        questionContainer.appendChild(flagImage);

        const answerInput = prompt(`Es la bandera de que pais?`, "");
        resolve(answerInput);
    });
}

async function startGame() {
    alert("Juego Preguntas y Respuestas Tema: Banderas");

    for (let i = 0; i < icons.length; i++) {
        const userAnswer = await askQuestion(i);

        if (userAnswer && userAnswer.toLowerCase() === correctAnswers[i].toLowerCase()) {
            alert(correctAnswerMessage);
            correctCount++;
        } else {
            alert(incorrectAnswerMessage);
        }
    }
    alert(`Respuestas Correctas: ${correctCount}`);
}


startGame();

