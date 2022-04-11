package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class SenhaFixa {

	public static void main(String[] args) {
		/**
		 * Escreva um programa que repita a leitura de uma senha até que ela seja
		 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida! Tente novamente:". Quando a senha for informada corretamente
		 * deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado.
		 * Considere que a senha correta é o valor 2002.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int senha;

		System.out.println("Digite a senha:");
		senha = scan.nextInt();

		while (senha != 2002) {
			System.out.println("Senha Invalida! Tente novamente:");
			senha = scan.nextInt();
		}

		System.out.println("Acesso permitido!");
		scan.close();

	}

}
