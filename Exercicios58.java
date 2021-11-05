package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios58 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maxLinhas = 8, maxColunas = 8;
        int[][] matriz = new int[maxLinhas][maxColunas];
        int posMaiorLinha = 0, posMaiorColuna = 0;
        int maiorElemento = 0;
        int soma = 0;

        for (int i = 0; i < maxLinhas; i++) {
            for (int j = 0; j < maxColunas; j++) {
                System.out.println("Por favor, informe o elemento da matriz [" + i + "][" + j +"] :");
                matriz[i][j] = entrada.nextInt();
            }

        }
        for (int i = 0; i < maxLinhas; i++) {
            for (int j = 0; j < maxColunas; j++) {
                if (i == j){
                    System.out.println("Valor da diagonal da matriz [" + i + "][" + j + "] é: " + matriz[i][j]);
                    if (matriz[i][j] > maiorElemento){
                        maiorElemento = matriz[i][j];
                        posMaiorLinha = i;
                        posMaiorColuna = j;

                    }
                }

            }
        }
        for (int i = 0; i < maxLinhas ; i++) {
            for (int j = 0; j < maxColunas; j++) {
                if (j==maxColunas -1 -i){
                    System.out.println("Valor da diagonal secundaria da matriz [" + i + "][" + j + "] é: " + matriz[i][j]);
                    soma += matriz[i][j];
                }

            }

        }

        System.out.println("\nImprimindo a matriz ...");
        imprimindoMatriz(matriz);

        System.out.println("#####-----------ESTATISTICA-----------#####");

        System.out.println(" O maior elemento da diagonal principal é o : " + maiorElemento
                +" que está na linha " + posMaiorLinha + " e coluna: " + posMaiorColuna);
        System.out.println(" A soma da diagonal inversa é :" + soma);

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
