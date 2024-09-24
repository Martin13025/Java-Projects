package ej2cond;

import javax.swing.JOptionPane;

class Ej2cond {

	public static void main(String[] args) {
		int a, b, c;
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero"));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero"));
		c = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero"));
		if (a <= b && a <= c) {
			if (b <= c) {
				JOptionPane.showMessageDialog(null, "el orden es: " + a + "-" + b + "-" + c);
			} else {
				JOptionPane.showMessageDialog(null, "el orden es: " + a + "-" + c + "-" + b);
			}
		} else {
			if (b <= a && b <= c) {
				if (a <= c) {
					JOptionPane.showMessageDialog(null, "el orden es: " + b + "-" + a + "-" + c);
				} else {
					JOptionPane.showMessageDialog(null, "el orden es: " + b + "-" + c + "-" + a);
				}
			} else {
				if (a <= b) {
					JOptionPane.showMessageDialog(null, "el orden es: " + c + "-" + c + "-" + b);
				} else {
					JOptionPane.showMessageDialog(null, "el orden es: " + c + "-" + b + "-" + a);
				}
			}
		}
	}

}
