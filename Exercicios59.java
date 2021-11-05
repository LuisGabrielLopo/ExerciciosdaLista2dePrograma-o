package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios59 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maxLinhasA = 3, maxColunasA = 3;
        int maxLinhasB = 3, maxColunaB = 3;
        int[][] matrizA = new int[maxLinhasA][maxColunasA];
        int[][] matrizB = new int[maxLinhasA][maxColunasA];

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

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {

                for (int k = 0; k < matrizB.length; k++) {
                    for (int l = 0; l < matrizB[k].length; l++) {

                        if(matrizA[i][j] == matrizB[k][l]) {
                            System.out.println("Elemento repetido encontrado!");
                            System.out.println("O número: "+matrizA[i][j]+" da matrizA linha "+i+", coluna "+j+
                                    ". Se repete na na matrizB linha "+k+", coluna "+j+".");

                        }
                    }
                }
            }
        }


        System.out.println("\nImprimindo a matrizA ...");
        imprimindoMatrizesA(matrizA);

        System.out.println("\nImprimindo a matrizB ...");
        imprimindoMatrizesB(matrizB);

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
}
