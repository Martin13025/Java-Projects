package ej1cond;

import javax.swing.JOptionPane;

class Ej1cond {

	public static void main(String[] args) {
		double nota;
		
		nota=Double.parseDouble(JOptionPane.showInputDialog("ingrese nota"));
		
		if (nota>=4) {
			JOptionPane.showMessageDialog(null, "aprobado");
		} else {
			JOptionPane.showMessageDialog(null, "no aprobado");
		}

	}

}
