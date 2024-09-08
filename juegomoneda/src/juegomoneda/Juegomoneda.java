package juegomoneda;

import javax.swing.JOptionPane;

class Juegomoneda {

	public static void main(String[] args) {
		int m;
		
		m=Integer.parseInt(JOptionPane.showInputDialog("aprobado"));
		
		if (m==0) {
			JOptionPane.showMessageDialog(null, "tienen parcialito");
		} else {
			JOptionPane.showMessageDialog(null, "la profe trae caramelos");
		}

	}

}
