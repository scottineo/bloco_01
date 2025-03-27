package condicionais_02;

import java.util.Scanner;

public class Atividade3 {
public static void main(String[] args) {
    String nome_do_doador;
    int idade;
    Boolean pode_doar = false;
    Boolean primeira_vez = false;
    char primeira_vez_char;

    
    try (Scanner leia = new Scanner(System.in)) {
        System.out.println("Digite o nome do doador:");
        nome_do_doador = leia.nextLine();
        System.out.println("Digite a idade do doador:");
        idade = leia.nextInt();
        System.out.println("É a primeira vez que " + nome_do_doador + " está doando sangue? (S/N)");
        primeira_vez_char = leia.next().charAt(0);
        if(primeira_vez_char == 'S' || primeira_vez_char == 's') {
            primeira_vez = true;
        }
        }

        if (idade >= 18 && idade <= 59) {
            pode_doar = true;
        }
        else if (idade >= 60 || idade <= 69 && primeira_vez) {
            pode_doar = false;
        }
        if (pode_doar) {
            System.out.println(nome_do_doador + " está apto doar sangue");
        }
        else {
            System.out.println(nome_do_doador + " não está apto para doar sangue");
        }
    }
}

