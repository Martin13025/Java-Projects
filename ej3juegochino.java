import javax.swing.*;

class ej3juegochino {
    public static void main(String[] args) {
        int year = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu año de nacimiento (1960 - actual):"));
        String signoZodiacal = "";
        String imagePath = "";

        if (year >= 1960 && year <= 2024) {
            int zodiacIndex = (year - 1960) % 12;

            switch (zodiacIndex) {
                case 0 -> {
                    signoZodiacal = "Rata";
                    imagePath = "src/img/Rat.png";
                }
                case 1 -> {
                    signoZodiacal = "Buey";
                    imagePath = "src/img/Ox.png";
                }
                case 2 -> {
                    signoZodiacal = "Tigre";
                    imagePath = "src/img/Tiger.png";
                }
                case 3 -> {
                    signoZodiacal = "Conejo";
                    imagePath = "src/img/Rabbit.png";
                }
                case 4 -> {
                    signoZodiacal = "Dragón";
                    imagePath = "src/img/Dragon.png";
                }
                case 5 -> {
                    signoZodiacal = "Serpiente";
                    imagePath = "src/img/Snake.png";
                }
                case 6 -> {
                    signoZodiacal = "Caballo";
                    imagePath = "src/img/Horse.png";
                }
                case 7 -> {
                    signoZodiacal = "Cabra";
                    imagePath = "src/img/Goat.png";
                }
                case 8 -> {
                    signoZodiacal = "Mono";
                    imagePath = "src/img/Monkey.png";
                }
                case 9 -> {
                    signoZodiacal = "Gallo";
                    imagePath = "src/img/Rooster.png";
                }
                case 10 -> {
                    signoZodiacal = "Perro";
                    imagePath = "src/img/Dog.png";
                }
                case 11 -> {
                    signoZodiacal = "Cerdo";
                    imagePath = "src/img/Pig.png";
                }
                default -> {
                }
            }

            ImageIcon icon = new ImageIcon(imagePath);
            JOptionPane.showMessageDialog(null, "Tu signo zodiacal chino es: " + signoZodiacal, "Signo Zodiacal", JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            JOptionPane.showMessageDialog(null, "El año debe estar entre 1960 y el año actual.");
        }
    }
}
