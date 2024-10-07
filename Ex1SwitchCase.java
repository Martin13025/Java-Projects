package ex1switchcase;

import javax.swing.*;

class Ex1SwitchCase {
    public static void main(String[] args) {
        double a, b, t = 0;
        int clave;

        a = Double.parseDouble(JOptionPane.showInputDialog("ingrese numero");
        b = Double.parseDouble(JOptionPane.showInputDialog("ingrese numero");
        clave = Integer.parseInt(JOptionPane.showInputDialog("1 suma\n2 - resta" + "\n3 - multiplicacion\n4 - division"));
        switch (clave) {
          case 1: t = a + b;
            break;
          case 2: t = a - b;
            break;
          case 3: t = a * b;
            break;
          case 4: if (b! = 0) {
            t = a / b;
          } else {
            JOptionPane.showMessageDialog(null, "imposible dividir por 0");
          }
          break;
          default: JOptionPane.showMessageDialog(null, "error");
            break;
        }
        JOptionPane.showMessageDialog(null, "resultado" + t);
    }
}
