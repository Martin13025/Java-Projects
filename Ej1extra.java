package ej1extra;

import javax.swing.JOptionPane;

class Ej1extra {

	public static void main(String[] args) {
		double ch, vh, sb, os, jub, sn;
		
		ch=Double.parseDouble(JOptionPane.showInputDialog("Ingrese cant horas"));
		vh=Double.parseDouble(JOptionPane.showInputDialog("Ingrese cant horas"));
		sb=ch*vh;
		os=sb*0.07;
		jub=sb*0.10;
		sn=sb-os-jub;
		JOptionPane.showMessageDialog(null, "***** Recibo de sueldo ****** \nsueldo bruto:"
		+ sb + "\ndescuento obra social: " + os + "\ndescuento jubilacion: " + jub
		+ "\nsueldo neto a cobrar: " + sn);
		


	}

}
