package vetor_matriz_04;

import java.util.Scanner;

public class Vetor1 {
    public static void main(String[] args) {
        int[] vetor = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
        int numeroInput;
        boolean encontrado = false;
        try (Scanner leia = new Scanner(System.in)) {

            System.out.println("Digite um número: ");
            numeroInput = leia.nextInt();

            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] == numeroInput) {
                    System.out.println("O número " + numeroInput + " está na posição " + i + " do vetor.");
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("O número " + numeroInput + " não está no vetor.");
            }
            leia.close();
        }
    }
}
