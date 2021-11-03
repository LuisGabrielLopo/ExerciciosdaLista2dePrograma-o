package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, divisao, soma = 0, media = 0, menorNum, maiorNum, contador = 0;
        double porcentagemImpar, contadorImpar = 0.0, mediaPar = 0.0, contadorPar = 0.0, somaPar = 0.0;

        System.out.println("Informe um número para ser contabilizado.");
        System.out.println("Digite 0 para sair.");
        numero = entrada.nextInt();
        maiorNum = numero;
        menorNum = numero;

        if (numero == 0) {
            System.out.println("Fim do programa.");
        }

        while (numero != 0) {
            contador++;
            soma = soma + numero;
            media = soma / contador;
            if (numero % 2 == 0 && numero != 0) {
                contadorPar++;
                somaPar = somaPar + numero;

            } else {
                contadorImpar++;
            }
            if(numero > maiorNum) {
                maiorNum = numero;
            }else if(numero < menorNum) {
                menorNum = numero;
            }


            System.out.println("Digite um número para ser contabilizado");
            System.out.println("Digite 0 para sair.");
            numero = entrada.nextInt();


        }
        porcentagemImpar = (contadorImpar / contador) * 100;
        mediaPar = somaPar / contadorPar;
        entrada.close();

        System.out.println("**-----RESULTADO-----**");
        System.out.println("Soma dos números digitados: " + soma);
        System.out.println("Quantidade total de números digitados: " + contador);
        System.out.println("Média de números digitados: " + (double)media);
        System.out.println("Média de numeros pares digitados: " + mediaPar);
        System.out.println("Percentagem de numeros impares digitados: " + porcentagemImpar + "%");
        System.out.println("Maior número digitado: "+ maiorNum);
        System.out.println("Menor número digitado: "+ menorNum);
    }
}
