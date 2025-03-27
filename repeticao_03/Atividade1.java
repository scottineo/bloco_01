package repeticao_03;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        int numeroInicial, numeroFinal;

        try (Scanner leia = new Scanner(System.in)) {
            System.out.println("Digite o número inicial:");
            numeroInicial = leia.nextInt();
            System.out.println("Digite o número final:");
            numeroFinal = leia.nextInt();

            if (numeroInicial >= numeroFinal) {
                System.out.println("Intervalo inválido!");
                leia.close();
            }
        }
        for (int contador = numeroInicial; contador <= numeroFinal; contador++) {
            if (contador % 3 == 0 && contador % 5 == 0) {
                System.out.println("O número " + contador + " é divisível por 3 e 5");
            }
        }
        // for (int contador = numeroInicial; contador >= numeroFinal; contador--) {
        //     if (contador % 3 == 0 && contador % 5 == 0) {
        //         System.out.println("O número " + contador + " é divisível por 3 e 5");
        //     }
        // }
    }
}
