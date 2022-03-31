package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		/**
		 * Fazer um programa para ler dois números inteiros, e dizer se um número é
		 * múltiplo do outro. Os números podem ser digitados em qualquer ordem.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int numero1,numero2;
		
		System.out.println("Digite dois numeros inteiros:");
		
		numero1 = scan.nextInt();
		numero2 = scan.nextInt();
		if(numero1 % numero2 == 0 || numero2 % numero1 == 0) {
			System.out.println("Sao multiplos");
		}else {
			System.out.println("Nao sao multiplos");
		}
		
		
		

		scan.close();

	}

}
