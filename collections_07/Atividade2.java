package collections_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        try (Scanner scanner = new Scanner(System.in)) {
            int numeroBusca;
            boolean continuar = true;

            while (continuar) {
                System.out.println("Digite um número para buscar ou '00' para finalizar: ");
                numeroBusca = scanner.nextInt();
                if (numeroBusca == 00) {
                    continuar = false;
                    break;
                }

                if (numeros.contains(numeroBusca)) {
                    System.out.println(
                            "O número " + numeroBusca + " foi encontrado na posição: " + numeros.indexOf(numeroBusca));
                } else {
                    System.out.println("Número não encontrado");
                }
            }

            if (!continuar) {
                System.out.println("Programa finalizado");
            }
        }

    }
}
