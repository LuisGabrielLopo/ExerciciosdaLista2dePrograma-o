package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n, fatoracao=1;

		
		System.out.println("Informe um número : ");
		n = entrada.nextInt();
		
		while(n<0) {
			System.out.println("Impossivel fatoraçãoo, informe um número positivo.");
			n = entrada.nextInt();
		}
		
		
		while(n>=1) {
			fatoracao = fatoracao*n;		
			n--;
		}
		
		System.out.println("O fatorial é: "+fatoracao);
		entrada.close();
	}


}
