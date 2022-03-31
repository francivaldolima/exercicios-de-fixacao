package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Baskara {

	public static void main(String[] args) {
		/**
		 * Fazer um programa para ler os tr�s coeficientes de uma equa��o do segundo
		 * grau. Usando a f�rmula de Baskara, calcular e mostrar os valores das ra�zes
		 * x1 e x2 da equa��o com quatro casas decimais, conforme exemplo. Se a equa��o
		 * n�o possuir ra�zes reais, mostrar uma mensagem.
		 */
		Locale.setDefault(Locale.US);
		double a, b, c, x1, x2, delta;

		Scanner scan = new Scanner(System.in);
		System.out.println("Coeficiente a:");
		a = scan.nextDouble();
		System.out.println("Coeficiente b:");
		b = scan.nextDouble();
		System.out.println("Coeficiente c:");
		c = scan.nextDouble();

		delta = Math.pow(b, 2.0) - 4 * a * c;
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

		if (delta < 0) {
			System.out.println("Esta equacao nao possui raizes reais");
		} else {
			System.out.printf("X1 = %.4f\n", x1);
			System.out.printf("X2 = %.4f\n", x2);
		}

		scan.close();

	}

}
