package ej2anidados;

import javax.swing.JOptionPane;

class Ej2anidados {

	public static void main(String[] args) {
		int a,b,c,t;
		
		a=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
		b=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
		c=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
		if (a>b) {
			if (a<c) {
				t=a+b+c;
			} else {
				t=a*b*c;
			}
		} else {
			t=a*b*c;
		}
		JOptionPane.showMessageDialog(null, "resultado: " + t);
	}

}
