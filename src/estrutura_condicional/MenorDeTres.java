package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class MenorDeTres {

	public static void main(String[] args) {
		/**
		 * Fazer um programa para ler tr�s n�meros inteiros. Em seguida, mostrar qual o
		 * menor dentre os tr�s n�meros lidos. Em caso de empate, mostrar apenas uma
		 * vez.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int primeiro, segundo, terceiro, menor;

		System.out.println("Primeiro valor:");
		primeiro = scan.nextInt();
		System.out.println("Segundo valor:");
		segundo = scan.nextInt();
		System.out.println("Terceiro valor:");
		terceiro = scan.nextInt();
		
		if(primeiro < segundo && primeiro < terceiro) {
			menor = primeiro;
		}else if(segundo < primeiro && segundo < terceiro) {
			menor = segundo;
		}else{
			menor = terceiro;
		}
		
		System.out.printf("MENOR = %d", menor);
		

		scan.close();

	}

}
