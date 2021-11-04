package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numTabuada, i, tabuada = 0 ;

        for (i = 1; i <= 10; i ++){
            for (numTabuada = 1; numTabuada <= 10 ; numTabuada ++){
                System.out.println(i + " x " + numTabuada + " = " + i * numTabuada);
            }

        }
        entrada.close();
    }
}
