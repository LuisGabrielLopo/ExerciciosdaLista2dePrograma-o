package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, c, soma = 0;

        System.out.println("Informe um número a se verificar se é perfeito: ");
        num = entrada.nextInt();

        for(c = 1; c <= num/2; c++)
        {
            if (num % c == 0){
                soma += c;
            }
        }

        if(num == soma)
        {
            System.out.println(num + " é PERFEITO!");
        }
        else{
            System.out.println(num + " NÃO é PERFEITO!");
        }

        entrada.close();
    }
}
