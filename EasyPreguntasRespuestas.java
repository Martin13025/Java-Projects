import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JuegoPreguntasRespuestas {

    public static void main(String[] args) {
        int cant = 0;
        String res;
        final String respcorrecta = "/-Respuesta Correcta-/";
        final String respincorrecta = "/-Incorrecto-/";
      
        ImageIcon[] icons = {
            new ImageIcon(JuegoPreguntasRespuestas.class.getResource("/img/bandera1.jpg")),
            new ImageIcon(JuegoPreguntasRespuestas.class.getResource("/img/bandera2.jpg")),
            new ImageIcon(JuegoPreguntasRespuestas.class.getResource("/img/bandera3.png")),
            new ImageIcon(JuegoPreguntasRespuestas.class.getResource("/img/bandera4.jpg")),
            new ImageIcon(JuegoPreguntasRespuestas.class.getResource("/img/bandera5.jpg")),
            new ImageIcon(JuegoPreguntasRespuestas.class.getResource("/img/bandera6.jpg")),
            new ImageIcon(JuegoPreguntasRespuestas.class.getResource("/img/bandera7.jpg")),
            new ImageIcon(JuegoPreguntasRespuestas.class.getResource("/img/bandera8.png")),
            new ImageIcon(JuegoPreguntasRespuestas.class.getResource("/img/bandera9.jpg")),
            new ImageIcon(JuegoPreguntasRespuestas.class.getResource("/img/bandera10.png"))
        };
        
        String[] correctAnswers = {
            "Argentina", "Mexico", "Brasil", "Chile", "Uruguay",
            "Bolivia", "Paraguay", "Peru", "Colombia", "Venezuela"
        };
        
        JOptionPane.showMessageDialog(null, "Juego Preguntas y Respuestas Tema: Banderas");

        for (int i = 0; i < icons.length; i++) {
            res = JOptionPane.showInputDialog(null, "Es la bandera de que pais?", "Pregunta", JOptionPane.QUESTION_MESSAGE, 
                    icons[i], null, null).toString();
            
            if (res.equalsIgnoreCase(correctAnswers[i])) {
                JOptionPane.showMessageDialog(null, respcorrecta);
                cant++;
            } else {
                JOptionPane.showMessageDialog(null, respincorrecta);
            }
        }
        JOptionPane.showMessageDialog(null, "Respuestas Correctas: " + cant);
    }
}
