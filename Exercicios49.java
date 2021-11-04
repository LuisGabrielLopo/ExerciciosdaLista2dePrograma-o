package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios49 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] vetor = new float[10];
        int codigo;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("informe o " + (i + 1) + "º número:");
            vetor[i] = entrada.nextFloat();
        }

        System.out.println("Informe o codigo: " );
        System.out.println("( 0 ) - Para Sair ");
        System.out.println("( 1 ) - Para Imprimir os números em ordem direta");
        System.out.println("( 2 ) - Para imprimir os números em ordem inversa ");
        codigo = entrada.nextInt();

        while (codigo < 0 || codigo > 2){
            System.out.println("Código inválido favor informe o código correto");
            codigo = entrada.nextInt();
        }

        if (codigo == 0) {
            System.out.println("Saindo do programa...");
        }

        if (codigo == 1 ) {
            for (int i = 0; i < vetor.length; i++){
                System.out.println(vetor[i]+" ");
            }
        }
        if (codigo == 2 ) {
            for (int i = vetor.length - 1; i >= 0; i--){
                System.out.println(vetor[i] +" " );
            }
        }
        entrada.close();

    }
}
