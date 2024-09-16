package ej1anidado;

import javax.swing.JOptionPane;

class Ej1anidado {

		public static void main(String[] args) {
			String cat;
			double s;
			
			cat=JOptionPane.showInputDialog("ingrese categoria a,b o c");
			s=Double.parseDouble(JOptionPane.showInputDialog("ingrese sueldo"));
			if (cat.equalsIgnoreCase("a")) {
				s = s * 1.15;
			} else {
				if (cat.equalsIgnoreCase("b")) {
					s = s * 1.10;
				} else {
					if (cat.equalsIgnoreCase("c")) {
						s = s * 1.05;
					} else {
						JOptionPane.showMessageDialog(null, "error"); 
						s = 0;
					}
				}
			}
			JOptionPane.showMessageDialog(null, "cobra: " + s);
	}
}
