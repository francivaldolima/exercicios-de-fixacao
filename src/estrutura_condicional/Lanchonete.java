package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		/**
		 * Uma lanchonete possui vários produtos. Cada produto possui um código e um
		 * preço. Você deve fazer um programa para ler o código e a quantidade comprada
		 * de um produto (suponha um código válido), e daí informar qual o valor a ser
		 * pago, com duas casas decimais, conforme tabela de produtos ao lado.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double valorPagar=0;
		int codigo,quantidade;
		
		System.out.println("___________________________________");
		System.out.println("|Código do produto|Preço do produto|");
		System.out.println("|__________________________________|");
		System.out.println("|       1         |   R$ 5.00      |");
		System.out.println("|       2         |   R$ 3.50      |");
		System.out.println("|       3         |   R$ 4.80      |");
		System.out.println("|       4         |   R$ 8.90      |");
		System.out.println("|       5         |   R$ 7.32      |");
		System.out.println("|_________________|________________|");
		
		System.out.println("Codigo do produto comprado:");
		codigo = scan.nextInt();
		System.out.println("Quantidade comprada:");
		quantidade = scan.nextInt();
		
		if(codigo ==1) {
			valorPagar = quantidade * 5.00;
		}else if(codigo ==2) {
			valorPagar = quantidade * 3.50;
		}else if(codigo ==3) {
			valorPagar = quantidade * 4.80;
		}else if(codigo ==4) {
			valorPagar = quantidade * 8.90;
		}else if(codigo == 5){
			valorPagar = quantidade * 7.32;
		}
		System.out.printf("Valor a pagar: R$ %.2f\n",valorPagar);
		

		scan.close();

	}

}
