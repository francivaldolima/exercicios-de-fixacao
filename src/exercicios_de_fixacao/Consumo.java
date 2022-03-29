package exercicios_de_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		/**
		 * Fazer um programa para ler a distância total (em km) percorrida por um carro,
		 * bem como o total de combustível gasto por este carro ao percorrer tal
		 * distância. Seu programa deve mostrar o consumo médio do carro, com três casas
		 * decimais.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double combustivel,consumoMedio;
		int distanciaTotal;
		
		System.out.println("Distancia percorrida:");
		distanciaTotal = scan.nextInt();
		
		System.out.println("Combustível gasto:");
		combustivel = scan.nextDouble();
		
		consumoMedio = distanciaTotal/combustivel;
		
		System.out.printf("Consumo medio %.3f", consumoMedio);
		

		scan.close();

	}

}
