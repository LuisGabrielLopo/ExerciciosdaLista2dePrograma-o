package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x = 5, y = 12, accum = 1;

        for(int i = 1; i <= y; i++)
        {
            accum *= x;
        }

        System.out.println(x + " ^ " + y + " = " + accum);
        entrada.close();

    }
}
