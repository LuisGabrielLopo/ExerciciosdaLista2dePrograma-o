package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios12 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int n1 , n2;
       do {
           System.out.println("Informe o primeiro número");
           n1 = entrada.nextInt();
           System.out.println("Informe o segundo número");
           n2 = entrada.nextInt();
           while(n1 < 0 || n2 < 0){
               System.out.println("Dados inválidos! ");
               System.out.println("Informe o primeiro número: ");
               n1 = entrada.nextInt();
               System.out.println("Inforne o segundo número:");
               n2 = entrada.nextInt();
           }
           while (n1 < n2-1){
               n1 ++;
               System.out.println(n1);
           }

       }while(n1 != n2 - 1);
       entrada.close();

    }
}
