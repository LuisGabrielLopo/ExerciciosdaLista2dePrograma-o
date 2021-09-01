package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
        int ValorInicial, ValorFinal ;

        System.out.println("Informe o primeiro número: " );
        ValorInicial = entrada.nextInt();

        System.out.println("Informe o segundo número: ");
        ValorFinal = entrada.nextInt();

        if(ValorInicial <= ValorFinal) {
            while (ValorInicial <= ValorFinal) {
                System.out.println(ValorInicial);
                ValorInicial ++;
            }
        }else {
            while(ValorInicial >= ValorFinal) {
                System.out.println(ValorFinal);
                ValorFinal++;
            }
        }
				
		entrada.close();
	}

}
