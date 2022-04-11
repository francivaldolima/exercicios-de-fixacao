package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Experiencias {

	public static void main(String[] args) {
		/**
		 * Maria acabou de iniciar seu curso de graduação na faculdade de medicina e
		 * precisa de sua ajuda para organizar os experimentos de um laboratório do qual
		 * ela é responsável. Ela quer saber no final do ano, quantas cobaias foram
		 * utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.
		 * Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e
		 * coelhos. Para obter estas informações, ela sabe exatamente o número de
		 * experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade
		 * de cobaias utilizadas em cada experimento. Faça um programa que leia um valor
		 * inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de
		 * teste contém um inteiro que representa a quantidade de cobaias utilizadas e
		 * uma letra ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo
		 * C:Coelho). Apresente o total de cobaias utilizadas, o total de cada tipo de
		 * cobaia utilizada e o percentual de cada uma em relação ao total de cobaias
		 * utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após
		 * o ponto.
		 */

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double sapos = 0, ratos = 0, coelhos = 0, n, quantidade = 0, total = 0;
		char tipo;
		double percentualCoelhos = 0, percentualRatos = 0, percentualSapos = 0;

		System.out.print("Quantos casos de teste serao digitados?");
		n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Quantidade de cobaias:");
			quantidade = scan.nextInt();

			System.out.print("Tipo de cobaia:");
			tipo = scan.next().charAt(0);

			if (tipo == 'C' || tipo == 'c') {
				coelhos += quantidade;

			} else if (tipo == 'R' || tipo == 'r') {
				ratos += quantidade;

			} else if (tipo == 'S' || tipo == 'S') {

				sapos += quantidade;
			}

		}

		total = coelhos + ratos + sapos;
		percentualCoelhos = (coelhos * 100) / total;
		percentualRatos = (ratos * 100) / total;
		percentualSapos = (sapos * 100) / total;

		System.out.println("RELATORIO FINAL: ");
		System.out.printf("Total:   %.0f cobaias\n", total);
		System.out.printf("Total de coelhos: %.0f\n", coelhos);
		System.out.printf("Total de ratos:   %.0f\n", ratos);
		System.out.printf("Total de sapos:   %.0f\n", sapos);

		System.out.printf("Percentual de coelhos: %.2f\n", percentualCoelhos);
		System.out.printf("Percentual de ratos:   %.2f\n", percentualRatos);
		System.out.printf("Percentual de sapos:   %.2f\n", percentualSapos);

		scan.close();

	}

}
