package repeticao_03;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
            int idade, identidade_genero, cargo_especialidade;
            int totalPessoas = 0;
            int totalIdade = 0;
            int desenvolvedoresBackend = 0;
            int mulheresCisTransFrontend = 0;
            int homensCisTransMobileMaiores40 = 0;
            int naoBinariosFullstackMenores30 = 0;
            boolean continuar = true;
            while (continuar) {
                System.out.println("Digite a idade do colaborador:");
                idade = leia.nextInt();
                System.out.println(
                        "Digite o identidade de gênero do colaborador (1 - Mulher Cis, 2 - Homem Cis, 3 - Não binário, 4 - Mulher Trans, 5 - Homem Trans, 0 - Outros):");
                identidade_genero = leia.nextInt();
                System.out.println(
                        "Digite a especialidade do cargo do colaborador (1 - Backend, 2 - Frontend, 3 - Mobile, 4 - Fullstack");
                cargo_especialidade = leia.nextInt();
                
                totalPessoas++;
                totalIdade += idade;
                
                if (cargo_especialidade == 1) {
                    desenvolvedoresBackend++;
                } else if ((identidade_genero == 1 || identidade_genero == 4) && cargo_especialidade == 2) {
                    mulheresCisTransFrontend++;
                } else if ((identidade_genero == 2 || identidade_genero == 5) && cargo_especialidade == 3 && idade > 40) {
                    homensCisTransMobileMaiores40++;
                } else if (identidade_genero == 3 && cargo_especialidade == 4 && idade < 30) {
                    naoBinariosFullstackMenores30++;
                }
                System.out.println("Deseja continuar? (S/N)");
                String continuarStr = leia.next();
                if (continuarStr.equalsIgnoreCase("s")) {
                    continuar = true;
                } else if (continuarStr.equalsIgnoreCase("n")) {
                    continuar = false;
                } else {
                    System.out.println("Opção inválida, encerrando o programa.");
                    continuar = false;
                }
            }   double mediaIdade = totalIdade / totalPessoas;
            System.out.println("\n----Respostas da pesquisa:----");
            System.out.println("O número de pessoas desenvolvedoras Backend: " + desenvolvedoresBackend);
            System.out.println("O número de Mulheres Cis e Trans desenvolvedoras Frontend é: " + mulheresCisTransFrontend);
            System.out.println("O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos é: "
                    + homensCisTransMobileMaiores40);
            System.out.println("O número de Não Binários desenvolvedores Fullstack menores de 30 anos é: "
                    + naoBinariosFullstackMenores30);
            System.out.println("O total de pessoas é: " + totalPessoas);
            System.out.println("A média de idade dos colaboradores é: " + mediaIdade);
        }
    }
}
