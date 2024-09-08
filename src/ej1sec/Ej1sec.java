package ej1sec;

import javax.swing.JOptionPane;

class Ej1sec {

	public static void main(String[] args) {
		int a,b,c,d, sum, prod;
		
		a=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
		
		a=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
		b=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
		c=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
		d=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
		
		sum=a+b;
		prod=c*d;
		JOptionPane.showMessageDialog(null,  "suma: " + sum + " producto: " + prod);
	}
}
