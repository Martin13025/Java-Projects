package ej4select;

import javax.swing.JOptionPane;

class Ej4select {

	public static void main(String[] args) {
		int tot=0, c;
		
		for (int i = 1; i <= 10; i++) {
			c = (int)(Math.random() * 12 + 1);
			System.out.println("carta: " + c);
			tot = tot + c;
		}
		
		JOptionPane.showMessageDialog(null, "suma: " + tot);
	}
}
