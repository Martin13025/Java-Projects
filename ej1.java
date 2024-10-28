import javax.swing.JOptionPane;

class ej1 {

	public static void main(String[] args) {
		int nota, aprob, desaprob, tp, esc;
		aprob = 0;
		desaprob = 0;
		tp = 0;
		esc = 0;
		nota = Integer.parseInt(JOptionPane.showInputDialog("ingrese nota"));
		while (nota >= 0) {
			if (nota >= 4) {
				aprob += 1;
				if (nota >= 7) {
					tp += 1;
				} else {
					esc += 1;
				}
			} else {
				desaprob += 1;
			}
			nota = Integer.parseInt(JOptionPane.showInputDialog("ingrese nota"));
		}
		JOptionPane.showMessageDialog(null, "aprobados " + aprob + "tp " + tp + "escrito " + 
		esc + "desaprobados " + desaprob);
	}

}
