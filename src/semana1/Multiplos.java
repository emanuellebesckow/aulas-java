package semana1;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		// Desenvolva um programa para mostrar os primeiros n números múltiplos de m,
		// sendo n e
		// m valores que o usuário irá inserir via console. Lembre-se que um número a é
		// divisível por b
		// quando o resto da divisão de a por b é igual a 0.
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o numeral que você quer ver os múltiplos");
		int numBase = sc.nextInt();
		System.out.print("Digite a quantidade de vezes:");
		int numQtdade = sc.nextInt();

		for (int i = 1; i <= numQtdade; i++) {
			System.out.print(i * numBase+"   ");
		}
		sc.close(); 
	}

}
