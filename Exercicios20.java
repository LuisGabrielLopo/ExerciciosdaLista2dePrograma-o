
package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicios20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String login;
        int senha, confirmeSenha, contErro = 0;

        System.out.println("### Iniciando cadastro ###");
        System.out.println("Infome o login:");
        login = entrada.nextLine();
        System.out.println("Informe a senha:");
        senha = entrada.nextInt();
        System.out.println("CADASTRO REALIZADO !");

        System.out.println("Informe a senha: ");
        confirmeSenha = entrada.nextInt();

        while (confirmeSenha != senha){
            contErro++;
            System.out.println("Senha incorreta,tente novamente ");
            confirmeSenha = entrada.nextInt();
            if (contErro == 3){
                System.out.println("ACESSO BLOQUEADO, PROCURE UM MODERADOR!");
                break;
            }
        }
        if (confirmeSenha == senha){
            System.out.println("BEM VINDO AO SISTEMA " + login);
        }
        entrada.close();






    }

}
