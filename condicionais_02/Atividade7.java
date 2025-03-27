package condicionais_02;

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int operacao;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            numero1 = scanner.nextInt();
            System.out.println("Digite o segundo número: ");
            numero2 = scanner.nextInt();
            System.out.println("Qual operação você deseja realizar?");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            operacao = scanner.nextInt();
            switch (operacao) {
                case 1 -> System.out.println("O resultado da soma é: " + (numero1 + numero2));
                case 2 -> System.out.println("O resultado da subtração é: " + (numero1 - numero2));
                case 3 -> System.out.println("O resultado da multiplicação é: " + (numero1 * numero2));
                case 4 -> {
                    if (numero2 == 0) {
                        System.out.println("Não é possível dividir por zero");
                    } else {
                        System.out.println("O resultado da divisão é: " + (numero1 / (double) numero2));
                    }
                }
                default -> System.out.println("Operação inválida");
            }
        }
    }
}
