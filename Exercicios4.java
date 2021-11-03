package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int idade;
		String nome;
		
		do {
			System.out.println("informe o nome: ");
			nome = entrada.next();
			System.out.println("Informe a idade:");
			idade = entrada.nextInt();
				if (idade == 0 ) {
					System.out.println("Fim da coleta de dados");
				}
				else {
					System.out.println("O usuário " + nome + " tem " + idade + " anos de vida");
				}
		}while(idade >= 1 );
		entrada.close();
		


	}

}
