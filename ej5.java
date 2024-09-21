import javax.swing.JOptionPane;

class ej5 {

	public static void main(String[] args) {
		
		
		/*ct=Double.parseDouble(JOptionPane.showInputDialog("cantidad de preguntas"));
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
		}*/
		
		        int numero1 = 10;
		        int numero2 = 2;
		        System.out.println(dividirSiMayor(numero1, numero2));
		    

		    public static String dividirSiMayor(int a, int b) {
		        if (a > b && b != 0) {
		            return String.valueOf(a / (double) b);
		        } else {
		            return "No se puede realizar la división";
		        }

	}

}
