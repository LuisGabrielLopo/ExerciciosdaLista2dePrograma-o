package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios43 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[]posicoesDosNumeros = new int[10];
        int[]numerosInseridos = new int[posicoesDosNumeros.length];
        int indice;
        for (indice = 0; indice < posicoesDosNumeros.length; indice++ ) {
            System.out.println("Informe um número na " + (indice + 1) + "º posição :");
            posicoesDosNumeros[indice] = entrada.nextInt();

            while (posicoesDosNumeros[indice] < 0){
                System.out.println("Números inválidos, insira um número positivo ");
                posicoesDosNumeros[indice] = entrada.nextInt();
            }

        }
        System.arraycopy(posicoesDosNumeros,0,numerosInseridos,0,numerosInseridos.length);

        System.out.println("Números acima de 50 :");
        for (indice = 0; indice < posicoesDosNumeros.length; indice++){
            if (posicoesDosNumeros[indice] > 50){
                System.out.println("Número na posição " + (indice + 1) + "º = " +numerosInseridos[indice]);
            }
        }
        if (posicoesDosNumeros.length < 50 ){
            System.out.println("Não há números abaixo de 50");
        }
    }
}
