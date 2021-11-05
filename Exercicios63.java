package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios63 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double raio, volume, area;

        System.out.println("Informe o raio da esfera");
        raio = entrada.nextDouble();

        volume = calcularVolume(raio);
        System.out.println("O volume da esfera é igual a: "+volume);

        area = calcularArea(raio);
        System.out.println("A area da esfera é igual a: "+area);


        entrada.close();
    }

    private static double calcularArea(double raio) {
        // TODO Auto-generated method stub
        return 3.14*Math.pow(raio, 2);
    }

    private static double calcularVolume(double raio) {
        // TODO Auto-generated method stub
        return (4*3.14*Math.pow(raio, 3))/3;
    }
}
