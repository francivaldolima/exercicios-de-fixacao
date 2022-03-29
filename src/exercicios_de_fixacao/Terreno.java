package exercicios_de_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Terreno {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler as medidas da largura e comprimento de um terreno
		 * retangular com uma casa decimal, bem como o valor do metro quadrado do
		 * terreno com duas casas decimais. Em seguida, o programa deve mostrar o valor
		 * da área do terreno, bem como o valor do preço do terreno, ambos com duas
		 * casas decimais, conforme exemplo.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double largura, comprimento, valor, area, preco;

		System.out.println("Digite a largura do terreno:");
		largura = scan.nextDouble();

		System.out.println("Digite o comprimento do terreno:");
		comprimento = scan.nextDouble();

		System.out.println("Digite o valor do metro quadrado:");
		valor = scan.nextDouble();

		area = largura * comprimento;
		System.out.printf("Area do terreno = %.2f\n", area);

		preco = area * valor;
		System.out.printf("Preco do terreno = %.2f\n", preco);

		scan.close();

	}

}
