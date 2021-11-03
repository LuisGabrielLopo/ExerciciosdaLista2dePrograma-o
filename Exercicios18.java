package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int senha, senhaCadastrada;
		
		System.out.println("Cadastre sua senha : ");
		senhaCadastrada = entrada.nextInt() ;
		
		do {
			System.out.println("Informe  a senha: ");
			senha = entrada.nextInt();
			
			if (senha != senhaCadastrada) {
				System.out.println("Senha inválida");
			}
			else {
				System.out.println("Senha correta! Bem-vindo ao sistema.");
			}
		}while(senha != senhaCadastrada );
		entrada.close();
	}

}
