package ej5conc;

import javax.swing.JOptionPane;

class Ej5connc {

	public static void main(String[] args) {
		int cant;
		String res;
		final String respcorrecta="**** Respuesta Correcta******";
		final String respincor="///// Incorrecto //////";
		cant=0;
		JOptionPane.showMessageDialog(null, "ping pong de preguntas");
		res=JOptionPane.showInputDialog("RAIZ CUADRADA DE 144?");
		if (res.equals("12")) {
			JOptionPane.showMessageDialog(null, respcorrecta);
			cant++;
		} else {
			JOptionPane.showMessageDialog(null, respincor);
		}
		res=JOptionPane.showInputDialog("quien fundo bs as?");
		if (res.equalsIgnoreCase("Garay")) {
			JOptionPane.showMessageDialog(null, respcorrecta);
			cant++;
		} else {
			JOptionPane.showMessageDialog(null, respincor);
		}
		res=JOptionPane.showInputDialog("capital de francia");
		if (res.equalsIgnoreCase("Paris")) {
			JOptionPane.showMessageDialog(null, respcorrecta);
			cant++;
		} else {
			JOptionPane.showMessageDialog(null, respincor);
		}
		JOptionPane.showMessageDialog(null, "respuestas correctas: " + cant);
	}
}
