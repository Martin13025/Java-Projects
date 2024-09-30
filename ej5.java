import javax.swing.JOptionPane;

class ej5 {

	public static void main(String[] args) {
		
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
