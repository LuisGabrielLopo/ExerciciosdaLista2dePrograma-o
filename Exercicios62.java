package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios62 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner entrada = new Scanner(System.in);
        int tam = 5;
        int[] vetorA = new int[tam];
        int[] vetorB = new int[tam];
        int[][] matriz = new int[2][5];

        // abastecendo o vetor A
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º elemento do vetor A");
            vetorA[i] = entrada.nextInt();
        }

        // abastecendo o vetor B
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º elemento do vetor B");
            vetorB[i] = entrada.nextInt();
        }

        // criando MATRIZ
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0) {
                    matriz[i][j] = vetorA[j];
                } else {
                    matriz[i][j] = vetorB[j];
                }
            }

        }

        System.out.println("Imprimindo VETOR A");
        imprimirVetorA(vetorA);

        System.out.println("Imprimindo VETOR B");
        imprimirVetorB(vetorB);

        System.out.println("Imprimindo MATRIZ");
        imprimirMatriz(matriz);

        entrada.close();
    }

    public static void imprimirVetorA(int[] vetorA) {
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + "\t ");
        }
        System.out.println();
    }

    public static void imprimirVetorB(int[] vetorB) {
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + "\t ");
        }
        System.out.println();
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t ");
            }
            System.out.println();
        }

    }
}
