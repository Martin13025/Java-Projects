package juegomoneda;

import javax.swing.*; //cambiar por *

class Juegomoneda {
	public static void main(String[] args) {
		int m;
		m=(int)(Math.random() * 2);
		if (m==0) {
			//JOptionPane.showmessagedialog(null, "mensaje", "titulo", tipo de cuadro, icono)
			JOptionPane.showMessageDialog(null, "tienen parcialito", "juego con moneda", JOptionPane.DEFAULT_OPTION,
			new ImageIcon(Juegomoneda.class.getResource("/img/cara.png")));
		} else {
			JOptionPane.showMessageDialog(null, "el tp tiene nota de concepto", "juego con moneda", JOptionPane.DEFAULT_OPTION,
			new ImageIcon(Juegomoneda.class.getResource("/img/ceca.png")));
		}
	}
}
