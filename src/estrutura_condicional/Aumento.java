package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Aumento {

	public static void main(String[] args) {
		/**
		 * Uma empresa vai conceder um aumento percentual de salário aos seus
		 * funcionários dependendo de quanto cada pessoa ganha, conforme tabela ao lado.
		 * Fazer um programa para ler o salário de uma pessoa, daí mostrar qual o novo
		 * salário desta pessoa depois do aumento, quanto foi o aumento e qual foi a
		 * porcentagem de aumento.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double salario = 0, novoSalario = 0, aumento = 0;
		int porcentagem = 0;

		System.out.print("Digite o salario da pessoa:");
		salario = scan.nextDouble();

		if (salario <= 1000) {
			porcentagem = 20;
			aumento = (salario * porcentagem) / 100;
			novoSalario += salario + aumento;

		} else if (salario <= 3000) {
			porcentagem = 15;
			aumento = (salario * porcentagem) / 100;
			novoSalario = salario + aumento;

		} else if (salario <= 8000) {
			porcentagem = 10;
			aumento = (salario * porcentagem) / 100;
			novoSalario = salario + aumento;

		} else {
			porcentagem = 5;
			aumento = (salario * porcentagem) / 100;
			novoSalario = salario + aumento;
		}
		
		System.out.println("__________________________________________________");
		System.out.println("|        Salário atual                 | Aumento  |");
		System.out.println("|______________________________________|__________|");
		System.out.println("|   Até R$ 1000.00                     |  20%     |");
		System.out.println("|   Acima de R$ 1000.00 até R$ 3000.00 |  15%     |");
		System.out.println("|   Acima de R$ 3000.00 até R$ 8000.00 |  10%     |");
		System.out.println("|   Acima de R$ 8000.00                |  5%      |" );
		System.out.println("|_________________________________________________|");

		
		System.out.printf("Salario = R$ %.2f\n",salario);
		System.out.printf("Novo salario = R$ %.2f\n", novoSalario);
		System.out.printf("Aumento = R$ %.2f\n", aumento);
		System.out.printf("Porcentagem = %d %% \n", porcentagem);

		scan.close();
	}

}
