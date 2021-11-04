package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome ;
        int  i;
        System.out.println("Informe seu nome: ");
        nome = entrada.next();
        for (i = 0; i<100; i++ ){
            System.out.println(nome);
        }
        entrada.close();


    }
}
