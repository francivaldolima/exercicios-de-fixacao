package exercicios_de_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		/**
		 * Fazer um programa para ler a dist�ncia total (em km) percorrida por um carro,
		 * bem como o total de combust�vel gasto por este carro ao percorrer tal
		 * dist�ncia. Seu programa deve mostrar o consumo m�dio do carro, com tr�s casas
		 * decimais.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double combustivel,consumoMedio;
		int distanciaTotal;
		
		System.out.println("Distancia percorrida:");
		distanciaTotal = scan.nextInt();
		
		System.out.println("Combust�vel gasto:");
		combustivel = scan.nextDouble();
		
		consumoMedio = distanciaTotal/combustivel;
		
		System.out.printf("Consumo medio %.3f", consumoMedio);
		

		scan.close();

	}

}
