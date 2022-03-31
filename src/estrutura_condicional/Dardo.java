package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Dardo {

	public static void main(String[] args) {
		/**
		 * No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior
		 * distância que conseguir. Você deve criar um programa para, dadas as medidas
		 * das três tentativas de lançamento, informar qual foi a maior.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double a,b,c,maior;
		
		System.out.println("Digite as tres distancias:");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		if(a > b && a > c) {
			maior = a;
		}else if(b > a && b > c) {
			maior = b;
		}else {
			maior = c;
		}
		
		System.out.printf("MAIOR DISTANCIA = %.2f",maior);
		

		scan.close();

	}

}
