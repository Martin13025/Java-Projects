package JuegoPreguntasRespuestas;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

class juegopreguntasrespuestas {

	public static void main(String[] args) {
		
		int cant;
		String res;
		final String respcorrecta="/-Respuesta Correcta-/";
		final String respincorrecta="/-Incorrecto-/";
		cant = 0;
		ImageIcon icon = new ImageIcon(juegopreguntasrespuestas.class.getResource("/img/bandera1.jpg"));
		ImageIcon icon2 = new ImageIcon(juegopreguntasrespuestas.class.getResource("/img/bandera2.jpg"));
		ImageIcon icon3 = new ImageIcon(juegopreguntasrespuestas.class.getResource("/img/bandera3.png"));
		ImageIcon icon4 = new ImageIcon(juegopreguntasrespuestas.class.getResource("/img/bandera4.jpg"));
		ImageIcon icon5 = new ImageIcon(juegopreguntasrespuestas.class.getResource("/img/bandera5.jpg"));
		ImageIcon icon6 = new ImageIcon(juegopreguntasrespuestas.class.getResource("/img/bandera6.jpg"));
		ImageIcon icon7 = new ImageIcon(juegopreguntasrespuestas.class.getResource("/img/bandera7.jpg"));
		ImageIcon icon8 = new ImageIcon(juegopreguntasrespuestas.class.getResource("/img/bandera8.png"));
		ImageIcon icon9 = new ImageIcon(juegopreguntasrespuestas.class.getResource("/img/bandera9.jpg"));
		ImageIcon icon10 = new ImageIcon(juegopreguntasrespuestas.class.getResource("/img/bandera10.png"));
		
		JOptionPane.showMessageDialog(null, "Juego Preguntas y Respuestas Tema: Banderas");
		
		//-----------------------------------------------------------//
		res = JOptionPane.showInputDialog(null, "Es la bandera de que pais?", "Pregunta", JOptionPane.QUESTION_MESSAGE, 
				icon, null, null).toString();
			
		if (res.equalsIgnoreCase("Argentina")) {
			JOptionPane.showMessageDialog(null, respcorrecta);
			cant++;
		} else {
			JOptionPane.showMessageDialog(null, respincorrecta);
		}
		//-----------------------------------------------------------//
		res = JOptionPane.showInputDialog(null, "Es la bandera de que pais?", "Pregunta", JOptionPane.QUESTION_MESSAGE, 
				icon2, null, null).toString();
		
		if (res.equalsIgnoreCase("Mexico")) {
			JOptionPane.showMessageDialog(null, respcorrecta);
			cant++;
		} else {
			JOptionPane.showMessageDialog(null, respincorrecta);
		}
		//-----------------------------------------------------------//
		res = JOptionPane.showInputDialog(null, "Es la bandera de que pais?", "Pregunta", JOptionPane.QUESTION_MESSAGE, 
				icon3, null, null).toString();
		
		if (res.equalsIgnoreCase("Brasil")) {
			JOptionPane.showMessageDialog(null, respcorrecta);
			cant++;
		} else {
			JOptionPane.showMessageDialog(null, respincorrecta);
		}
		//-----------------------------------------------------------//
		res = JOptionPane.showInputDialog(null, "Es la bandera de que pais?", "Pregunta", JOptionPane.QUESTION_MESSAGE, 
				icon4, null, null).toString();
		
		if (res.equalsIgnoreCase("Chile")) {
			JOptionPane.showMessageDialog(null, respcorrecta);
			cant++;
		} else {
			JOptionPane.showMessageDialog(null, respincorrecta);
		}
		//-----------------------------------------------------------//
		res = JOptionPane.showInputDialog(null, "Es la bandera de que pais?", "Pregunta", JOptionPane.QUESTION_MESSAGE, 
				icon5, null, null).toString();
		
		if (res.equalsIgnoreCase("Uruguay")) {
			JOptionPane.showMessageDialog(null, respcorrecta);
			cant++;
		} else {
			JOptionPane.showMessageDialog(null, respincorrecta);
		}
		//-----------------------------------------------------------//
		res = JOptionPane.showInputDialog(null, "Es la bandera de que pais?", "Pregunta", JOptionPane.QUESTION_MESSAGE, 
				icon6, null, null).toString();
		
		if (res.equalsIgnoreCase("Bolivia")) {
			JOptionPane.showMessageDialog(null, respcorrecta);
			cant++;
		} else {
			JOptionPane.showMessageDialog(null, respincorrecta);
		}
		//-----------------------------------------------------------//
		res = JOptionPane.showInputDialog(null, "Es la bandera de que pais?", "Pregunta", JOptionPane.QUESTION_MESSAGE, 
				icon7, null, null).toString();
		
		if (res.equalsIgnoreCase("Paraguay")) {
			JOptionPane.showMessageDialog(null, respcorrecta);
			cant++;
		} else {
			JOptionPane.showMessageDialog(null, respincorrecta);
		}
		//-----------------------------------------------------------//
		res = JOptionPane.showInputDialog(null, "Es la bandera de que pais?", "Pregunta", JOptionPane.QUESTION_MESSAGE, 
				icon8, null, null).toString();
		
		if (res.equalsIgnoreCase("Peru")) {
			JOptionPane.showMessageDialog(null, respcorrecta);
			cant++;
		} else {
			JOptionPane.showMessageDialog(null, respincorrecta);
		}
		//-----------------------------------------------------------//
		res = JOptionPane.showInputDialog(null, "Es la bandera de que pais?", "Pregunta", JOptionPane.QUESTION_MESSAGE, 
				icon9, null, null).toString();
		
		if (res.equalsIgnoreCase("Colombia")) {
			JOptionPane.showMessageDialog(null, respcorrecta);
			cant++;
		} else {
			JOptionPane.showMessageDialog(null, respincorrecta);
		}
		//-----------------------------------------------------------//
		res = JOptionPane.showInputDialog(null, "Es la bandera de que pais?", "Pregunta", JOptionPane.QUESTION_MESSAGE, 
				icon10, null, null).toString();
		
		if (res.equalsIgnoreCase("Venezuela")) {
			JOptionPane.showMessageDialog(null, respcorrecta);
			cant++;
		} else {
			JOptionPane.showMessageDialog(null, respincorrecta);
		}
		//-----------------------------------------------------------//
		JOptionPane.showMessageDialog(null, "Respuestas Correctas: " + cant);
	}

}
