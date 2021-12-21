package semana1;

import java.util.Scanner;

public class QuantosPares {

	public static void main(String[] args) {
//		Desenvolva um programa para mostrar os primeiros n números pares, sendo n um valor
//		que o usuário irá inserir pelo console.
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numeral:");
		int num = (sc.nextInt()*2);
	
		for (int i = 0; i < num ; i++) {
			if ((i % 2) == 0) {
				System.out.print(i+"  ");
			}

		}
		sc.close();
	}

}
