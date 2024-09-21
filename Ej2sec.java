package ej2sec;

import javax.swing.JOptionPane;

class Ej2sec {

	public static void main(String[] args) {
		double a,b,c,d, s, p;
		
		a=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero: "));
		b=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero: "));
		c=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero: "));
		d=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero: "));
		s=a+b+c+d;
		p=s/4;
		JOptionPane.showMessageDialog(null, "suma: " + s+ "programa: " + p);

	}

}
