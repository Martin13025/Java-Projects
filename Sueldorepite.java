package sueldorepite;

import javax.swing.JOptionPane;

class Sueldorepite {

	public static void main(String[] args) {
		int leg;
		double s, tot = 0;
		String res;
		do {
			leg = Integer.parseInt(JOptionPane.showInputDialog("ingrese legajo"));
				s = Double.parseDouble(JOptionPane.showInputDialog("ingrese sueldo"));
				System.out.println("sueldo " + s);
				tot += s;
			res = JOptionPane.showInputDialog("quiere ingresar otro dato? si/no");
		} while (res.equalsIgnoreCase("si"));
		JOptionPane.showMessageDialog(null, "total de sueldos: " + tot + leg);
	}

}
