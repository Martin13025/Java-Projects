import javax.swing.*;
import java.net.URL;

public class juegozodiac {
    public static void main(String[] args) {
        String diaStr = JOptionPane.showInputDialog("Ingrese su día de nacimiento (1-31):");
        String mesStr = JOptionPane.showInputDialog("Ingrese su mes de nacimiento (1-12):");

        try {
            int dia = Integer.parseInt(diaStr);
            int mes = Integer.parseInt(mesStr);

            if (esFechaValida(dia, mes)) {
                String signo = obtenerSignoZodiacal(dia, mes);
                String caracteristicas = obtenerCaracteristicas(signo);
                ImageIcon icono = obtenerIcono(signo);

                String mensaje = "Tu signo zodiacal es: " + signo + "\n" + caracteristicas;
                JOptionPane.showMessageDialog(null, mensaje, "Tu signo zodiacal", JOptionPane.INFORMATION_MESSAGE, icono);
            } else {
                JOptionPane.showMessageDialog(null, "Fecha incorrecta. Por favor, inténtalo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static boolean esFechaValida(int dia, int mes) {
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (dia < 1 || dia > 31) {
            return false;
        }
        if (mes == 2) {
            return dia <= 29; 
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return dia <= 30;
        }
        return true;
    }

    public static String obtenerSignoZodiacal(int dia, int mes) {
        if (mes == 1 && dia >= 21 || mes == 2 && dia <= 18) return "acuario";
        if (mes == 2 && dia >= 19 || mes == 3 && dia <= 20) return "pisces"; 
        if (mes == 3 && dia >= 21 || mes == 4 && dia <= 20) return "aries";
        if (mes == 4 && dia >= 21 || mes == 5 && dia <= 21) return "tauro";
        if (mes == 5 && dia >= 22 || mes == 6 && dia <= 21) return "géminis";
        if (mes == 6 && dia >= 22 || mes == 7 && dia <= 22) return "cáncer";
        if (mes == 7 && dia >= 23 || mes == 8 && dia <= 23) return "leo";
        if (mes == 8 && dia >= 24 || mes == 9 && dia <= 23) return "virgo";
        if (mes == 9 && dia >= 24 || mes == 10 && dia <= 23) return "libra";
        if (mes == 10 && dia >= 24 || mes == 11 && dia <= 22) return "escorpión";
        if (mes == 11 && dia >= 23 || mes == 12 && dia <= 21) return "sagitario";
        return "capricornio";
    }

    public static String obtenerCaracteristicas(String signo) {
        if (signo.equals("acuario")) return "Interesante, original, independiente.";
        if (signo.equals("pisces")) return "Sensitivo, intuitivo, soñador."; 
        if (signo.equals("aries")) return "Dinámico, seguro, decidido.";
        if (signo.equals("tauro")) return "Práctico, confiable, estable.";
        if (signo.equals("géminis")) return "Comunicativo, adaptable, curioso.";
        if (signo.equals("cáncer")) return "Emocional, cariñoso, protector.";
        if (signo.equals("leo")) return "Seguro, generoso, carismático.";
        if (signo.equals("virgo")) return "Analítico, práctico, detallista.";
        if (signo.equals("libra")) return "Diplomático, equilibrado, social.";
        if (signo.equals("escorpión")) return "Apasionado, decidido, perceptivo.";
        if (signo.equals("sagitario")) return "Optimista, independiente, filosófico.";
        if (signo.equals("capricornio")) return "Disciplinado, responsable, ambicioso.";
        return "Signo desconocido.";
    }

    public static ImageIcon obtenerIcono(String signo) {
        
        String pngPath = "/img/" + signo.toLowerCase() + ".png";
        URL pngResource = juegozodiac.class.getResource(pngPath);

        if (pngResource != null) {
            return new ImageIcon(pngResource);
        }

        
        String jpgPath = "/img/" + signo.toLowerCase() + ".jpg";
        URL jpgResource = juegozodiac.class.getResource(jpgPath);

        if (jpgResource != null) {
            return new ImageIcon(jpgResource);
        }

        
        System.err.println("Error: recurso no encontrado para " + signo);
        return null;
    }
}
