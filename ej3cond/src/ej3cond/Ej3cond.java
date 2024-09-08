package ej3cond;

import javax.swing.JOptionPane;

class Ej3cond {

	public static void main(String[] args) {
		double m3, exc, t;
		m3=Double.parseDouble(JOptionPane.showInputDialog("ingrese cant metros cuadrados"));
		
		if (m3<150) {
			JOptionPane.showMessageDialog(null, "paga 15.80");
		} else {
			exc=m3-150;	
			t= 15.80 + exc * 1.50;
			JOptionPane.showMessageDialog(null, "paga:" + t + "$");
		}
	}
}
