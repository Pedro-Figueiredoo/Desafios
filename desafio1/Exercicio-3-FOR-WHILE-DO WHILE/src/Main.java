import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de entrada:"));

        int controle = 0;


        for (int i = 0; i <= numero; i++) {
            JOptionPane.showMessageDialog(null, i);
            ;
        }
controle = 0;

        while (controle < numero) {
            controle++;
            JOptionPane.showMessageDialog(null, controle);
            ;

        }
controle = 0;

        do {
            JOptionPane.showMessageDialog(null, controle);
            controle++;
            ;
        } while (controle <= numero);


    }
}





