import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main (String[] args) {

        Employee employee = new Employee();
        Employee employee1 = new Employee();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario 1: ");
        employee.setNomeFuncionario(scanner.next());

        System.out.println("Digite o Salario Bruto: ");
        employee.setSalarioBruto(scanner.nextDouble());

        System.out.println("Digite o nome do Taxa: ");
        employee.setTaxa(scanner.nextDouble());

        Double salario = (employee.getTaxa() /100) * employee.getSalarioBruto() + employee.getSalarioBruto();

        System.out.println("Digite o nome do funcionario 2: ");
        employee1.setNomeFuncionario(scanner.next());

        System.out.println("Digite o Salario Bruto: ");
        employee1.setSalarioBruto(scanner.nextDouble());

        System.out.println("Digite o nome do Taxa: ");
        employee1.setTaxa(scanner.nextDouble());

        Double salario1 = (employee1.getTaxa() /100) * employee1.getSalarioBruto() + employee1.getSalarioBruto();

        System.out.println("Informações do funcionario 1: " + employee.getNomeFuncionario() + " Salario: " + employee.getSalarioBruto() + " Salario Liquido: " + salario);

        System.out.println("Informações do funcionario 2: " + employee1.getNomeFuncionario() + " Salario: " + employee1.getSalarioBruto() + " Salario Liquido: " + salario1);
    }
}