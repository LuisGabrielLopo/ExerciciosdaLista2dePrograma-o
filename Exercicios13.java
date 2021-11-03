package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num ;
		
		System.out.println("Informe o n�mero : ");
		num = entrada.nextInt();
		
		while(num < 1 || num > 5) {
			System.out.println("Entrada invalida, tente novamente! ");
			num = entrada.nextInt();
		}
		System.out.println("Parabéns o número digitado foi: " + num);
		entrada.close();

	}

}
