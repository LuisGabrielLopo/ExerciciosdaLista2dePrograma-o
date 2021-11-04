package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios47 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[]vetor1 = new int[10];
        int[]vetor2 = new int[10];
        int[]vetor3 = new int[20];
        int i;
        int j = 0;

        System.out.println("Vetor 1: ");
        for ( i = 0; i < vetor1.length; i++ ){
            System.out.print(" ");
            vetor1[i] = entrada.nextInt();

        }
        System.out.println("Vetor 2: ");
        for ( i = 0; i < vetor2.length; i++ ) {
            System.out.print(" ");
            vetor2[i] = entrada.nextInt();
        }
        for (i = 0; i < 10; i++){
            vetor3[j] = vetor1[i];
            j++;
            vetor3[j] = vetor2[i];
            j++;
        }
        System.out.println("Intercalação dos vetores 1 e 2: ");
        for (j = 0; j< vetor3.length; j++){
            System.out.println(vetor3[j]);
        }
        entrada.close();

    }

}
