package ListaDeExercicios2;

import java.util.Random;
import java.util.Scanner;

public class Exercicios67 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int palpite = 0, tentativas = 0;
        int sorteado;

        Random numeroAleatorios = new Random();
        sorteado = numeroAleatorios.nextInt(1000) + 1 ;
        System.out.println("Numero entre 1 e 10");

        do {
            System.out.println("-----------------------");
            System.out.println("Número de tentativas:  " + tentativas);
            System.out.println("Qual é o seu palpite: ");
            palpite = entrada.nextInt();

            tentativas ++;
            dica(palpite, sorteado,tentativas);
        }while (palpite != sorteado);

    }
    private static void dica(int palpite, int numero, int tentativas){
        if(palpite > numero){
            System.out.println("Seu palpite é maior que o número sorteado !!!! ");
        }
        else {
            if (palpite < numero){
                System.out.println("Seu palpite é menor que o número sorteado !!! ");
            }
            else {
                System.out.println("Você acertou | " );
                System.out.println("O número sorteado era " + numero);
                System.out.println("Você tentou " + tentativas + " vezes antes de acertar!! ");
            }
        }
    }

}
