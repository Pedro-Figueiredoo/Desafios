import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);

        int numero = 0;
        ArrayList<String> Lista = new ArrayList<>();

        System.out.println("""
                        Bem-Vindo ao Gerenciador de Tarefas!
                        
                        Menu:
                        1. Adicionar Tarefa
                        2. Visualizar Tarefa
                        3. Remover Tarefa
                        4. sair""");


        System.out.println("Escolha uma Opção:");
        numero = sc.nextInt();

        while (numero != 4) {
            if (numero == 1) {
                System.out.println("Adicione uma tarefa:");
                Lista.add(sc.next());
            } else if (numero == 2) {
                System.out.println(Lista);
            } else if (numero == 3) {
                System.out.print("Informe a tarefa a ser removido:");
                int indice = sc.nextInt();
                if (indice >= 1 && indice <= Lista.size()) {
                    Lista.remove(indice - 1);
                } else {
                    System.out.println("Índice inválido.");
                }
            } else {
                System.out.println("Opção inválida.");
            }

            System.out.print("Escolha uma opção:");
            numero = sc.nextInt();
        }

        System.out.println("O gerenciador de tarefa agradece!");
    }
}
