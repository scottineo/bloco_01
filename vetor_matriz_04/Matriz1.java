package vetor_matriz_04;

import java.util.Scanner;

public class Matriz1 {
    public static void main(String[] args) {
        int[][] matrizInteiros = new int[3][3];
        try (Scanner leia = new Scanner(System.in)) {
            for (int linha = 0; linha < 3; linha++) {
                for (int coluna = 0; coluna < 3; coluna++) {
                    System.out.println(
                            "Digite um valor para a posição [" + linha + "][" + coluna + "]: ");
                    matrizInteiros[linha][coluna] = leia.nextInt();
                }
            }
        }

        System.out.println("Elementos da diagonal principal: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(matrizInteiros[i][i]);
        }
        System.out.println("Elementos da diagonal secundária: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(matrizInteiros[i][2 - i]);
        }
        System.out.println("Soma dos elementos da diagonal principal: ");
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += matrizInteiros[i][i];
        }
        System.out.println(soma);
        System.out.println("Soma dos elementos da diagonal secundária: ");
        soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += matrizInteiros[i][2 - i];
        }
        System.out.println(soma);
    }
}