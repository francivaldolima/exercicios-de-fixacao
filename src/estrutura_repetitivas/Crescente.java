package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		/**
		 * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y.
		 * Escreva para cada X e Y uma mensagem que indique se estes valores foram
		 * digitados em ordem crescente ou decrescente. O programa deve finalizar quando
		 * forem digitados dois valores iguais.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int x, y;

		System.out.println("Digite dois numeros:");
		x = scan.nextInt();
		y = scan.nextInt();

		
		while (true) {

			if(x == y) {
				break;
			}else if (x > y) {
				System.out.println("DECRESCENTE!");
			} else {
				System.out.println("CRESCENTE!");
			}

			System.out.println("Digite outros dois numeros:");
			x = scan.nextInt();
			y = scan.nextInt();

		}
		/*
		 while (x != y) {
		        if (x > y) {
		        	System.out.println("DECRESCENTE!");
		        }
		        else {
		        	System.out.println("CRESCENTE!");
		        }

		        System.out.println("Digite outros dois numeros:");
			    x = scan.nextInt();
			    y = scan.nextInt();
		    }*/

		scan.close();

	}

}
