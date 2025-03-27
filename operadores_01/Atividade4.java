package operadores_01;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		float numero1, numero2, numero3, numero4, resultado;

		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("Vamos calcular a diferença entre dois produtos:");
			System.out.println("Digite o primeiro numerador");
			numero1 = leia.nextFloat();
			System.out.println("Digite o primeiro divisor");
			numero2 = leia.nextFloat();
			System.out.println("Digite o segundo numerador");
			numero3 = leia.nextFloat();
			System.out.println("Digite o segundo divisor");
			numero4 = leia.nextFloat();

			resultado = (numero1 * numero2) - (numero3 * numero4);

			System.out.printf("A diferença entre os produtos é %.2f", resultado);
		}
	}
}
