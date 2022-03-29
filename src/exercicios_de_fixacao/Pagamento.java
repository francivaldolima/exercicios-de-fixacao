package exercicios_de_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {
		/**
		 * Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a)
		 * recebe por hora, e a quantidade de horas trabalhadas por ele(a). Ao final,
		 * mostrar o valor do pagamento do funcionário com uma mensagem explicativa,
		 * conforme exemplo.
		 */

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		String nome;
		double valorHora, pagamento;
		int horasTrabalhada;
		

		System.out.println("Nome:");
		nome = scan.nextLine();
		
		System.out.println("Valor por hora:");
		valorHora = scan.nextDouble();
		
		System.out.println("Horas trabalhadas:");
		horasTrabalhada = scan.nextInt();
		
		pagamento = valorHora * horasTrabalhada;
		
		System.out.printf("O pagamento para %s deve ser %.2f\n", nome,pagamento);

		scan.close();

	}

}
