package ej4cond;

import javax.swing.JOptionPane;

class Ej4cond {

	public static void main(String[] args) {
		double vta, d;
		String tv;
		
		vta=Double.parseDouble(JOptionPane.showInputDialog("Ingrese venta"));
		tv=JOptionPane.showInputDialog("ingrese \nc-contado \nt-tarjeta");
		if (tv.equalsIgnoreCase("c")) {
			d=vta*0.10;
		} else {
			d=0;
		}
		vta=vta-d;
		JOptionPane.showMessageDialog(null, "descuento: " + d + " paga: " + vta);
	}
}
