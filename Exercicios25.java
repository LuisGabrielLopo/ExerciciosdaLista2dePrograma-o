package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numTabuada, i, mutiplica ;

        System.out.println("Informe um número para realizar a tabuada: ");
        numTabuada = entrada.nextInt();

        while (numTabuada > 10 || numTabuada < 1){
            System.out.println("Número Inválido, favor, insira um número de 1 até 10");
            numTabuada = entrada.nextInt();
        }
        for (i = 0; i <= 10; i++){
            mutiplica = numTabuada * i;
            System.out.println("A tabuada de " + numTabuada + " X " +  i + " é " +  mutiplica);
        }
        entrada.close();
    }
}
