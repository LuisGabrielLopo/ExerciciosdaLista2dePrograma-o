package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade, cont = 0, menorIdade = 150, maiorIdade = 0;
        double media, soma = 0.0;

        do {
            System.out.println("Informe a idade da pessoa: ");
            idade = entrada.nextInt();
            while(idade < 0) {
                System.out.println("Numero invalido informe novamente: ");
                idade = entrada.nextInt();
            }
            if (idade == 0) {
                System.out.println("FIm da coleta de idades!");
            }
            else {
                cont ++;
                soma = soma + idade;

                if (idade > maiorIdade) {
                    maiorIdade = idade ;
                }
                if (idade < menorIdade) {
                    menorIdade = idade ;
                }
            }



        }while(idade != 0);
        media = soma / cont;
        entrada.close();

        System.out.println("\n\n #### ESTÁ1TISTICAS #### \n\n");
        System.out.println("Quantidade de numeros: " + cont );
        System.out.println("Maior numero informada:  " + maiorIdade);
        System.out.println("Menor numero informada:  " + menorIdade);
        System.out.println("Média das idades: " + media );
    }
}
