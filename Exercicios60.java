package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios60 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qntAlunos = 3, qntQuestoes = 4;
        char[][] matrizRespostas = new char[qntAlunos][qntQuestoes];
        char[] gabarito = { 'B', 'C', 'A', 'D' };
        int[] acertos = new int[qntAlunos];

        //Leitura de dados
        for (int i = 0; i < matrizRespostas.length; i++) {
            for (int j = 0; j < matrizRespostas[i].length; j++) {
                System.out.println("Informe a resposta da Questão " + (j + 1) + " do Aluno " + (i + 1) + " : ");
                matrizRespostas[i][j] = entrada.next().charAt(0);
                while (matrizRespostas[i][j] != 'A' && matrizRespostas[i][j] != 'B' && matrizRespostas[i][j] != 'C'
                        && matrizRespostas[i][j] != 'D' && matrizRespostas[i][j] != 'E' && matrizRespostas[i][j] != 'a'
                        && matrizRespostas[i][j] != 'b' && matrizRespostas[i][j] != 'c' && matrizRespostas[i][j] != 'd'
                        && matrizRespostas[i][j] != 'e') {

                    System.out.println("Resposta inválida, digite apenas A, B, C, D, E");
                    System.out.println("Informe a resposta da Questão " + (j + 1) + " do Aluno " + (i + 1) + " : ");
                    matrizRespostas[i][j] = entrada.next().charAt(0);
                }
            }
        }

        // Computação de Acertos dos alunos
        for (int i = 0; i < matrizRespostas.length; i++) {
            acertos[i] = 0;
            System.out.println("A Aluno " + (i+1) + " acertou as questões: ");
            for (int j = 0; j < matrizRespostas[i].length; j++) {
                if(Character.toUpperCase(matrizRespostas[i][j]) == Character.toUpperCase(gabarito[j]))
                {
                    System.out.print("Q" + (j+1) + "  ");
                    acertos[i]++;
                }
            }
            System.out.println("\nTotal de acertos: " + acertos[i] + "\n");
        }
    }
}
