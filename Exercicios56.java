package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios56 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maxLinhas = 3, maxColunas = 5;
        int vetTamanho = maxLinhas;
        int[][] matriz = new int[maxLinhas][maxColunas];
        int[] vetorSL = new int[vetTamanho];

        for (int i = 0; i < maxLinhas; i++) {
            for (int j = 0; j < maxColunas; j++) {
                System.out.println("Por favor, informe o elemento da matriz [" + i + "][" + j +"] :");
                matriz[i][j] = entrada.nextInt();
            }

        }
        System.out.println("\nImprimindo a matriz ...");
        imprimindoMatriz(matriz);
        for (int i = 0; i < maxLinhas; i++) {
            for (int j = 0; j < maxColunas; j++) {
                vetorSL[i] = vetorSL[i] + matriz[i][j];
            }
            System.out.println("As somas das linhas " + i + "  é "   + vetorSL[i]);
            
        }

    }
    public static void imprimindoMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length ; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }

}

