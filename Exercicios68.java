package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios68 {
    public static double saldo;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char menu;
        double saque = 0, deposito = 0;

        do {
            imprimirMenu();
            menu = entrada.next().charAt(0);

            switch (Character.toUpperCase(menu)) {
                case 'A':
                    System.out.println("\t\t----- IMPRIMINDO SALDO -----");
                    System.out.println("Seu saldo atual é: R$" + saldo);
                    break;

                case 'B':
                    System.out.println("\t\t----- INICIANDO SAQUE -----");
                    System.out.println("Informe o tanto que deseja sacar: ");
                    saque = entrada.nextDouble();
                    sacarValor(saque);
                    break;

                case 'C':
                    System.out.println("\t\t----- INICIANDO DEPÓSITO -----");
                    System.out.println("Informe o valor que deseja depositar: ");
                    deposito = entrada.nextDouble();
                    depositarValor(deposito);
                    break;

                case 'D':
                    System.out.println("\t\t----- FIM DO PROGRAMA -----");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (menu != 'D');
    }

    // impressão do menu
    private static void imprimirMenu() {
        System.out.println("\t\t----- INICIANDO MENU -----");
        System.out.println("Digite....");
        System.out.println("A - Consulta de Saldo");
        System.out.println("B - Saque");
        System.out.println("C - Deposito");
        System.out.println("D - Finalizar programa");
    }

    //Saque
    private static void sacarValor(double saque) {
        if (saque > saldo) {
            System.out.println("Saque não realizado!");
            System.out.println("O saldo atual não cobre o valor necessário para o saque solicitado.");
        } else {
            saldo -= saque;
            System.out.println("Novo saldo após o saque: R$" + saldo);
        }

    }

    //deposito
    private static void depositarValor(double deposito) {
        if (deposito < 1) {
            System.out.println("Depósito não realizado!");
            System.out.println("Deposito um valor MAIOR ou IGUAL a R$1,00 ");
        } else {
            saldo += deposito;
            System.out.println("Novo saldo após o deposito: R$" + saldo);
        }

    }

}
