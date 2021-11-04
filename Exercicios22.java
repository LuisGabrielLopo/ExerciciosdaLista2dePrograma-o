package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i, num;

        System.out.println("Informe um número");
        num = entrada.nextInt();

        for (i =0 ; i<= num ; i++ ){
            System.out.println(i);
        }
        entrada.close();
    }
}
