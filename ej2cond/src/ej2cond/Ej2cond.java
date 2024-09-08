package ej2cond;

import javax.swing.JOptionPane;

class Ej2cond {
	public static void main(String[] args) {
		String cat;
		double s;
		cat=JOptionPane.showInputDialog("ingrese categoria a o b");
		s=Double.parseDouble(JOptionPane.showInputDialog("ingrese sueldo"));
		if (cat.equalsIgnoreCase("a")) {
			s=s*1.02;
		} else {
			s=s*1.05;
		}
		JOptionPane.showMessageDialog(null, "cobra: " + s);
	}
}
