package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios61 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int colunaMatriz = 4, linhaMatriz = 5;
        double[][] matrizNotas = new double[linhaMatriz][colunaMatriz];
        double[] vetorVA = new double[linhaMatriz];
        double[] vetorVN = new double[colunaMatriz];
        double media = 0;

        // abastacendo a matriz
        for (int i = 0; i < linhaMatriz; i++) {
            for (int j = 0; j < colunaMatriz; j++) {
                System.out.println("Informe a " + (j + 1) + "ª nota do Aluno " + (i + 1));
                matrizNotas[i][j] = entrada.nextDouble();

                while(matrizNotas[i][j] < 0) {
                    System.out.println("A nota "+matrizNotas[i][j]+" é inválida!!!");
                    System.out.println("Informe a " + (j + 1) + "ª nota do Aluno " + (i + 1));
                    matrizNotas[i][j] = entrada.nextDouble();
                }
            }
        }

        // Imprimindo a matriz de notas
        System.out.println("");
        System.out.println("\t N1 \t N2 \t N3 \t N4 \t VA");
        imprimirMatriz(matrizNotas);

        System.out.println("");

        // definir a média da soma das 4 notas de cada aluno
        for (int i = 0; i < linhaMatriz; i++) {
            for (int j = 0; j < colunaMatriz; j++) {
                vetorVA[i] += matrizNotas[i][j];
            }
            media = vetorVA[i] / colunaMatriz;
            System.out.println("Media do Aluno " + (i + 1) + ": " + media);
        }
        System.out.println("");

        // definir a média em cada N de todos os alunos
        for(int j = 0; j < colunaMatriz; j++) {
            for(int i = 0; i < linhaMatriz; i++) {
                vetorVN[j] = vetorVN[j]+matrizNotas[i][j];
            }
            media = vetorVN[j]/linhaMatriz;
            System.out.println("Média da nota N"+(j+1)+": "+media);
        }

    }

    public static void imprimirMatriz(double[][] matrizNotas) {

        for (int i = 0; i < matrizNotas.length; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            for (int j = 0; j < matrizNotas[i].length; j++) {
                System.out.print(matrizNotas[i][j] + "\t");
            }
            System.out.println();
        }
    }

}

