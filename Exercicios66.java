package ListaDeExercicios2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicios66 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3, calculo;
        char menu;
        do {
            imprimirMenu();
            menu = entrada.next().charAt(0);

            switch (Character.toUpperCase(menu)){
                case 'A':
                    textoN1();
                    nota1 = entrada.nextDouble();
                    textoN2();
                    nota2 = entrada.nextDouble();
                    textoN3();
                    nota3 = entrada.nextDouble();

                    calculo = mediaArtimetica(nota1, nota2, nota3);
                    System.out.println("Média Aritmética é : " + arredondar(calculo));
                    break;
                case 'P':
                    textoN1();
                    nota1 = entrada.nextDouble();
                    textoN2();
                    nota2 = entrada.nextDouble();
                    textoN3();
                    nota3 = entrada.nextDouble();

                    calculo = mediaPonderada(nota1, nota2, nota3);
                    System.out.println("Média Ponderada é : " + arredondar(calculo));
                    break;
                case 'H':
                    textoN1();
                    nota1 = entrada.nextDouble();
                    textoN2();
                    nota2 = entrada.nextDouble();
                    textoN3();
                    nota3 = entrada.nextDouble();

                    calculo = mediaHarmonica(nota1, nota2, nota3);
                    System.out.println("Média Harmônica é : " + arredondar(calculo));
                    break;
                case 'F':
                    System.out.println("Fim do programa ...");
                    break;
                default:
                    System.out.println("Opção inválida, execute novamente");
            }

        } while (menu != 'F');


    }

    //Menu de impressão
    private static void imprimirMenu() {
        System.out.println("==========MENU==========");
        System.out.println("SELECIONE A - Calcular média aritmética");
        System.out.println("SELECIONE P - Calcular média ponderda");
        System.out.println("SELECIONE H - Calcular média harmônica");
        System.out.println("SELECIONE F - Sair");
    }

    private static void textoN1() {
        System.out.println("Informe o valor de N1: ");
    }

    private static void textoN2() {
        System.out.println("Informe o valor de N2: ");
    }

    private static void textoN3() {
        System.out.println("Informe o valor de N3: ");
    }
    //Media Artimmetica
    private static double mediaArtimetica(double nota1, double nota2, double nota3){
        return (nota1 + nota2 + nota3) / 3;
    }
    //Media Ponderada
    private static double mediaPonderada(double nota1, double nota2, double nota3){
        return ((nota1 * 5 ) + (nota2 * 3) + (nota3 * 2)) / (5 + 3 + 2 );
    }
    //Média Harmonica
    private static double mediaHarmonica(double nota1, double nota2, double nota3){
        return 3 / (1 / nota1 + 1 / nota2 +  1 / nota3);
    }
    //Arredondamento
    private static String arredondar(Double valor) {
        return new DecimalFormat("#,#0.0").format(valor);
    }


}
