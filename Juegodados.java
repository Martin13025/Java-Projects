package juegodados;

import javax.swing.JOptionPane;

class Juegodados {

	public static void main(String[] args) {
		int d;
		d=(int)(Math.random()*6+1);
		switch (d) {
		case 1,3,5 : JOptionPane.showMessageDialog(null, "tienen parcialito");
			break;
		case 2 : JOptionPane.showMessageDialog(null, "no tienen tarea");
		break;
		case 4 : JOptionPane.showMessageDialog(null, "pueden comprar dolares");
		break;
		case 6 : JOptionPane.showMessageDialog(null, "tienen 10 min mas en el parcial");
		break;
	}
		
	}

}
