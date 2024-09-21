package ej4sec;

import javax.swing.JOptionPane;

class Ej4sec {

	public static void main(String[] args) {
		double n1,n2,n3,prom;
		int mat;
		
		n1=Double.parseDouble(JOptionPane.showInputDialog("ingrese nota"));
		n2=Double.parseDouble(JOptionPane.showInputDialog("ingrese nota"));
		n3=Double.parseDouble(JOptionPane.showInputDialog("ingrese nota"));
		mat=Integer.parseInt(JOptionPane.showInputDialog("ingrese matricula"));
		prom=(n1+n2+n3)/3;
		
		JOptionPane.showMessageDialog(null, "matricula: " + mat + "\npromedio: " + prom);
	}
}
