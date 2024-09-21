package ej3sec;

import javax.swing.JOptionPane;

class Ej3sec {

	public static void main(String[] args) {
		double precio, total;
		int cant;
		
		precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio"));
		cant=Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad"));
		total=precio*cant;
		
		JOptionPane.showMessageDialog(null, "paga: " + total);
	}
}
