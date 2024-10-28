import javax.swing.JOptionPane;

class sueldomientras {

	public static void main(String[] args) {
		int leg;
		double s, tot = 0;
		leg = Integer.parseInt(JOptionPane.showInputDialog("ingrese legajo -1234 para terminar"));
		while (leg != 1234){
			s = Double.parseDouble(JOptionPane.showInputDialog("ingrese sueldo"));
			System.out.println("sueldo: " + s);
			tot += s;
			leg = Integer.parseInt(JOptionPane.showInputDialog("ingrese legajo -1234 para terminar"));
		}
		JOptionPane.showMessageDialog(null, "total de sueldos: " + tot);
	}

}
