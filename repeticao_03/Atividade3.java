package repeticao_03;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        int input, menoresDe21 = 0, maioresDe50 = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out
                    .println("Este programa calcula a quantidade de pessoas menores de 21 anos e maiores que 50 anos.");
            System.out.println("Digite a idade da pessoa ou um número menor que 0 para sair: ");
            input = scanner.nextInt();

            while (input >= 0) {
                if (input < 21) {
                    menoresDe21++;
                } else if (input > 50) {
                    maioresDe50++;
                }
                System.out.println("Digite a idade da pessoa ou um número menor que 0 para sair: ");
                input = scanner.nextInt();

            }
        }
        System.out.println("Total de pessoas menores de 21 anos: " + menoresDe21);
        System.out.println("Total de pessoas maiores de 50 anos: " + maioresDe50);
    }
}
