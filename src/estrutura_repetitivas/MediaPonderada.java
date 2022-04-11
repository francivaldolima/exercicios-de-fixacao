package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		/**
		 * Leia um valor inteiro N, que representa o número de casos de teste que vem a
		 * seguir. Cada caso de teste consiste de 3 valores reais, para os quais você
		 * deverá calcular e mostrar a média ponderada, sendo que o primeiro valor tem
		 * peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5. Vale
		 * lembrar que a média ponderada é a soma de todos os valores multiplicados pelo
		 * seu respectivo peso, dividida pela soma dos pesos.
		 */

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int n;
		double media,numero1=0,numero2=0,numero3=0;
		
		System.out.print("Quantos casos voce vai digitar?");
		n = scan.nextInt();
		
		for(int i=0; i < n; i++) {
			System.out.println("Digite tres numeros:");
			numero1 = scan.nextDouble();
			numero2 = scan.nextDouble();
			numero3 = scan.nextDouble();
			
			media = ((numero1 * 2) + (numero2 * 3) + (numero3 * 5))/10;
			
			System.out.printf("MEDIA = %.1f\n",media);
		}
		
		scan.close();

	}

}
