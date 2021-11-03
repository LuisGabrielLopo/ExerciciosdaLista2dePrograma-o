package ListaDeExercicios2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int contG = 0;
		int contV = 0;
		int contO = 0;
		boolean cont = false;
		System.out.println("*-----Bem vindo, o programa ira começar-----*");

		while(true) {
			while(true) {
				System.out.println("Selecione as opções abaixo para votar em seu time: ");
				System.out.println("Pressione: (G) - Para votar no time: Goiás");
				System.out.println("Pressione: (V) - Para votar no time: Vila Nova");
				System.out.println("Pressione: (O) - Para votar em outros times.");
				System.out.println("Pressione: (F) - Para finalizar");
				String torcedores = entrada.next();
				torcedores = torcedores.toUpperCase();
				switch(torcedores.hashCode()) {
					case 70:
						if (torcedores.equals("F")) {
							System.out.println("Fim do programa\n");
							String saida = entrada.nextLine();
							System.out.println("*======Resultado=====*");
							System.out.println("Total de torcedores do Goiás: " + contG);
							System.out.println("Total de torcedores do Vila Nova: " + contV);
							System.out.println("Total de torcedores de Outros times: " + contO);
							System.out.println("Total de torcedores entrevistados: " + (contG + contV + contO));
							return;
						}
						break;
					case 71:
						if (torcedores.equals("G")) {
							System.out.println("Voto contabilizado");
							++contG;
							continue;
						}
						break;
					case 79:
						if (torcedores.equals("O")) {
							System.out.println("Voto contabilizado");
							++contO;
							continue;
						}
						break;
					case 86:
						if (torcedores.equals("V")) {
							System.out.println("Voto contabilizado");
							++contV;
							continue;
						}
				}

				System.out.println("Informação inválida. Execute novamente");
				entrada.close();
			}
		}
	}
}
