package condicionais_02;

import java.util.Scanner;

public class Atividade6 {
public static void main(String[] args) {
        String nome;
        double cargoGerente = 0.10;
        double cargoSupervisor = 0.09;
        double cargoVendedor = 0.07;
        double cargoMotorista = 0.06;
        double cargoEstoquista = 0.05; 
        double cargoTI = 0.08;
        double salario, salarioFinal;
        int escolha;

        try (Scanner leia = new Scanner(System.in)) {
            System.out.println("Vamos calcular o salário final de um funcionário:");
            System.out.println("Digite o nome do funcionário:");
            nome = leia.nextLine();
            System.out.println("Digite o salário do funcionário:");
            salario = leia.nextDouble();
            System.out.println("Digite o número do cargo do funcionário:");
            System.out.println("Nª - Cargo");
            System.out.println("1 - Gerente");
            System.out.println("2 - Vendedor");
            System.out.println("3 - Supervisor");
            System.out.println("4 - Motorista");
            System.out.println("5 - Estoquista");
            System.out.println("6 - Técnico de TI");
            escolha = leia.nextInt();
        }
        salarioFinal = switch (escolha) {
            case 1 -> salario + (salario * cargoGerente);
            case 2 -> salario + (salario * cargoVendedor);
            case 3 -> salario + (salario * cargoSupervisor);
            case 4 -> salario + (salario * cargoMotorista);
            case 5 -> salario + (salario * cargoEstoquista);
            case 6 -> salario + (salario * cargoTI);
            default -> {
                System.out.println("Opção inválida");
                yield salario;
            }
        };
        System.out.println("O salário final de " + nome + " é R$" + salarioFinal);
    }
}

