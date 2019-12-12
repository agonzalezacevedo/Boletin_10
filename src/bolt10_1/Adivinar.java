package bolt10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author agonzalezacevedo
 */
public class Adivinar {

    public void adivina() {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Jugador1 introduce un numero que el Jugador2 tendra que adivinar"));
        while (numero > 50 || numero < 0) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ese numero no sirve introduce un numero del 0 al 50"));
        }
        int intentos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de intentos"));
        while (intentos < 0) {
            intentos = Integer.parseInt(JOptionPane.showInputDialog("Ese numero no sirve introduce un numero positivo"));
        }
        int valor = -1;
        while (intentos > 0 && valor != numero) {

            valor = Integer.parseInt(JOptionPane.showInputDialog("J2 introduce un numero"));
            intentos--;
            if (valor == numero) {
                JOptionPane.showMessageDialog(null, "GANASTE JUGADOR2");
            } else if (valor > numero) {
                JOptionPane.showMessageDialog(null, "Estas demasiado arriba Jugador2");
            } else if (valor < numero) {
                JOptionPane.showMessageDialog(null, "Estas demasiado abajo Jugador2");
            }
            if (valor != numero && intentos == 0) {
                JOptionPane.showMessageDialog(null, "GANASTE JUGADOR1");
            }
            JOptionPane.showMessageDialog(null, "Te quedan " + intentos + " intento/s");
        }
    }
}
