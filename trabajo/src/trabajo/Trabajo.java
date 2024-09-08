package trabajo;

import javax.swing.JOptionPane;

class Trabajo {

	public static void main(String[] args) {
		String dia;
		
		dia=JOptionPane.showInputDialog("ingrese dia en palabras");
		if (dia.equalsIgnoreCase("domingo")) {
			JOptionPane.showMessageDialog(null, "no se trabaja");
		} else {
			JOptionPane.showMessageDialog(null, "se trabaja");
		}
	}
}
