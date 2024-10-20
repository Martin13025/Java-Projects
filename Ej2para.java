package ej2para;

import java.util.Iterator;

import javax.swing.JOptionPane;

class Ej2para {

	public static void main(String[] args) {
		int n, c1 = 0, c2 = 0, c3 = 0, c4 = 0;
		for (int i = 1; i <= 100; i++) {
			n = (int)(Math.random() * 10);
			System.out.print(" - " + n);
			if (n < 25) {
				c1++;
			} else if (n < 50){
				c2++;
			} else if (n < 75){
				c3++;
			} else {
				c4++;
			}
		}
		JOptionPane.showMessageDialog(null, "cant <25: " + c1 + " <50" + c2 + "<75" + c3 + "<100" + c4);	
	}

}
