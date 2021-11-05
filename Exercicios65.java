package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios65 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, p, Cnp, Anp;

        //Informando valores criando repetição
        do {
            System.out.println("Informe um valor para N");
            n = entrada.nextInt();

            System.out.println("Informe um valor para P");
            p = entrada.nextInt();

            //Criando condicional
            if (n < 0 || p < 0) {
                System.out.println("Não existe fatorial de número negativo. Tente novamente.");
            }
            //Continuação da condicional usando repetição
        } while (n < 0 || p < 0);


        //Chamando função fatorial
        Cnp = fatorial(n) / (fatorial(p) * fatorial(n - p));
        Anp = fatorial(n)/ fatorial(n-p);

        //Imprimindo resultado
        System.out.println("O arranjo de " + n + " tomados de " + p + " vale: " + Anp);
        System.out.println("A combinação de " + n + " tomados de " + p + " vale: " + Cnp);
    }

    // criando função fatorial
    public static int fatorial(int num) {
        int fat = 1;
        //calculando fatorial
        for (int i = 1; i <= num; i++) {
            fat *= i;
        }
        //retornando valor fatorial calculado
        return fat;
    }
}
