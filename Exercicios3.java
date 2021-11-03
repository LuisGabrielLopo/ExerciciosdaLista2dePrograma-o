package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int numero,cont = 0,  maiorNumero = 0, menorNumero = 999 ;
		double media, soma = 0.0 ;
		
		do {
			System.out.println("Informe o número a ser contabilizado: ");
			numero = entrada.nextInt();
			while(numero < 0) {
				System.out.println("Numero invalido informe novamente: ");
				numero = entrada.nextInt();
			}
			if (numero == 0) {
				System.out.println("Fim da contagem!");
				
			}
			else {
				cont ++ ; 
				soma = soma + numero;
				
				if (numero > maiorNumero) {
					maiorNumero = numero ;
				}
				if (numero < menorNumero) {
					menorNumero = numero ;
				}
			}
			
		}while (numero != 0);
		media = soma / cont ;
		entrada.close();
		
		System.out.println("\n\n #### ESTÁ1TISTICAS #### \n\n");
		System.out.println("Quantidade de numeros: " + cont);
		System.out.println("Maior numero informada:  " + maiorNumero);
		System.out.println("Menor numero informada:  " + menorNumero);
		System.out.println("Média dos  numeros: " + media );
		

	}

}
