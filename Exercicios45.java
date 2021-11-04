package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios45 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[]qntDeNumeros = new int[15];
        int indice;
        double raiz = 0.0;

        for (indice = 0; indice < qntDeNumeros.length; indice++){
            System.out.println("Informe o número da " + (indice +1) + "º posição : ");
            qntDeNumeros[indice] = entrada.nextInt();
            if (qntDeNumeros[indice] >= 0){
                raiz = Math.sqrt(qntDeNumeros[indice]);
            }
            else {
                raiz = (-1);
                System.out.println("Não possivel realizar raiz de número meno que zero!");
            }
            System.out.println("A raiz quadrada do número " + qntDeNumeros[indice] + " = " + raiz );
        }
        entrada.close();

    }
}
