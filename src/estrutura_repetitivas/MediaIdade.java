package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class MediaIdade {

	public static void main(String[] args) {
		/**
		 * Faça um programa para ler um número indeterminado de dados, contendo cada um,
		 * a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém
		 * um valor de idade negativa. Calcular e imprimir a idade média deste grupo de
		 * indivíduos. Se for entrado um valor negativo na primeira vez, mostrar a
		 * mensagem "IMPOSSIVEL CALCULAR".
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int idade = 0, idade2 = 0, cont = 0;
		double soma = 0, media;

		System.out.println("Digite as idades:");
		idade = scan.nextInt();
		soma += idade;
		if (idade < 0)
			System.out.println("IMPOSSIVEL CALCULAR");
		while (idade > 0) {
			idade = scan.nextInt();
			soma += idade;
			cont++;
			if (idade < 0)
				idade2 = idade;
		}
		System.out.println(soma);
		System.out.println(cont);
		System.out.println(idade2 * (-1));
		System.out.println(soma + (idade2 * (-1)));

		media = (soma + (idade2 * (-1))) / (cont);
		System.out.printf("MEDIA = %.2f", media);

		scan.close();

	}

}
