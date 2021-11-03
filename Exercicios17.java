package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		String nome, opc;
		double nota1, nota2, media;
		
		do{
			System.out.println("Entre com o nome do aluno: ");
			nome = entrada.nextLine();
			
			System.out.println("Entre com o grau A: ");
			nota1 = entrada.nextDouble();
			while(nota1 < 0 || nota1 > 10){
				System.out.println("ERRO: Nota inválida! Digite novamente a nota: ");
				nota1 = entrada.nextDouble();
			}
			
			System.out.println("Entre com o grau B: ");
			nota2 = entrada.nextDouble();
			while(nota2 < 0 || nota2 > 10){
				System.out.println("ERRO: Nota inválida! Digite novamente a nota: ");
				nota2 = entrada.nextDouble();
			}
			
			media = (nota1 + nota2) / 2.0;
			
			System.out.println("O aluno " + nome + " tem uma média: " + media);
			
			entrada.nextLine(); // para limpeza do buffer
			
			System.out.println("Continuar (sim/nao)? ");
			opc = entrada.nextLine();
			while(!opc.equalsIgnoreCase("sim") && !opc.equalsIgnoreCase("nao")){
				System.out.println("Opção inválida, digite apenas 'Sim' ou 'Nao': ");
				opc = entrada.nextLine();
			}
			
			if(opc.equalsIgnoreCase("sim"))
			{
				System.out.println(" --- Lendo dados de um novo aluno ---");
			}
			else{
				System.out.println(" --- Fim da leitura de dados --- ");
			}
			
		}while(opc.equalsIgnoreCase("sim"));
		entrada.close();
	}

}
