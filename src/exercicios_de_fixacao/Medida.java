package exercicios_de_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Medida {

	public static void main(String[] args) {
		/**
		 * Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e
		 * mostrar (imprimir os dados com quatro casas decimais): a) a área do quadrado
		 * que tem lado A b) a área do triângulo retângulo que base A e altura B c) a
		 * área do trapézio que tem bases A e B, e altura C
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double a,b,c,quadrado,triangulo,trapezio;

		System.out.println("Digite a medida A:");
		a = scan.nextDouble();
		System.out.println("Digite a medida B:");
		b = scan.nextDouble();
		System.out.println("Digite a medida C:");
		c = scan.nextDouble();
		
		quadrado = Math.pow(a, 2);
		System.out.printf("AREA DO QUADRADO  = %.4f\n",quadrado);
		
		triangulo = (a * b) / 2;
		System.out.printf("AREA DO TRIANGULO = %.4f\n",triangulo);
		
		trapezio = ((a + b) * c) / 2;
		System.out.printf("AREA DO TRAPEZIO  = %.4f\n",trapezio);

		scan.close();

	}

}
