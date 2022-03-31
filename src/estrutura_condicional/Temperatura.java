package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		/**
		 * Deseja-se converter uma medida de temperatura da escala Celsius para
		 * Fahrenheit ou vice-versa. Para isso, você deve construir um programa que leia
		 * a letra "C" ou "F" indicando em qual escala vai ser informada uma
		 * temperatura. Em seguida o programa deve mostrar a temperatura na outra escala
		 * com duas casas decimais. A seguir é dada a fórmula para converter de
		 * Fahrenheit para Celsius (você deve deduzir a fórmula de Celsius para
		 * Fahrenheit):
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		char temperatura;
		double fahrenheit, celsius;

		System.out.println("Voce vai digitar a temperatura em qual escala (C/F)?");
		temperatura = scan.next().charAt(0);

		if (temperatura == 'C' || temperatura == 'c') {

			System.out.println("Digite a temperatura em Celsius:");
			celsius = scan.nextDouble();
			fahrenheit = celsius * 1.8 + 32;
			System.out.printf("Temperatura equivalente em Fahrenheit: %.2f ºF\n",fahrenheit);
			
		} else {
			
			System.out.println("Digite a temperatura em Fahrenheit:");
			fahrenheit = scan.nextDouble();
			celsius = (fahrenheit - 32 )/1.8;
			System.out.printf("Temperatura equivalente em Celsius: %.2f ºC\n",celsius);
			

		}

		scan.close();

	}

}
