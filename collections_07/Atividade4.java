package collections_07;

import java.util.HashSet;
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        HashSet<Integer> numeros = new HashSet<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);

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
                            "O número " + numeroBusca + " foi encontrado.");
                } else {
                    System.out.println("O número " + numeroBusca + " não foi encontrado");
                }
            }

            if (!continuar) {
                System.out.println("Programa finalizado");
            }
        }

    }
}
