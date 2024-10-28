package ej2;

import javax.swing.JOptionPane;

class Ej2 {

	public static void main(String[] args) {
		double a, prom, b;
		String res;
		prom = 0;
		
		do {
			a = Double.parseDouble(JOptionPane.showInputDialog("ingrese numero"));
			b = Double.parseDouble(JOptionPane.showInputDialog("ingrese numero"));
			prom = (a + b) / 2;
			JOptionPane.showMessageDialog(null, "proedio " + prom);
			res = JOptionPane.showInputDialog("desea calcular otro?");
		} while (res.equalsIgnoreCase("si"));

	}

}
