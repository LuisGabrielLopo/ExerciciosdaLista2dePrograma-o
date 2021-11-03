package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n , cont = 0;
		
		do {
		System.out.println("Informe um número inteiro: ");
		n = entrada.nextInt();
		while(n >=0) {
			cont ++ ;
		}
		if (n < 0) {
			System.out.println("Finalizando programa");
		}
		}while(n >= 0);
		
		System.out.println("Foram contados " + cont + " números");
		entrada.close();
	}
}
