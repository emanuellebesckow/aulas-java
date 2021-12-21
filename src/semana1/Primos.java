package semana1;

import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {
		// Desenvolva um programa para informar se um um número n é primo ou não, sendo
		// n um
		// valor que o usuário irá inserir pelo console. Lembre-se que um número é primo
		// quando só é
		// divisível por 1 e por si mesmo.
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o numeral ");
		int num = sc.nextInt();
		sc.close();

		if (num == 2) {
			System.out.println("é primo");
			return;
		}
		if (num == 1 || num == 0) {
			System.out.println("não é primo");
			return;
		}
		if (num % 2 == 0) {
			System.out.println("não é primo");
			return;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("não é primo");
				return;
			}
		}
		System.out.println("é primo");
	}
}
