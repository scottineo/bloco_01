package condicionais_02;

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        float saldo = 1000;
        double saqueDeposito;
        int operacao;
        boolean continuar = true;

        try (Scanner scanner = new Scanner(System.in)) {
            while (continuar) {
                System.out.println("Bem vindo ao Banco, o que deseja fazer?");
                System.out.println("1 - Saldo");
                System.out.println("2 - Saque");
                System.out.println("3 - Depósito");
                System.out.println("4 - Sair");
                operacao = scanner.nextInt();

                switch (operacao) {
                    case 1 -> System.out.println("Seu saldo é: R$ " + saldo);
                    case 2 -> {
                        System.out.println("Digite o valor do saque: ");
                        saqueDeposito = scanner.nextDouble();
                        if (saqueDeposito > saldo) {
                            System.out.println("Saldo insuficiente");
                        } else {
                            saldo -= saqueDeposito;
                            System.out.println("Saque realizado com sucesso");
                            System.out.println("Saldo atual: R$ " + saldo);
                        }
                    }
                    case 3 -> {
                        System.out.println("Digite o valor do depósito: ");
                        saqueDeposito = scanner.nextDouble();
                        saldo += saqueDeposito;
                        System.out.println("Depósito realizado com sucesso");
                        System.out.println("Saldo atual: R$ " + saldo);
                    }
                    case 4 -> {
                        continuar = false;
                        System.out.println("Obrigado por utilizar nossos serviços");
                    }
                    default -> System.out.println("Operação inválida");
                }
            }
        }
    }
}
