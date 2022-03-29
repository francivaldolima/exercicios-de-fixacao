package exercicios_de_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		/**
		 * Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na
		 * tela o valor da soma destes números.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int x,y,soma;

		System.out.println("Digite o valor de X:");
		x=scan.nextInt();
		System.out.println("Digite o valor de Y:");
		y=scan.nextInt();
		
		soma = x + y;
		System.out.printf("SOMA = %d\n" ,soma);

		scan.close();

	}

}
