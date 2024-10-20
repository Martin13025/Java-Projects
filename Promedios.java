package promedios;

import javax.swing.JOptionPane;

class Promedios {

	public static void main(String[] args) {
		double n1 = 0, n2, p;
		int ca = 0;
		for (int i = 1; i <= 5; i++)
			n1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese nota"));
			n2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese nota"));
			p = (n1 + n2) / 2;
			JOptionPane.showMessageDialog(null, "promedio: " + p);
			System.out.println("promedio: " + p);
			if (p >= 4) {
			   ca++;
			}
			JOptionPane.showMessageDialog(null, "cant aprobados " + ca);
	}

}
