package exercicios_de_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {

		/**
		 * Fazer um programa para ler as medidas da base e altura de um retângulo. Em
		 * seguida, mostrar o valor da área, perímetro e diagonal deste retângulo, com
		 * quatro casas decimais, conforme exemplos.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double base,altura,area,perimetro,diagonal;
		
		System.out.println("Base do retangulo:");
		base=scan.nextDouble();
		
		System.out.println("Altura do retangulo:");
		altura = scan.nextDouble();

		area = base * altura;
		System.out.printf("AREA = %.4f\n" ,area);

		perimetro = 2 * (base + altura);
		System.out.printf("PERIMETRO =  %.4f\n",perimetro);
		
		diagonal = Math.sqrt(Math.pow(base,2) + Math.pow(altura, 2));
		System.out.printf("DIAGONAL = %.4f\n",diagonal);

		scan.close();

	}

}
