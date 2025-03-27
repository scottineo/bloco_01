package condicionais_02;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        //as variáveis foram propostas pelo exercício
        int a, b, c;

        try (Scanner leia = new Scanner(System.in)) {
            System.out.println("Vamos calcular se a soma de dois números é maior que um terceiro:");
            System.out.println("Digite o primeiro número:");
            a = leia.nextInt();
            System.out.println("Digite o segundo número:");
            b = leia.nextInt();
            System.out.println("Digite o terceiro número:");
            c = leia.nextInt();
            
            if ((a + b) > c) {
                System.out.println("A soma de a e b é maior que c");
                if ((a + b) == c) {
                    System.out.println("A soma de a e b é igual a c");
                }
            } else {
                System.out.println("A soma de a e b é menor que c");
            }
        }
    }
}
