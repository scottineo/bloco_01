package operadores_01;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		float nota1, nota2, nota3, nota4, media;

		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("Vamos calcular a sua média, digite as notas pedidas abaixo:");
			System.out.println("Qual a sua nota final na atividade 1?");
			nota1 = leia.nextFloat();
			System.out.println("Qual a sua nota final na atividade 2?");
			nota2 = leia.nextFloat();
			System.out.println("Qual a sua nota final na atividade 3?");
			nota3 = leia.nextFloat();
			System.out.println("Qual a sua nota final na atividade 4?");
			nota4 = leia.nextFloat();

			media = (nota1 + nota2 + nota3 + nota4) / 4;

			System.out.printf("Sua média final é %.1f", media);
		}
	}

}
