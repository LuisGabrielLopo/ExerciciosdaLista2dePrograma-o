package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numIdentificacao,i,numIdentficacaoMaior = 0 ,numIdenticacaoMenor = 99999999 ;
        Double peso, pesoMaior = 0.0 , pesoMenor = 999.99;

        for (i = 1; i <= 5; i ++){
            System.out.println("Informe a identificação do boi " + i + " : ");
            numIdentificacao = entrada.nextInt();
            System.out.println("Informe o peso do boi " + i + ":");
            peso = entrada.nextDouble();
            while (peso < 100 || peso > 999.99){
                System.out.println("Peso inválido, favor insira um peso corretamente");
                peso = entrada.nextDouble();
            }

            if (peso > pesoMaior ){
                pesoMaior = peso ;
                numIdentficacaoMaior = numIdentificacao;
            }
            if (peso < pesoMenor){
                pesoMenor = peso ;
                numIdenticacaoMenor = numIdentificacao;
            }

        }
        System.out.println("O boi com menor peso é " +numIdenticacaoMenor + " com o peso de:  " + pesoMenor);
        System.out.println("O boi com maior peso é " + numIdentficacaoMaior + "com o peso de: " + pesoMaior);
        entrada.close();
    }
}
