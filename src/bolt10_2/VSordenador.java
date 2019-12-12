package bolt10_2;

import javax.swing.JOptionPane;

/**
 *
 * @author agonzalezacevedo
 */
public class VSordenador {

    private int num;
    private int num2;
    int valor;

    public void juegazo() {
        do {
            num = (int) (Math.random() * (51 - 0));
            int intentos = Integer.parseInt(JOptionPane.showInputDialog("Numero intentos?"));
            int salto = 0;
            do {
                do {
                    intentos--;
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Adivina el numero entre 1 e 50"));
                } while (num > 50 || num < 1);
                if (Math.abs(num - num2) < 5 && (num - num2) != 0) {
                    JOptionPane.showMessageDialog(null, "Moi preto");
                } else if (Math.abs(num - num2) < 10 && (num - num2) != 0) {
                    JOptionPane.showMessageDialog(null, "Preto");
                } else if (Math.abs(num - num2) < 20 && (num - num2) != 0) {
                    JOptionPane.showMessageDialog(null, "Lonxe");
                } else if (Math.abs(num - num2) > 20 && (num - num2) != 0) {
                    JOptionPane.showMessageDialog(null, "Moi lonxe");
                } else if (num == num2) {
                    JOptionPane.showMessageDialog(null, "Acertaste");
                    salto = 1;
                    break;
                }
            } while (num2 != num && intentos > 0);
            if (salto == 0) {
                JOptionPane.showMessageDialog(null, "Perdiste");
                JOptionPane.showMessageDialog(null, "El numero era " + num);
            }
            valor = Integer.parseInt(JOptionPane.showInputDialog("Si quieres parar de jugar pulsa 0"));
        } while (valor != 0);
    }
}
