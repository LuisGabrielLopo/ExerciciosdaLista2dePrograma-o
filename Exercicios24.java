package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numInicial, numFinal, i, soma;

        System.out.println("Informe um número inicial: ");
        numInicial = entrada.nextInt();
        System.out.println("Informe um número Final: ");
        numFinal = entrada.nextInt();

        if (numInicial >numFinal ){
            System.out.println("Número inválido, favor digite um número maior que o número inicial: ");
            numFinal =entrada.nextInt();
        }

        soma = numInicial;
        for(i = numInicial + 1; i <= numFinal; i ++ ){
            soma = soma + i ;
        }
        System.out.println(soma);
        entrada.close();





    }
}
