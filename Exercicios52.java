package ListaDeExercicios2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios52 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[]janela = new int[24];
        int[]corredor = new int[24];
        int numero, op, selecionada, posicao;


        for (int i = 0; i < 24; i++ ){
            janela[i] = 0;
            corredor[i] = 0;
        }
        do {
            do {
                System.out.println("SELECIONE 1 - COMPRAR PASSAGEM");
                System.out.println("SELECIONE 2 - MAPA DO ÔNIBUS");
                System.out.println("SELECIONE 3 - ENCERRAR");
                op = entrada.nextInt();
            }while(op < 1 || op > 3);
            if (op == 1 ){
                selecionada = 0;
                for (int i = 0; i < 24; i++) {
                    if (corredor[i] == 0 || janela[i] ==0)
                        selecionada = 1;
                }
                if (selecionada == 0){
                    System.out.println("\n ôNIBUS LOTADO!");
                }
                else{
                    do {
                        System.out.println("\n SELECIONE 1 - JANELA");
                        System.out.println("\n SELECIONE 2 - CORREDOR");
                        posicao = entrada.nextInt();
                    }while (posicao < 1 && posicao >2 );
                    do {
                        System.out.println("\nNumero da poltrona: ");
                        numero = entrada.nextInt();
                    }while (numero < 0 || numero > 23);
                    if (posicao == 1 && janela[numero] == 1){
                    System.out.println("** POLTRONA OCUPADA **");
                     }
                    else if (posicao == 1 && janela[numero] == 0){
                    System.out.println("** VENDA REALIZADA **");
                    janela[numero] = 1;
                     }
                    else if (posicao == 2 && corredor[numero] == 1){
                    System.out.println("** POLTRONA OCUPADA **");
                     }
                    else if (posicao == 2 && corredor[numero] == 0) {
                    System.out.println("** VENDA REALIZADA **");
                    corredor[numero] = 1;
                     }
                }
            }

            if (op == 2){
                System.out.println("\n\t\t==========================");
                System.out.println("\n\t\tJANELA \t\t CORREDOR ");
                System.out.println("\n\t\t==========================");

                for (int i = 0; i < 24; i++) {
                    if (janela[i] == 0 && corredor[i] == 0){
                        System.out.println("\n\t\t - LIVRE \t  - Livre "+i + i);
                    }
                    else if (janela[i] == 0 && corredor[i] ==1) {
                        System.out.println("\n\t\t%d - LIVRE \t  - OCUPADA " + i + i);
                    }
                    else if (janela[i] == 1 && corredor[i] ==1) {
                        System.out.println("\n\t\t - OCUPADA \t  - LIVRE " + i + i);
                    }
                    else if (janela[i] == 1 && corredor[i] ==1) {
                        System.out.println("\n\t\t - OCUPADA \t  - Ocupada " + i + i);
                    }
                }
                System.out.println("\n\t\t======================================");
            }
            System.out.println("\n\n\n");
        }while (op != 3);


    }
}
