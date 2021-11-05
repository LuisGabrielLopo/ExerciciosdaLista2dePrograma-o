package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios57 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maxLinhas = 5, maxColunas = 5;
        int vetTamanhoLinha = maxLinhas;
        int vetTamanhoColuna = maxColunas;
        int[][] matriz = new int[maxLinhas][maxColunas];
        int[] vetorSL = new int[vetTamanhoLinha];
        int[] vetorSC = new int[vetTamanhoColuna];
        int soma;

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
        for (int j = 0; j < maxColunas; j++) {
            for (int i = 0; i < maxLinhas; i++) {
                vetorSC[j] =  vetorSC[j] + matriz[i][j] ;
            }
            System.out.println("As somas das colunas " + j  + "  é "   + vetorSC[j]);

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
