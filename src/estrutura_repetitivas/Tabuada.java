package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		/**
		 * Ler um número inteiro N, daí mostrar na tela a tabuada de N para 1 a 10, conforme exemplo.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int n,produto;
		
		System.out.print("Deseja a tabuada para qual valor? ");
		n = scan.nextInt();
		
		for(int i= 1; i <= 10; i++) {
			produto = n * i;
			System.out.printf("%d  X  %d = %d\n" ,n,i,produto);
		}
		
		scan.close();

	}

}
