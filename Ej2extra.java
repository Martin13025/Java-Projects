package ej2extra;

import javax.swing.JOptionPane;

class Ej2extra {

	public static void main(String[] args) {
		String nom;
		int anac, edad, edf, aa;
		
		nom=JOptionPane.showInputDialog("ingrese nombre");
		anac=Integer.parseInt(JOptionPane.showInputDialog("ingrese ano nacimiento"));
		aa=Integer.parseInt(JOptionPane.showInputDialog("ingrese ano actual"));	
		edad=aa-anac;
		edf=2050-anac;
		
		JOptionPane.showMessageDialog(null, nom + " su edad es: " + edad + "\nen el 2050: " + edf);
	}
}
