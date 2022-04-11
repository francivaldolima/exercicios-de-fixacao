package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		/**
		 * Leia um valor inteiro N. Este valor será a quantidade de números inteiros que
		 * serão lidos em seguida. Para cada valor lido, mostre uma mensagem dizendo se
		 * este valor lido é PAR ou IMPAR, e também se é POSITIVO ou NEGATIVO. No caso
		 * do valor ser igual a zero (0), seu programa deverá imprimir apenas NULO.
		 */

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int n, x;

		System.out.println("Quantos numeros voce vai digitar?");
		n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um numero:");
			x = scan.nextInt();

			if (x > 0) {
				if (x % 2 == 0)
					System.out.println("PAR POSITIVO");
				else
					System.out.println("IMPAR POSITIVO");
			} else if (x < 0) {
				if (x % 2 == 0)
					System.out.println("PAR NEGATIVO");
				else
					System.out.println("IMPAR NEGATIVO");

			} else
				System.out.println("NULO");
		}

		scan.close();
	}

}
