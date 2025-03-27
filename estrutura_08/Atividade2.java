package estrutura_08;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Atividade2 {
    public static void main(String[] args) {
        int input;
        String nomeDoLivro;
        boolean sair = false;

        try (Scanner scanner = new Scanner(System.in)) {
            Stack<String> livros = new Stack<>();

            while (sair == false) {
                System.out.println("\n*********************************************");
                System.out.println("Selecione uma opção abaixo ou '0' para sair: ");
                System.out.println("1 - Adicionar livro na pilha");
                System.out.println("2 - Listar todos os livros");
                System.out.println("3 - Retirar livro da pilha");
                System.out.println("0 - Sair");
                System.out.println("*********************************************");
                input = scanner.nextInt();
                scanner.nextLine();

                switch (input) {
                    case 1 -> {
                        System.out.println("\nDigite o nome do livro: ");
                        nomeDoLivro = scanner.nextLine();
                        livros.add(nomeDoLivro);
                        System.out.println("Livro adicionado com sucesso!");
                        System.out.println("Livro: " + nomeDoLivro);
                    }
                    case 2 -> {
                        if (livros.isEmpty()) {
                            System.out.println("\nNão há livros na fila!");
                            break;
                        } else {
                            System.out.println("\nLivros na fila: ");
                            Iterator<String> iterator = livros.iterator();
                            while (iterator.hasNext()) {
                                System.out.println(iterator.next());
                            }
                        }
                    }
                    case 3 -> System.out.println("\nLivro removido da pilha: " + livros.pop());
                    case 0 -> {
                        System.out.println("\nPrograma finalizado!");
                        sair = true;
                    }
                    default -> System.out.println("\nOpção inválida!");
                }
            }
        }

    }
}
