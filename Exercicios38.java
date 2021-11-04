package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios38 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, c, soma = 0, N;

        System.out.println("Informe um número limite da verificação do número ser perfeito: ");
        N = entrada.nextInt();
        while (N <= 1) {
            System.out.println("Informe um númer acima de 1: ");
            N = entrada.nextInt();
        }

        for (num = 2; num <= N; num++) {
            soma = 0;
            for (c = 1; c <= num / 2; c++) {
                if (num % c == 0) {
                    soma += c;
                }
            }

            if (num == soma) {
                System.out.println(num + " é PERFEITO!");
            }
        }

        entrada.close();
    }
}
