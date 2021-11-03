package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		String nome, opc, nomeMenorMedia = "", nomeMaiorMedia = "";
		double nota1, nota2, media, somaMedias = 0.0, mediaClasse, menorMedia = 0.0, maiorMedia = 0.0;
		int totalAlunos = 0, totalAprovados = 0, totalExame = 0, totalReprovados = 0;

		do {

			System.out.println("Entre com o nome do aluno: ");
			nome = entrada.nextLine();

			System.out.println("Entre com o grau A: ");
			nota1 = entrada.nextDouble();
			while (nota1 < 0 || nota1 > 10) {
				System.out.println("ERRO: Nota inválida! Digite novamente a nota: ");
				nota1 = entrada.nextDouble();
			}

			System.out.println("Entre com o grau B: ");
			nota2 = entrada.nextDouble();
			while (nota2 < 0 || nota2 > 10) {
				System.out.println("ERRO: Nota inválida! Digite novamente a nota: ");
				nota2 = entrada.nextDouble();
			}

			media = (nota1 + nota2) / 2.0;

			System.out.println("O aluno " + nome + " tem uma média: " + media);

			if (media < 3) {
				System.out.println("Situação: REPROVADO.");
				totalReprovados++;
			} else if (media >= 3 && media < 7) {
				System.out.println("Situação: EXAME.");
				totalExame++;
			} else {
				System.out.println("Situação: APROVADO.");
				totalAprovados++;
			}

			totalAlunos++;
			somaMedias += media; // somaMedias = somaMedias + media;

			if (totalAlunos == 1) {
				nomeMenorMedia = nome;
				nomeMaiorMedia = nome;

				menorMedia = media;
				maiorMedia = media;
			}

			if (media > maiorMedia) {
				nomeMaiorMedia = nome;
				maiorMedia = media;
			}

			if (media < menorMedia) {
				nomeMenorMedia = nome;
				menorMedia = media;
			}

			entrada.nextLine(); // para limpeza do buffer

			System.out.println("Continuar (sim/nao)? ");
			opc = entrada.nextLine();
			while (!opc.equalsIgnoreCase("sim") && !opc.equalsIgnoreCase("nao")) {
				System.out.println("Opção inválida, digite apenas 'Sim' ou 'Nao': ");
				opc = entrada.nextLine();
			}

			if (opc.equalsIgnoreCase("sim")) {
				System.out.println(" --- Lendo dados de um novo aluno ---");
			} else {
				System.out.println(" --- Fim da leitura de dados --- ");
			}

		} while (opc.equalsIgnoreCase("sim"));

		mediaClasse = somaMedias / totalAlunos;

		System.out.println("\n ####  ESTATISTICAS ####");
		System.out.println("Total de Alunos: " + totalAlunos);
		System.out.println("Total de Alunos APROVADOS: " + totalAprovados + " - (" + ((double) totalAprovados/totalAlunos)*100 + "%).");
		System.out.println("Total de Alunos de EXAME: " + totalExame + " - (" + ( (double) totalExame/totalAlunos)*100 + "%).");
		System.out.println("Total de Alunos REPROVADOS: " + totalReprovados + " - (" + ( (double) totalReprovados/totalAlunos)*100 + "%).");
		System.out.println("Média da Turma: " + mediaClasse);
		System.out.println("O aluno " + nomeMenorMedia + " possui a pior Média com valor: " + menorMedia);
		System.out.println("O aluno " + nomeMaiorMedia + " possui a melhor Média com valor: " + maiorMedia);
entrada.close();
	}

}