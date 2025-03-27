package repeticao_03;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        int soma = 0;
        int numero;
        try (Scanner leia = new Scanner(System.in)) {
            System.out.println("Este programa soma todos os número positivos inseridos até que seja inserido o número 0");
            do {
                System.out.println("Digite um número: ");
                numero = leia.nextInt();
                if (numero > 0) {
                    soma += numero;
                }
            } while (numero != 0);
            System.out.println("A soma dos números positivos é: " + soma);
        }
    }
}
