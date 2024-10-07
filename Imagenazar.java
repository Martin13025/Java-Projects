package imagenazar;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

class Imagenazar {

	public static void main(String[] args) {
		int d;
		
		d = (int)(Math.random() * 6+1);
		JOptionPane.showMessageDialog(null, "dado" + d, "tirar dado", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Imagenazar.class.getResource("/img/dado" + d + ".png")));
	}
}
