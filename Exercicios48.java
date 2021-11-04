package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios48 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vet1 = new int[10];
        int[] vet2 = new int[5];

        for(int i = 0; i<vet1.length; i++) {
            System.out.println("Informe o "+(i+1)+"º valor para ser alocado na posição: "+i);
            vet1[i] = entrada.nextInt();
        }

        for(int j = 0; j<vet2.length; j++) {
            System.out.println("Informe o "+(j+1)+"º valor para ser alocado na posição: "+j);
            vet2[j] = entrada.nextInt();
        }
        System.out.println("Imprimindo vetor 1");
        for(int i = 0; i <vet1.length; i++) {
            System.out.print(vet1[i]+" ");
        }
        System.out.println("\nImprimindo vetor 2");
        for(int j = 0; j<vet2.length; j++) {
            System.out.print(vet2[j]+" ");
        }

        System.out.println("\nIndentificando divisores");
        for(int i = 0; i<vet1.length; i++) {
            for (int k = 0; k < vet2.length; k++) {
                if (vet1[i] % vet2[k] == 0) {
                    System.out.println("\nO Número:  " + vet1[i]  + " do VETOR 1 é divisivel por " + vet2[k] + " na posição " + k);
                }
            }
        }


    }
}
