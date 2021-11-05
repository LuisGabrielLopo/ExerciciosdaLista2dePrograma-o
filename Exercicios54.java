package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios54 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maxLinhas = 10, maxColunas = 10;
        int[][] matriz = new int[maxLinhas][maxColunas];
        int posMaiorLinha = 0,posMaiorColuna = 0, posMenorLinha = 0,posMenorColuna = 0;
        double mediaFinal = 0.0, somaTotal = 0.0;

        for (int i = 0; i < maxLinhas ; i++) {
            for (int j = 0; j < maxColunas; j++) {
                System.out.println("Por favor, informe o elemento da matriz [" + i + "][" + j +"] :");
                matriz[i][j] = entrada.nextInt();



                if (i == 0 && j ==0) {
                    posMaiorLinha = i;
                    posMaiorColuna = j;
                    posMenorLinha = i;
                    posMenorColuna = j;
                }
                if (matriz[posMaiorLinha][posMaiorColuna] < matriz[i][j]){
                    posMaiorLinha = i;
                    posMaiorColuna = j;

                }
                if (matriz[posMenorLinha][posMenorColuna] > matriz[i][j]){
                    posMenorLinha= i;
                    posMenorColuna = j;

                }
                somaTotal += matriz[i][j];
                mediaFinal = somaTotal / matriz[i][j];
            }

        }
        System.out.println("#####-----------ESTATISTICAS-----------#####");

        System.out.println(" O maior elemento da matriz é o : " + matriz[posMaiorLinha][posMaiorColuna]
        +" que está na linha " + posMaiorLinha + " e coluna: " + posMaiorColuna);

        System.out.println(" O menor elemento da matriz é o : " + matriz[posMenorLinha][posMenorColuna]
                +" que está na linha " + posMenorLinha + " e coluna: " + posMenorColuna);

        System.out.println(" A media dos elemento da matriz é : " + mediaFinal );

    }
}
