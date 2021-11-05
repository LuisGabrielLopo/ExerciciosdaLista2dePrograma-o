package ListaDeExercicios2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicios51 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] resultado = new int[5];
        String[] operadores = {"+","-","*","+","*"};
        System.out.println("*-----Iniciando o programa-----*");

        System.out.println("Preenchendo o PRIMEIRO vetor");
        for(int i = 0; i<vetor1.length; i++) {
            System.out.println("Informe o "+(i+1)+"º número");
            vetor1[i] = entrada.nextInt();
        }


        System.out.println("Preenchendo o SEGUNDO vetor");
        for(int i = 0; i<vetor2.length; i++) {
            System.out.println("Informe o "+(i+1)+"º número");
            vetor2[i] = entrada.nextInt();
        }


        System.out.println("\nImpressão");
        //V1
        for(int i = 0; i < vetor2.length; i++) {
            System.out.print(" "+vetor1[i]);
        }
        //OP
        System.out.print("\n"+ Arrays.toString(operadores)+"\n");
        //V2
        for(int i = 0; i < vetor2.length; i++) {
            System.out.print(" "+vetor2[i]);
        }
        System.out.println("\n");
        for(int i = 0; i<vetor1.length; i++) {
            int valorV1, valorV2;
            String valorOP;
            valorV1 = vetor1[i];
            valorV2 = vetor2[i];
            valorOP=operadores[i];

            switch(valorOP) {
                case "+":
                    resultado[i] = valorV1+valorV2;
                    break;
                case "-":
                    resultado[i] = valorV1-valorV2;
                    break;
                case "*":
                    resultado[i] = valorV1*valorV2;
                    break;
            }

        }
        System.out.println("Resultado:");
        System.out.print(Arrays.toString(resultado)+" ");

        entrada.close();






    }
}
