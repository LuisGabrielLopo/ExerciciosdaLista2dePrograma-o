package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, i;
        System.out.println("Informe um número: ");
        num = entrada.nextInt();
        for (i = 0 ; i <= num ; i++ ) {
            if (i % 2 == 0) {
                System.out.println("números pares: " + i);
            }
            else {
                System.out.println("números impares: " + i);
            }
        }
        entrada.close();
    }
}
