import javax.swing.*;

public class Juegos {

    public static void main(String[] args) {
        String opcion;
        ImageIcon inicioImage = new ImageIcon(Juegos.class.getResource("/imgs/MAIN.png"));
        JOptionPane.showMessageDialog(null, "Bienvenido al menú de juegos", "Inicio del Juego", JOptionPane.INFORMATION_MESSAGE, inicioImage);
        do {
            opcion = JOptionPane.showInputDialog("Selecciona un juego:\n1. Juego de vasos\n2. Mini envido\n3. Tiro al pato\n4. Salir");

            switch (opcion) {
                case "1":  // Juego de vasos
                    int bolaPosicion = (int) (Math.random() * 3) + 1;  
                    ImageIcon imagen = null;
                    String input = JOptionPane.showInputDialog("¿En qué vaso está el balón? (1, 2 o 3)");
                    int eleccion = Integer.parseInt(input);
                    if (bolaPosicion == 1) {
                        imagen = new ImageIcon(Juegos.class.getResource("/imgs/otro.jpeg"));
                    } else if (bolaPosicion == 2) {
                        imagen = new ImageIcon(Juegos.class.getResource("/imgs/2.jpg"));
                    } else {
                        imagen = new ImageIcon(Juegos.class.getResource("/imgs/3.jpeg"));
                    }
                    JOptionPane.showMessageDialog(null, "El balón está en el vaso " + bolaPosicion, "Resultado", JOptionPane.INFORMATION_MESSAGE, imagen);
                    if (eleccion == bolaPosicion) {
                        JOptionPane.showMessageDialog(null, "¡Ganaste! La apuesta se duplica.", "Victoria", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Perdiste. El balón no estaba en el vaso que elegiste.", "Derrota", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                
                case "2":  // Mini envido
                    int carta1 = (int) (Math.random() * 10) + 1;
                    int carta2 = (int) (Math.random() * 10) + 1;
                    int carta3 = (int) (Math.random() * 10) + 1;
                    String palo1 = obtenerPaloAleatorio();
                    String palo2 = obtenerPaloAleatorio();
                    String palo3 = obtenerPaloAleatorio();
                    ImageIcon imagen1 = new ImageIcon(Juegos.class.getResource("/imgs/" + palo1 + carta1 + ".png"));
                    ImageIcon imagen2 = new ImageIcon(Juegos.class.getResource("/imgs/" + palo2 + carta2 + ".png"));
                    ImageIcon imagen3 = new ImageIcon(Juegos.class.getResource("/imgs/" + palo3 + carta3 + ".png"));
                    JOptionPane.showMessageDialog(null, "Carta 1: " + palo1 + carta1, "Cartas", JOptionPane.INFORMATION_MESSAGE, imagen1);
                    JOptionPane.showMessageDialog(null, "Carta 2: " + palo2 + carta2, "Cartas", JOptionPane.INFORMATION_MESSAGE, imagen2);
                    JOptionPane.showMessageDialog(null, "Carta 3: " + palo3 + carta3, "Cartas", JOptionPane.INFORMATION_MESSAGE, imagen3);
                    boolean gano = false;
                    if (carta1 == carta2 || carta2 == carta3 || carta1 == carta3 || palo1.equals(palo2) || palo2.equals(palo3) || palo1.equals(palo3)) {
                        gano = true;
                    }
                    if (gano) {
                        JOptionPane.showMessageDialog(null, "¡Ganaste! Hay dos cartas del mismo número o palo.", "Victoria", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        int suma = carta1 + carta2 + carta3;
                        if (suma > 30) {
                            JOptionPane.showMessageDialog(null, "La suma de tus cartas es mayor que 30. ¡Te devolvemos el dinero!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Perdiste. Tu puntaje es: " + suma, "Derrota", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    break;
                
                case "3":  // Tiro al pato
                    int puntos = 0;
                    for (int i = 0; i < 3; i++) {  
                        int pato = (int) (Math.random() * 6) + 1; 
                        ImageIcon patoImage;
                        int puntosPorPato = 0;
                        if (pato == 1 || pato == 2 || pato == 3) {
                            puntosPorPato = 0;  
                            patoImage = new ImageIcon(Juegos.class.getResource("/imgs/pato0.png"));
                        } else if (pato == 4 || pato == 5) {
                            puntosPorPato = 5;  
                            patoImage = new ImageIcon(Juegos.class.getResource("/imgs/pato5.png"));
                        } else {
                            puntosPorPato = 10;  
                            patoImage = new ImageIcon(Juegos.class.getResource("/imgs/pato10.png"));
                        }
                        puntos += puntosPorPato;
                        JOptionPane.showMessageDialog(null, "Disparaste a un pato con " + puntosPorPato + " puntos.", "Pato disparado", JOptionPane.INFORMATION_MESSAGE, patoImage);
                    }
                    if (puntos > 20) {
                        JOptionPane.showMessageDialog(null, "¡Ganaste! Tu puntaje es: " + puntos, "Victoria", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Perdiste. Tu puntaje es: " + puntos, "Derrota", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                
                case "4":
                    JOptionPane.showMessageDialog(null, "¡Gracias por jugar!", "Fin del Juego", JOptionPane.INFORMATION_MESSAGE);
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intenta de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (!"4".equals(opcion));
    }

    public static String obtenerPaloAleatorio() {
        int randomPalo = (int) (Math.random() * 4);
        if (randomPalo == 0) {
            return "Espada";
        } else if (randomPalo == 1) {
            return "Basto";
        } else if (randomPalo == 2) {
            return "Oro";
        } else {
            return "Copa";
        }
    }
}






