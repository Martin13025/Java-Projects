package juegomoneda;

import javax.swing.*; //cambiar por *
import javax.swing.ImageIcon;
class Juegomoneda {
	public static void main(String[] args) {
		int m;
		String nom;
		//JOptionpane.showinputdialog(null, "menaje", "titulo", tipo de cuadro, icono, null, null)
		nom=(String) JOptionPane.showInputDialog(null, "ingrese su nombre", "juego con moneda", JOptionPane.DEFAULT_OPTION,
			new ImageIcon(Juegomoneda.class.getResource("/img/monedaani.gif")), null, null);
		
		
		m=(int)(Math.random() * 2);
		if (m==0) {
			//JOptionPane.showmessagedialog(null, "mensaje", "titulo", tipo de cuadro, icono)
			JOptionPane.showMessageDialog(null, "tienen parcialito", "juego con moneda", JOptionPane.DEFAULT_OPTION,
			new ImageIcon(Juegomoneda.class.getResource("/img/cara.png")));
		} else {
			JOptionPane.showMessageDialog(null, "el tp tiene nota de concepto", "juego con moneda", JOptionPane.DEFAULT_OPTION,
			new ImageIcon(Juegomoneda.class.getResource("/img/ceca.png")));
		}
		int apuesta;
		String ap;
		ap=(String) JoptionPane.showInputDialog(null, "ingrese apuesta", "apuesta", JOptionPane.DEFAULT_OPTION,
			new ImageIcon(Juegomoneda.class.getResource("/img/monedaani.gif")), null, null);
		apuesta=Integer.parseInt(ap);
		JOptionPane.showMessageDialog(null, "su puesta es " + apuesta);
	}
}
