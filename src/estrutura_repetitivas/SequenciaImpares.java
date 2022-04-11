package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class SequenciaImpares {

	public static void main(String[] args) {
		/**
		 * Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor
		 * por linha, inclusive o X, se for o caso.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int x;
		
		System.out.print("Digite o valor de X:");
		x = scan.nextInt();
		
		for(int i=1; i<=x; i++) {
			if(i % 2 !=0 ) {
				System.out.printf("%d\n",i);
			}
		}
		
		System.out.println("");
		System.out.println("");

		scan.close();

	}

}
