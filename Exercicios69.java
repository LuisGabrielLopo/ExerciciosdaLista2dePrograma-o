package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios69 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor, calculo;
        int menu,codProduto;
        int quantidade;
        do {
            imprimeMenu();
            System.out.println("Informe o código ");
            codProduto = entrada.nextInt();
            switch (codProduto){
                case 1 :
                case 5:
                    quantidade();
                    quantidade = entrada.nextInt();
                    valor = 1.50;
                    calculo = calculoFinal(valor,quantidade);
                    System.out.println("O total a ser pago é :" + calculo );
                    break;
                case 2:
                    quantidade();
                    quantidade = entrada.nextInt();
                    valor = 2.00;
                    calculo = calculoFinal(valor,quantidade);
                    System.out.println("O total a ser pago é :" + calculo);
                    break;
                case 3:
                    quantidade();
                    quantidade = entrada.nextInt();
                    valor = 2.50;
                    calculo = calculoFinal(valor,quantidade);
                    System.out.println("O total a ser pago é :" + calculo);
                    break;
                case 4:
                    quantidade();
                    quantidade= entrada.nextInt();
                    valor = 3.00;
                    calculo = calculoFinal(valor,quantidade);
                    System.out.println("O total a ser pago é :" + calculo);
                    break;
                case 6:
                    System.out.println("Finalizando o programa...");
                    System.out.println("Obrigado pela preferencia ");
                    break;
                default:
                    System.out.println("Opção inválida  execute novamente");
            }
        }while (codProduto != 6);

    }
    private static void imprimeMenu(){
        System.out.println("==========CÁRDAPIO==========");
        System.out.println("CÓDIGO 1 - Cachorro Quente -  R$ 1,50 ");
        System.out.println("CÓDIGO 2 - Hamburguer      -  R$ 2,00 ");
        System.out.println("CÓDIGO 3 - Cheeseburguer   -  R$ 2,50");
        System.out.println("CÓDIGO 4 - Eggcheeseburguer - R$ 3,00 ");
        System.out.println("CÓDIGO 5 - Refrigerante     - R$ 1,50 ");
        System.out.println("=======================================");
        System.out.println("CÓDIGO 6 - SAIR");
    }
    private static void quantidade() {
        System.out.println("Informe a quantidade deejada ");
    }
    private static double calculoFinal(double valor ,int quantidade){
        return   valor * quantidade;
    }


}
