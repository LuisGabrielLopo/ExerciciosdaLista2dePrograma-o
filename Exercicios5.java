package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num, qntNum = 0, exit;
		double soma = 0.0, media;
		

		do {
		System.out.println("Informe um número: ");
		num = entrada.nextInt();
		soma = soma + num;
		qntNum ++;
		
		System.out.println("Deseja continuar ? (1) - sim (2) - não ");
		exit = entrada.nextInt();
		}
		while(exit == 1);
		media = soma / qntNum;
		entrada.close();
		
		System.out.println("A soma dos" + qntNum +  "números : " + soma );
		System.out.println("Foram contados " + qntNum + " números" );
		System.out.println("A média dos " + qntNum + " é : " + media );
		
		
		


	}

}
