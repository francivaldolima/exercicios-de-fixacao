package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		/**
		 * Escreva um algoritmo que leia um número inteiro N, e depois repita N vezes:
		 * ler dois números e imprimir o resultado da divisão do primeiro pelo segundo.
		 * Caso não for possível, mostre a mensagem “DIVISAO IMPOSSIVEL”.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double n,numerador,denominador, divisao;
		
		System.out.println("Quantos casos voce vai digitar?");
		n = scan.nextInt();
		
		for(int i=0; i < n; i++) {
			System.out.println("Entre com o numerador:");
			numerador = scan.nextInt();
			
			System.out.println("Entre com o denominador:");
			denominador = scan.nextInt();
			
			if(denominador == 0) {
				System.out.println("DIVISAO IMPOSSIVEL");
			}else {
				divisao = numerador/denominador;
				System.out.printf("DIVISAO = %.2f\n", divisao);
			}
			
			
		}
		
		
		
		
		
		scan.close();

	}

}
