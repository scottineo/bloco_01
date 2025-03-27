package vetor_matriz_04;

import java.util.Scanner;

public class Matriz2 {
    public static void main(String[] args) {
        double[][] notas = new double[10][4];
        double[] media = new double[10];

        try (Scanner leia = new Scanner(System.in)) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Digite a primeira nota do aluno " + (i + 1) + ": ");
                notas[i][0] = leia.nextDouble();
                System.out.println("Digite a segunda nota do aluno " + (i + 1) + ": ");
                notas[i][1] = leia.nextDouble();
                System.out.println("Digite a terceira nota do aluno " + (i + 1) + ": ");
                notas[i][2] = leia.nextDouble();
                System.out.println("Digite a quarta nota do aluno " + (i + 1) + ": ");
                notas[i][3] = leia.nextDouble();
            }

            for (int i = 0; i < 10; i++) {
                media[i] = (notas[i][0] + notas[i][1] + notas[i][2] + notas[i][3]) / 4;
                System.out.println("Média do aluno " + (i + 1) + ": " + media[i]);

            }
        }
    }
}
