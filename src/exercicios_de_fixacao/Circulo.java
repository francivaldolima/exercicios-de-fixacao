package exercicios_de_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
		/**
		 * Fazer um programa para ler o valor "r" do raio de um círculo, e depois
		 * mostrar o valor da área do círculo com três casas decimais. A fórmula da área
		 * do círculo é a seguinte: area = π. r ଶ . Você pode usar o valor de π
		 * fornecido pela biblioteca da sua linguagem de programação, ou então, se
		 * preferir, use diretamente o valor 3.14159.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double r,area;
		double pi = 3.14159;
		
		System.out.println("Digite o valor do raio do circulo:");
		r = scan.nextDouble();
		
		area = pi * Math.pow(r, 2);
		//area = Math.PI * Math.pow(r, 2);
		
		System.out.printf("AREA = %.3f\n", area);

		scan.close();

	}

}
