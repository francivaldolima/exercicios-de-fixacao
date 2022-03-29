package exercicios_de_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Duracao {

	public static void main(String[] args) {

		/**
		 * Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na
		 * tela esta duração no formato horas:minutos:segundos.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int duracao,horas,minutos,segundos;

		System.out.println("Digite a duracao em segundos:");
		duracao = scan.nextInt();
		
		horas = duracao/3600;
		minutos = (duracao - (3600*horas))/60;
		segundos = (duracao - (3600*horas) - minutos * 60);

		
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		

		scan.close();

	}

}
