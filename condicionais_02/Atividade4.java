package condicionais_02;

import java.util.Scanner;

public class Atividade4 {
public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
        try {
            System.out.println("Vamos tentar descobrir o animal que você está pensando!");
            System.err.println("Digite uma das opções entre os parentesis: Ele é (vertebrado ou invertebrado)?");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e);
        }
        String metazoa = scanner.nextLine();
        if (metazoa.equals("vertebrado")) {
            System.out.println("Ele é (ave ou mamífero)?");
            String cordado = scanner.nextLine();
            if (cordado.equals("ave")) {
                System.out.println("Ele é (carnívoro ou onívoro)?");
                String ave = scanner.nextLine();
                if (ave.equals("carnívoro")) {
                    System.out.println("Águia");
                } else if (ave.equals("onívoro")) {
                    System.out.println("Pomba");
                }
            } else if (cordado.equals("mamífero")) {
                System.out.println("Ele é (onívoro ou herbívoro)?");
                String mamifero = scanner.nextLine();
                if (mamifero.equals("onívoro")) {
                    System.out.println("Homem");
                } else if (mamifero.equals("herbívoro")) {
                    System.out.println("Vaca");
                }
            }
        } else if (metazoa.equals("invertebrado")) {
            System.out.println("Ele é (inseto ou anelídeo)?");
            String invertebrado = scanner.nextLine();
            if (invertebrado.equals("inseto")) {
                System.out.println("Ele é (hematófago ou herbívoro)?");
                String inseto = scanner.nextLine();
                if (inseto.equals("hematófago")) {
                    System.out.println("Pulga");
                } else if (inseto.equals("herbívoro")) {
                    System.out.println("Lagarta");
                }
            } else if (invertebrado.equals("anelídeo")) {
                System.out.println("Ele é (hematófago ou onívoro)?");
                String anelideo = scanner.nextLine();
                if (anelideo.equals("hematófago")) {
                    System.out.println("Sanguessuga");
                } else if (anelideo.equals("onívoro")) {
                    System.out.println("Minhoca");
                }
            }
        }
    }
}
}
