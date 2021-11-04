package ListaDeExercicios2;

public class Exercicios46 {
    public static void main(String[] args) {

        int[] pares = new int [100];
        int[] impares = new int[200];
        int x = 0, y = 0, c = 1;

        while(y < impares.length)
        {
            if(c % 2 == 0)
            {
                if(x < pares.length){
                    pares[x] = c;
                    x++;
                }
            }
            else{
                impares[y] = c;
                y++;
            }

            c++;
        }

        System.out.println("Vetor de Pares: ");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + "   ");
            if(i!= 0 && i % 20 == 0){
                System.out.println();
            }
        }

        System.out.println("\n\nVetor de Impares: ");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + "   ");
            if (i != 0 && i % 20 == 0) {
                System.out.println();
            }
        }

    }
}
