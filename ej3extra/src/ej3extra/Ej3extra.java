package ej3extra;

import javax.swing.JOptionPane;

class Ej3extra {

	public static void main(String[] args) {
		double radio, perim, area;
		final double p=3.1416;
		
		radio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese radio"));
		perim=2*p*radio;
		area=p*radio*radio;
		JOptionPane.showMessageDialog(null, "perimentro: " + perim + "\narea: " + area);
		

	}

}
