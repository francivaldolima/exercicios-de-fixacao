package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		/**
		 * Fazer um programa para ler um número natural N (valor máximo: 15), e depois
		 * calcular e mostrar o fatorial de N.
		 */

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int n, fatorial=1;

		System.out.println("Digite o valor de N:");
		n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		}
		System.out.printf("FATORIAL = %d\n", fatorial);

		scan.close();

	}

}
