package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class TrocoVerificado {

	public static void main(String[] args) {
		/**
		 * Fazer um programa para calcular o troco no processo de pagamento de um
		 * produto de uma mercearia. O programa deve ler o preço unitário do produto, a
		 * quantidade de unidades compradas deste produto, e o valor em dinheiro dado
		 * pelo cliente. Seu programa deve mostrar o valor do troco a ser devolvido ao
		 * cliente. Se o dinheiro dado pelo cliente não for suficiente, mostrar uma
		 * mensagem informando o valor restante conforme exemplo.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double preco, quantidade, valorRecebido, troco, faltam ;
		System.out.println("Preço unitário do produto:");
		preco = scan.nextDouble();
		System.out.println("Quantidade comprada:");
		quantidade = scan.nextDouble();
		System.out.println("Dinheiro recebido:");
		valorRecebido = scan.nextDouble();

		if (valorRecebido < (quantidade * preco)) {
			faltam  = (quantidade * preco) - valorRecebido;
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", faltam);
		} else {
			troco = valorRecebido - (quantidade * preco);
			System.out.printf("TROCO = %.2f\n", troco);
		}

		scan.close();

	}

}
