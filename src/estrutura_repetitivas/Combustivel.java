package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		/**
		 * Um posto de combustíveis deseja determinar qual de seus produtos tem a
		 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
		 * será encerrado quando o código informado for o número 4, devendo então
		 * mostrar a mensagem "MUITO OBRIGADO", bem como as quantidades de cada
		 * combustível.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int opcao,diesel=0,gasolina=0,alcool=0;

		System.out.println("Informe um codigo:");
		System.out.println("1-Álcool | 2-Gasolina | 3-Diesel | 4-Sair");
		
		System.out.println("");
		
		System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar:");
		opcao = scan.nextInt();
		
		while(opcao != 4) {
			
			if(opcao == 1) {
				alcool++;
			}else if(opcao == 2) {
				gasolina++;
			}else if(opcao == 3) {
				diesel++;
			}
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar:");
			opcao = scan.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Álcool: " + (alcool));
		System.out.println("Gasolina: " + (gasolina));
		System.out.println("Diesel: " +(diesel));
		
		scan.close();

	}

}
