package ej1cond;

import javax.swing.JOptionPane;

class Ej1cond {

	public static void main(String[] args) {
		int a, b, c;
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero"));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero"));
		c = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero"));
		if (a >= b && a >= c) {
			JOptionPane.showMessageDialog(null, "el mayor es: " + a);
		} else if (b >=a && b >= c){
			JOptionPane.showMessageDialog(null, "el mayor es: " + b);
		} else {
			JOptionPane.showMessageDialog(null, "el mayor es: " + c);
		}
	}

}
