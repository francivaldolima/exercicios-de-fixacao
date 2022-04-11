package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class SomaImpares {

	public static void main(String[] args) {
		/**
		 * Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre
		 * a soma dos números impares entre eles.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int x, y, soma = 0;

		System.out.println("Digite dois numeros:");
		x = scan.nextInt();
		y = scan.nextInt();

		if (x < y) {
			for (int i = x + 1; i < y; i++) {
				if (i % 2 != 0)
					soma += i;
			}
		} else {
			for (int i = y + 1; i < x; i++) {
				if (i % 2 != 0)
					soma += i;
			}
		}

		System.out.printf("SOMA DOS IMPARES = %d\n", soma);

		scan.close();

	}

}
