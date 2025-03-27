package estrutura_08;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        int input;
        String nomeDoCliente;
        boolean sair = false;

        try (Scanner scanner = new Scanner(System.in)) {
            Queue<String> clientes = new LinkedList<>();

            while (sair == false) {
                System.out.println("\n*********************************************");
                System.out.println("Selecione uma opção abaixo ou '0' para sair: ");
                System.out.println("1 - Adicionar cliente na fila");
                System.out.println("2 - Listar todos os clientes");
                System.out.println("3 - Atender cliente");
                System.out.println("0 - Sair");
                System.out.println("*********************************************");
                input = scanner.nextInt();
                scanner.nextLine();

                switch (input) {
                    case 1 -> {
                        System.out.println("\nDigite o nome do cliente: ");
                        nomeDoCliente = scanner.nextLine();
                        clientes.add(nomeDoCliente);
                        System.out.println("Cliente adicionado com sucesso!");
                        System.out.println("Cliente: " + nomeDoCliente);
                    }
                    case 2 -> {
                        if (clientes.isEmpty()) {
                            System.out.println("\nNão há clientes na fila!");
                            break;
                        } else {
                            System.out.println("\nClientes na fila: ");
                            Iterator<String> iterator = clientes.iterator();
                            while (iterator.hasNext()) {
                                System.out.println(iterator.next());
                            }
                        }
                    }
                    case 3 -> System.out.println("\nCliente atendido: " + clientes.poll());
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
