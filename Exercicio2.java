package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int idade, cont = 1, menoresIdade = 0, adultos = 0, idosos = 0;


        do {
            System.out.println("Informe a idade da pessoa: "+cont);
            idade = entrada.nextInt();

            if(idade<18) {
                menoresIdade++;
            }else if(idade >=18 && idade <=65) {
                adultos++;
            }else {
                idosos++;
            }

            cont++;
        }while(cont <=10);

        System.out.println("Quantidade de pessoas com menos de 18 anos: "+menoresIdade);
        System.out.println("Quantidade de pessoas entre 18 e 65 anos: "+adultos);
        System.out.println("Quantidade de pessoas que tem mais de 65 anos: "+idosos);
        entrada.close();

	}

}
