package condicionais_02;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        int quantidade, escolha;
        double preço_final;
        double cachorroQuente = 10.00;
        double xSalada = 15.00;
        double xBacon = 18.00;
        double bauru = 12.00;
        double refrigerante = 8.00;
        double sucoLaranja = 13.00;

        try (Scanner leia = new Scanner(System.in)) {
            System.out.println("Digite o item que você quer do menu abaixo:");
            System.out.println("Nª - Item - Preço");
            System.out.println("1 - Cachorro Quente - R$10,00");
            System.out.println("2 - X-Salada - R$15,00");
            System.out.println("3 - X-Bacon - R$18,00");
            System.out.println("4 - Bauru - R$12,00");
            System.out.println("5 - Refrigerante - R$8,00");
            System.out.println("6 - Suco de laranja - R$13,00");
            escolha = leia.nextInt();

            System.out.println("Digite a quantidade que você deseja:");
            quantidade = leia.nextInt();

            switch (escolha) {
                case 1 -> {
                    preço_final = quantidade * cachorroQuente;
                    System.out.println("Você escolheu Cachorro Quente");
                    System.out.printf("O valor total é %.2f", preço_final);
                }
                case 2 -> {
                    preço_final = quantidade * xSalada;
                    System.out.println("Você escolheu X-Salada");
                    System.out.printf("O valor total é %.2f", preço_final);
                }
                case 3 -> {
                    preço_final = quantidade * xBacon;
                    System.out.println("Você escolheu X-Bacon");
                    System.out.printf("O valor total é %.2f", preço_final);
                }
                case 4 -> {
                    preço_final = quantidade * bauru;
                    System.out.println("Você escolheu Bauru");
                    System.out.printf("O valor total é %.2f", preço_final);
                }
                case 5 -> {
                    preço_final = quantidade * refrigerante;
                    System.out.println("Você escolheu Refrigerante");
                    System.out.printf("O valor total é %.2f", preço_final);
                }
                case 6 -> {
                    preço_final = quantidade * sucoLaranja;
                    System.out.println("Você escolheu Suco de laranja");
                    System.out.printf("O valor total é %.2f", preço_final);
                }
                default -> {
                    System.out.println("Opção inválida");
                }
            }
        }
    }
}
