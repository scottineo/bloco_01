package collections_07;

import java.util.*;

public class Atividade3 {
    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<>();

        try (Scanner scanner = new Scanner(System.in)) {
            while (numeros.size() < 10) {
                System.out.println("Digite um número inteiro não repetido (limite 10 números): ");
                numeros.add(scanner.nextInt());
            }
            if (numeros.size() == 10) {
                System.out.println("Os números digitados foram: ");
                Iterator<Integer> iterator = numeros.iterator();
                iterator.forEachRemaining(numero -> System.out.println(numero));
            }
        }
    }
}
