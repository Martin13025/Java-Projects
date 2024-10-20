package ej1para;


import javax.swing.JOptionPane;

class Ej1para {

	public static void main(String[] args) {
		int n, cant = 0;
			for (int i = 0; i <= 20; i++) {
				n = (int)(Math.random() * 10);
				if (n == 0) {
					cant++;
				}
			}
			JOptionPane.showMessageDialog(null, "cant ceros " + cant);
		}

	}

