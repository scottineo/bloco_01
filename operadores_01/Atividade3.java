package operadores_01;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		float salario_bruto, adicional_noturno, hora_extra, descontos, salario_liquido;
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println(
					"Vamos calcular o seu salário! Digite as informações pedidas abaixo usando duas casas decimais após a vírgula.");
			System.out.println("Digite o seu salário bruto:");
			salario_bruto = leia.nextFloat();
			System.out.println("Qual o valor relativo ao adicional noturno?");
			adicional_noturno = leia.nextFloat();
			System.out.println("Qual o valor relativo às horas extras?");
			hora_extra = leia.nextFloat();
			System.out.println("Qual o valor relativo aos descontos do mês?");
			descontos = leia.nextFloat();

			salario_liquido = (salario_bruto + adicional_noturno + (hora_extra * 5)) - descontos;

			System.out.printf("Este mês, você receberá %.2f.", salario_liquido);
		}
	}

}
