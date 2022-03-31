package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class TempoJogo {

	public static void main(String[] args) {
		/**
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
		 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
		 * uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		Scanner scan = new Scanner(System.in);
		
		int inicio,fim;
		
		System.out.println("Hora inicial:");
		inicio = scan.nextInt();
		System.out.println("Hora final:");
		fim =scan.nextInt();
		
		
	    if(inicio < fim) {
			System.out.printf("O JOGO DUROU %d HORA(S)", fim - inicio);
		}else {
			System.out.printf("O JOGO DUROU %d HORA(S)", 24-(inicio - fim));
		}
		
		

		scan.close();

	}

}
