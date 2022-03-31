package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Coordenada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/**
		 * Leia os valores das coordenadas X e Y de um ponto no plano cartesiano. A
		 * seguir, determine qual o quadrante ao qual pertence o ponto (Q1, Q2, Q3 ou
		 * Q4). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o ponto
		 * estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
		 * situação.
		 */
		Scanner scan = new Scanner(System.in);

		double x, y;

		System.out.println("Valor de X: ");
		x = scan.nextDouble();
		System.out.println("Valor de Y: ");
		y = scan.nextDouble();

		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else if (y == 0) {
			System.out.println("Eixo X");

		} else if (x == 0) {
			System.out.println("Eixo Y");
		} else if (x > 0 && y > 0) {
			System.out.println("Q1");

		} else if (x < 0 && y > 0) {
			System.out.println("Q2");

		} else if (x < 0 && y < 0) {
			System.out.println("Q3");

		} else {
			System.out.println("Q4");

		}

		scan.close();

	}

}
