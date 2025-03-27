package operadores_01;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		float salario, abono, novo_salario;
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println(
					"Vamos calcular o seu novo salário! Digite as informações pedidas abaixo usando duas casas decimais após a vírgula.");
			System.out.println("Digite o seu salário atual:");
			salario = leia.nextFloat();
			System.out.println("Digite o valor do seu abono:");
			abono = leia.nextFloat();

			novo_salario = salario + abono;

			System.out.printf("Com um salário inicial de %.2f e abono de %.2f, você receberá %.2f.", salario, abono,
					novo_salario);
			leia.close();
		}
	}

}
