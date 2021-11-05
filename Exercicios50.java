package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios50 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[5];
        int soma = 0;
        int resultado = 0;

        for (int indice = 0; indice < vetor1.length; indice++  ){
            System.out.println("Informe o " + (indice + 1) +"ª valor do vetor 1:");
           vetor1[indice] = entrada.nextInt();
       }
        for (int indice = 0; indice < vetor2.length; indice++  ) {
            System.out.println("Informe o " + (indice + 1) + "ª valor do vetor 2:");
           vetor2[indice] = entrada.nextInt();
       }
        System.out.println("Primeiro Vetor");
        for(int i = 0; i <vetor1.length; i++) {
           System.out.print(vetor1[i]+" ");
       }
        System.out.println("\nSegundo  Vetor");
        for(int j = 0; j<vetor2.length; j++) {
            System.out.print(vetor2[j]+" ");
        }

        for (int i = 0; i < vetor2.length ; i++) {
            soma = soma + vetor2[i];

        }
        for (int i = 0; i < vetor1.length; i++) {
            resultado = (soma + vetor1[i]);
            if (resultado  % 2 == 0 ){
                System.out.println("O resultado da soma do " + ( i + 1)+ "º vetor 1 com todos os números do vetor dois é " + resultado + " esse número é par");
            }
            else{
                System.out.println("O resultado da soma do " + ( i + 1)+ "º vetor 1 com todos os números do vetor dois é " + resultado + " esse número é impar");
            }
        }
        entrada.close();


    }
}
