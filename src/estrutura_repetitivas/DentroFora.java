package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class DentroFora {

	public static void main(String[] args) {
		/**
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
		 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
		 * intervalo [10,20] e quantos estão fora do intervalo, conforme exemplo
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int x,n,dentro=0,fora=0;
		
		System.out.print("Quantos numeros voce vai digitar?");
		n = scan.nextInt();
		
		for(int i=0; i < n; i++) {
			System.out.println("Digite um numero:");
			x = scan.nextInt();
			
			if(x >= 10 && x <=20) {
				dentro++;
			}else {
				fora++;
			}
		}
		
		System.out.printf("%d DENTRO\n",dentro);
		System.out.printf("%d FORA\n",fora);

		scan.close();

	}

}
