package collections_07;

import java.util.*;

public class Atividade1 {
    public static void main(String[] args) {
        Boolean continuar = true;
        ArrayList<String> cores = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            while (continuar) {
                System.out.println("Digite uma cor ou 'n' para sair: ");
                String resposta = scanner.next();

                if (resposta.equalsIgnoreCase("n")) {
                    continuar = false;
                    System.out.println("\n A lista de cores digitadas foram: ");
                    for (String cor : cores) {
                        System.out.println(cor);
                    }
                    Collections.sort(cores);
                    System.out.println("\n A lista de cores ordenadas é: ");
                    for (String cor : cores) {
                        System.out.println(cor);
                    }
                } else {
                    cores.add(resposta);
                }
            }
        }
    }
}
