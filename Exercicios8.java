package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int divisor, inicio, fim, num;
		
		System.out.println("Informe o divisor: ");
		divisor = entrada.nextInt();
		
		System.out.println("Informe o inicio do intervalo: ");
		inicio = entrada.nextInt();
		
		System.out.println("Informe o fim do intervalor: ");
		fim = entrada.nextInt();
		
		if(inicio <= fim ) {
			System.out.println("Numeros divisiveis por "+ divisor + " no intervalo "
					+ inicio + " até "+ fim +" são");
			num = inicio ;
			
			while(num <= fim ) {
				if (num % divisor == 0 ) {
					System.out.print(num + " ,");
				}
				num ++ ;
			}
		}
		else {
			num = inicio ;
			while(num >= fim) {
				if(num % divisor == 0) {
					System.out.print(num + " ,");
				}
				num -- ;
			}
		}
		entrada.close();
	}

}
