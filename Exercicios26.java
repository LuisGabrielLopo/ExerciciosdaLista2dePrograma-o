package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i;
        Double nota1, nota2,media;

        for ( i = 1; i <= 5 ; i++ ){
            System.out.println("Informe a nota1 do Aluno " + i + ":");
            nota1 = entrada.nextDouble();
            while(nota1 < 0 || nota1 > 10){
                System.out.println("Nota inserida inválida, favor insira novamente!");
                nota1 = entrada.nextDouble();
            }
            System.out.println("Informe a nota2 do Aluno " + i + ":");
            nota2 = entrada.nextDouble();
            while (nota2 < 0 || nota2 > 10){
                System.out.println("Nota inserida inválida, favor insira novamente!");
                nota2 = entrada.nextDouble();
            }
                media = (nota1 + nota2 )/2;
                System.out.println("A média do Aluno  é : " + media);
        }
        entrada.close();
    }
}
