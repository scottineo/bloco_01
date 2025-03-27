package repeticao_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        int input;
        int pares = 0, impares = 0;
        ArrayList<Integer> numeros = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite um número ou '0' para sair: ");
            input = scanner.nextInt();
            while (input != 0) {
                numeros.add(input);
                System.out.println("Digite um número ou '0' para sair: ");
                input = scanner.nextInt();
            }

            for (Integer numero : numeros) {
                if (numero % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            System.out.println("Quantidade de números pares: " + pares);
            System.out.println("Quantidade de números ímpares: " + impares);
        }
    }
}
