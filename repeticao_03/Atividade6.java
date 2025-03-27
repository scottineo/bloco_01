package repeticao_03;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        int numeroInput;
        int contador = 0;
        double soma = 0;
        double media;

        try (Scanner leia = new Scanner(System.in)) {
            do {
                System.out.println("Digite um número: ");
                numeroInput = leia.nextInt();
                if (numeroInput % 3 == 0 && numeroInput != 0) {
                    soma = soma + numeroInput;
                    contador++;
                    System.out.println("Soma: " + soma);
                    System.out.println("Cont: " + contador);

                }

            } while (numeroInput != 0);
        }

        media = soma / contador;
    
        System.out.println("A média dos números múltiplos de 3 é: " + media);
    }

}
