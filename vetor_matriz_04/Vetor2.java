package vetor_matriz_04;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor2 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int[] vetorIndiceImpar = new int[5];
        int numeroInput;
        double soma = 0;
        double media;
        try (Scanner leia = new Scanner(System.in)) {

            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Digite um número: ");
                numeroInput = leia.nextInt();
                vetor[i] = numeroInput;
                soma += vetor[i];
                if (i % 2 != 0) {
                    vetorIndiceImpar[i / 2] = vetor[i];
                }
            }
            int[] vetorPares = Arrays.stream(vetor).filter(n -> n % 2 == 0).toArray();

            System.out.println(Arrays.toString(vetorIndiceImpar));
            System.out.println(Arrays.toString(vetorPares));
            System.out.println("A soma dos números do vetor é: " + soma);
            media = soma / vetor.length;
            System.out.printf("A média dos números do vetor é %.2f", media);
        }
    }
}