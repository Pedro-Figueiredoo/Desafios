import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de entrada:"));

        if (numero == 0) {
            JOptionPane.showMessageDialog(null,"O seu número é Neutro");

        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null,"O seu número é Negativo");

        } else {
            JOptionPane.showMessageDialog(null,"O seu número é Positivo");
        }

    }
}