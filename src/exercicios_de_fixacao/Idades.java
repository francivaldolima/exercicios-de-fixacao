package exercicios_de_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		/**
		 * Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar
		 * uma mensagem com os nomes e a idade média entre essas pessoas, com uma casa
		 * decimal, conforme exemplo.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int idade1,idade2;
		String nome1,nome2;
		double media;
		
		System.out.println("Dados da primeira pessoa:");
		System.out.println("Nome:");
		nome1 = scan.nextLine();
		System.out.println("Idade:");
		idade1 = scan.nextInt();
		
		scan.nextLine();// --------------> limpeza de buffer
		System.out.println("Dados da segunda pessoa:");
		System.out.println("Nome");
		nome2 = scan.nextLine();
		System.out.println("Idade");
		idade2 = scan.nextInt();
		
		
		media = (double)(idade1 + idade2)/2;
		System.out.printf("A idade média de %s e %s  é de %.1f anos \n",nome1,nome2,media);
		
		scan.close();

	}

}
