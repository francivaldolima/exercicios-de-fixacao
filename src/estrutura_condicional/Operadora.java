package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Operadora {

	public static void main(String[] args) {
		/**
		 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito
		 * a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos
		 * custa R$ 2.00. Fazer um programa para ler a quantidade de minutos que uma
		 * pessoa consumiu, daí mostrar o valor a ser pago.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int minutos;
		double valorPagar = 50, resto;

		System.out.println("Digite a quantidade de minutos:");
		minutos = scan.nextInt();

		

		if (minutos > 100) {
			resto = minutos - 100;
            valorPagar += (2 * resto);
		}

		System.out.printf("Valor a pagar: R$ %.2f\n", valorPagar);

		scan.close();

	}

}
