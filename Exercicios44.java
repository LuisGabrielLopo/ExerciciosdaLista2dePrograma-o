package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios44 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner entrada = new Scanner(System.in);

        int[] vetor = new int[10];
        int posMaior = 0, posMenor = 0, posRepetido = 0;
        boolean achei;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Por favor, informe o elemento " + (i + 1) + " do vetor: ");
            vetor[i] = entrada.nextInt();
            do {
                achei = false;
                for (int j = 0; j < i; j++) {
                    if (vetor[i] == vetor[j]) {
                        achei = true;
                        posRepetido = j;
                    }
                }

                if (achei == true) {
                    System.out.println("O elemento '" + vetor[i] + "' já existe no vetor na posição " + posRepetido + ", tente novamente: ");
                    vetor[i] = entrada.nextInt();
                }
            } while (achei == true);

            if (i == 0) {
                posMaior = i;
                posMenor = i;
            }

            if (vetor[i] > vetor[posMaior]) {
                posMaior = i;
            }

            if (vetor[i] < vetor[posMenor]) {
                posMenor = i;
            }
        }

        System.out.println("O menor elemento do vetor é o " + vetor[posMenor] + " que está na posição: " + posMenor);
        System.out.println("O maior elemento do vetor é o " + vetor[posMaior] + " que está na posição: " + posMaior);

    }
}
