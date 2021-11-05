package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios55 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maxLinhasA = 4, maxColunasA = 4;
        int maxLinhasB = 4, maxColunaB = 4;
        int somaLinha = 4, somaColuna = 4;
        int[][] matrizA = new int[maxLinhasA][maxColunasA];
        int[][] matrizB = new int[maxLinhasA][maxColunasA];
        int[][] matrizSoma = new int[somaLinha][somaColuna];

        for (int i = 0; i < maxLinhasA; i++) {
            for (int j = 0; j < maxColunasA; j++) {
                System.out.println("Por favor, informe o elemento da matrizA [" + i + "][" + j +"] :");
                matrizA[i][j] = entrada.nextInt();
            }

        }
        for (int i = 0; i < maxLinhasB; i++) {
            for (int j = 0; j < maxColunaB; j++) {
                System.out.println("Por favor, informe o elemento da matriz B [" + i + "][" + j +"] :");
                matrizB[i][j] = entrada.nextInt();
            }

        }
        for (int i = 0; i < somaLinha; i++) {
            for (int j = 0; j < somaColuna ; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
                System.out.println("A soma dos elementos da matriz A [" + i + "]["+ j + "]  com a matriz B [" + i +"][" +
                        j + "] = "  + matrizSoma[i][j]);
            }
            
        }
        System.out.println("\nImprimindo a matrizA ...");
        imprimindoMatrizesA(matrizA);

        System.out.println("\nImprimindo a matrizB ...");
        imprimindoMatrizesB(matrizB);

        System.out.println("\nImprimindo a soma das matrizes ...");
        imprimindoSomaMatrizes(matrizSoma);

    }
    public static void imprimindoMatrizesA(int[][] matrizA){
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length ; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    public static void imprimindoMatrizesB(int[][] matrizB){
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length ; j++) {
                System.out.print(matrizB[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    public static void imprimindoSomaMatrizes(int[][] somaMatrizes){
        for (int i = 0; i < somaMatrizes.length; i++) {
            for (int j = 0; j < somaMatrizes.length ; j++) {
                System.out.print(somaMatrizes[i][j] + "\t");
            }
            System.out.println("");
        }
    }

}
