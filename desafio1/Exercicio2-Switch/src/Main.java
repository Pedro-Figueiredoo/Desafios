import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        DiaDaSemana diaDaSemana = new DiaDaSemana();

        int DiaDaSemana = Integer.parseInt(JOptionPane.showInputDialog("Digite um dia da semana:"));
        switch (DiaDaSemana) {
            case 1:
                JOptionPane.showMessageDialog(null, diaDaSemana.DOMINGO);

                break;
            case 2:
                JOptionPane.showMessageDialog(null, diaDaSemana.SEGUNDA);
                break;

            case 3:
                JOptionPane.showMessageDialog(null, diaDaSemana.TERÇA);
                break;

            case 4:
                JOptionPane.showMessageDialog(null, diaDaSemana.QUARTA);
                break;

            case 5:
                JOptionPane.showMessageDialog(null, diaDaSemana.QUINTA);
                break;

            case 6:
                JOptionPane.showMessageDialog(null, diaDaSemana.SEXTA);
                break;

            case 7:
                JOptionPane.showMessageDialog(null, diaDaSemana.SABADO);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Dia Invalido");
                break;
        };



    }
}