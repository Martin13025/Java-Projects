import javax.swing.*;
import java.io.File;

public class ej2pers {
    public static void main(String[] args) {
        boolean playAgain;
        do {
            int isFemaleOption = JOptionPane.showConfirmDialog(null, "¿Tu personaje es una mujer?", "Pregunta 1", JOptionPane.YES_NO_OPTION);
            boolean isFemale = (isFemaleOption == JOptionPane.YES_OPTION);

            int canFlyOption = JOptionPane.showConfirmDialog(null, "¿Tu personaje puede volar?", "Pregunta 2", JOptionPane.YES_NO_OPTION);
            boolean canFly = (canFlyOption == JOptionPane.YES_OPTION);

            int wearsCapeOption = JOptionPane.showConfirmDialog(null, "¿Tu personaje usa capa?", "Pregunta 3", JOptionPane.YES_NO_OPTION);
            boolean wearsCape = (wearsCapeOption == JOptionPane.YES_OPTION);

            String characterName = "No se encontró el personaje.";
            String imagePath = null;
            
            if (isFemale && canFly && !wearsCape) {
                characterName = "Wonder Woman";
                imagePath = "src/img/Wonder Woman.png";
            } else if (isFemale && !canFly && !wearsCape) {
                characterName = "Black Widow";
                imagePath = "src/img/Black Widow.png";
            } else if (isFemale && !canFly && wearsCape) {
                characterName = "Catwoman";
                imagePath = "src/img/Catwoman.png";
            } else if (!isFemale && canFly && wearsCape) {
                characterName = "Superman";
                imagePath = "src/img/Superman.png";
            } else if (!isFemale && !canFly && wearsCape) {
                characterName = "Batman";
                imagePath = "src/img/Batman.png";
            } else if (!isFemale && canFly && !wearsCape) {
                characterName = "Iron Man";
                imagePath = "src/img/Iron Man.png";
            } else if (!isFemale && !canFly && !wearsCape) {
                characterName = "Spider-Man";
                imagePath = "src/img/Spider-Man.png";
            } else if (!isFemale && !canFly && wearsCape) {
                characterName = "Thor";
                imagePath = "src/img/Thor.png";
            }

            
            ImageIcon characterImage = null;
            if (imagePath != null && new File(imagePath).exists()) {
                characterImage = new ImageIcon(imagePath);
            }

            
            if (characterImage != null) {
                JOptionPane.showMessageDialog(null, "Tu personaje es: " + characterName, "Personaje encontrado", JOptionPane.INFORMATION_MESSAGE, characterImage);
            } else {
                JOptionPane.showMessageDialog(null, "Tu personaje es: " + characterName + "\n(Imagen no encontrada)");
            }

            int playAgainOption = JOptionPane.showConfirmDialog(null, "¿Quieres jugar de nuevo?", "Repetir juego", JOptionPane.YES_NO_OPTION);
            playAgain = (playAgainOption == JOptionPane.YES_OPTION);

        } while (playAgain);

        JOptionPane.showMessageDialog(null, "¡Gracias por jugar!");
    }
}

