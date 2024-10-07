import javax.swing.JOptionPane;

class ej2 {

	public static void main(String[] args) {
		int cat;
		double ch, che, ph, phe, s;
		
	ch = Double.parseDouble(JOptionPane.showInputDialog("ingrese cant horas"));
	che = Double.parseDouble(JOptionPane.showInputDialog("ingrese cant horas"));
	cat = Integer.parseInt(JOptionPane.showInputDialog("ingrese categoria 1, 2, 3"));
	switch (cat) {
	case 1:
		ph = 14;
		phe = 20.5;
		break;
	case 2:
		ph = 17;
		phe = 24;
		break;
	case 3:
		ph = 21;
		phe = 34;
		break;
	default:
		ph = 0;
		phe = 0;
		JOptionPane.showMessageDialog(null, "error");
		break;
	}
	if (che > 30) {
		phe = phe * 0.93;
	} 
	s = ch * ph + che * phe;
	JOptionPane.showMessageDialog(null, "cobra: " + s);
	}

}
