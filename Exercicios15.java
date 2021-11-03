package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num,contPar = 0,contImpar = 0 ;

        do {
            System.out.println("Informe um número");
            num = entrada.nextInt();
            while(num < 0){
                System.out.println("Número inválido, favor informe um número positivo!!!");
                num = entrada.nextInt();
            }
            if (num == 0 ){
                System.out.println("Fim da coleta de dados");
            }
            else if (num % 2 == 0){
                contPar ++;
            }
            else {
                contImpar ++;
            }
        }while (num !=0);
        System.out.println("A quantidade de números ímpares é:  " + contImpar);
        System.out.println("A quantidade de números pares é:  " + contPar);
        entrada.close();
    }
}
