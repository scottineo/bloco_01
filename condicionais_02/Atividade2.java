package condicionais_02;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        int numerotestado;
        boolean positivo = false, par = false;
        try (Scanner leia = new Scanner(System.in)) {
            System.out.println("Digite um número inteiro:");
            numerotestado = leia.nextInt();
            if (numerotestado > 0) {
                positivo = true;
            }
            if (numerotestado % 2 == 0) {
                par = true;
            }
            if (par && positivo) {
                System.out.printf("O número %d é positivo e par", numerotestado);
            }
            else if (par && !positivo) {
                System.out.printf("O número %d é negativo e par", numerotestado);
            }
            else if (!par && positivo) {
                System.out.printf("O número %d é positivo e ímpar", numerotestado);
            }
            else if (!par && !positivo) {
                System.out.printf("O número %d é negativo e ímpar", numerotestado);
            }
        }
    }
}
