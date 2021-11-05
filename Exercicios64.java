package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios64 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char sexo;
        double altura, pesoIdeal, peso;

        receberAltura();
        altura = entrada.nextDouble();

        informarSexo();
        sexo = entrada.next().charAt(0);

        do {
            switch (Character.toUpperCase(sexo)) {
                case 'M':
                    pesoIdeal = calcularPesoIdealMasculino(altura);
                    System.out.println("Usuário, informe seu peso");

                    peso = entrada.nextDouble();
                    if (peso > pesoIdeal) {
                        System.out.println("Usário, você esta ACIMA do peso ideal");
                        System.out.println("O seu peso ideal é: " + pesoIdeal + ". E você esta pesando atualmente: " + peso);
                        System.out.println("Você esta: " + (peso - pesoIdeal) + "kg acima do peso ideal.");
                    } else if (peso < pesoIdeal) {
                        System.out.println("Usuário, você esta ABAIXO do peso ideal.");
                        System.out.println("O seu peso ideal é: " + pesoIdeal + ". E você esta pesando atualmente: " + peso);
                        System.out.println("Você esta: " + (pesoIdeal - peso) + "kg abaixo do peso ideal.");
                    } else if (peso == pesoIdeal) {
                        System.out.println("Usuário, você esta com o peso IGUAL ao ideal para você.");
                        System.out.println("O seu peso ideal é: " + pesoIdeal + ". E você esta pesando atualmente: " + peso);
                        System.out.println("Parabéns!");
                    }
                    break;
                case 'F':
                    //Chamar calculo do peso ideal
                    pesoIdeal = calcularPesoIdealFeminino(altura);

                    informarPeso();
                    peso = entrada.nextDouble();

                    if (peso > pesoIdeal) {
                        System.out.println("Usário, você esta ACIMA do peso ideal");
                        System.out.println("O seu peso ideal é: " + pesoIdeal + ". E você esta pesando atualmente: " + peso);
                        System.out.println("Você esta: " + (peso - pesoIdeal) + "kg acima do peso ideal.");

                    } else if (peso < pesoIdeal) {
                        System.out.println("Usuário, você esta ABAIXO do peso ideal.");
                        System.out.println("O seu peso ideal é: " + pesoIdeal + ". E você esta pesando atualmente: " + peso);
                        System.out.println("Você esta: " + (pesoIdeal - peso) + "kg abaixo do peso ideal.");

                    } else if (peso == pesoIdeal) {
                        System.out.println("Usuário, você esta com o peso IGUAL ao ideal para você.");
                        System.out.println("O seu peso ideal é: " + pesoIdeal + ". E você esta pesando atualmente: " + peso);
                        System.out.println("Parabéns!");
                    }
                    break;

                default:
                    System.out.println("Opção inválida. Execute novamente");
            }

        }while(sexo == 'M' || sexo == 'F');
    }

    //Calcular o peso ideal Feminino
    private static double calcularPesoIdealFeminino(double altura) {
        // TODO Auto-generated method stub
        return (62.1*altura)-44.7;
    }

    //Calcular o peso ideal Masculino
    private static double calcularPesoIdealMasculino(double altura) {
        // TODO Auto-generated method stub
        return (72.7 * altura) - 58;
    }

    //Impressão para informar altura
    private static void receberAltura() {
        System.out.println("Usuário, informe sua altura");
    }

    //Impressão para informar sexo
    private static void informarSexo() {
        System.out.println("Usuário, informe seu sexo");
        System.out.println("M - Masculino");
        System.out.println("F - Feminino");
    }

    //Impressão para informar peso
    private static void informarPeso() {
        System.out.println("Usuário, informe seu peso");
    }

}
