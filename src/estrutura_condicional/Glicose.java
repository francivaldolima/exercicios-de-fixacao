package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Glicose {

	public static void main(String[] args) {
		/**
		 * Fazer um programa para ler a quantidade de glicose no sangue de uma pessoa e
		 * depois mostrar na tela a classifica��o desta glicose de acordo com a tabela
		 * de refer�ncia ao lado.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double glicose;

		System.out.println("Digite a medida da glicose:");
		glicose = scan.nextDouble();

		if (glicose <= 100) {
			System.out.println("Classificacao: normal");
		} else if (glicose > 100 && glicose <= 140) {
			System.out.println("Classificacao: elevado");
		} else {
			System.out.println("Classificacao: diabetes");
		}

		System.out.println("--------------------------------------------");
		System.out.println("|Classifica��o | Glicose                    |");
		System.out.println("|Normal        | At� 100 mg/dl              |");
		System.out.println("|Elevado       | Maior que 100 at� 140 mg/dl|");
		System.out.println("|Diabetes      | Maior de 140 mg/dl         |");
		System.out.println("--------------------------------------------");

		scan.close();

	}

}
