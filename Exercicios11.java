package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num1, cont = 0;
		double num2, media, soma = 0.0;

		do {
			System.out.println("Informe o número a ser contabilizado: ");
			num1 = entrada.nextInt();
			System.out.println("Informe um número double:");
			num2 = entrada.nextDouble();
			if (num1 == 0 || num2 == 0.0) {
				System.out.println("Fim da contagem!");

			}
			else {
				cont ++ ;
				soma = num1 + num2;

			}

		}while (num1 != 0 || num2 !=0);
		media = soma / cont ;
		entrada.close();

		System.out.println("O resultado da média dos números é : " + media);



	}

}
