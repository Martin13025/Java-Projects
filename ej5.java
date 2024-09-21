import javax.swing.JOptionPane;

class ej5 {

	public static void main(String[] args) {
		double ct, cc, porc;
		
		ct=Double.parseDouble(JOptionPane.showInputDialog("cantidad de preguntas"));
		cc=Double.parseDouble(JOptionPane.showInputDialog("cantidad de respuestas correctas"));
		porc=cc*100/ct;
		if (porc>=90) {
			JOptionPane.showMessageDialog(null, "nivel maximo");
		} else if (porc>=75){
			JOptionPane.showMessageDialog(null, "nivel medio");
		} else if (porc>=50) {
			JOptionPane.showMessageDialog(null, "nivel regular");
		} else {
			JOptionPane.showMessageDialog(null, "fuera nivel");
		}

	}

}
