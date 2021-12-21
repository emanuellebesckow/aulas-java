package semana1;

import java.util.Arrays;
import java.util.Collections;

public class Arrays1 {

	public static void main(String[] args) {
		Integer[] arrayBase = {52, 10, 85, 1324, 01, 13, 62, 30, 12 , 127};
		Arrays.sort(arrayBase);
		for (Integer a : arrayBase) {
			System.out.println(a);
			}
		Arrays.sort(arrayBase, Collections.reverseOrder());
		for (Integer a : arrayBase) {
			System.out.println(a);
			}

	}
	
//	Exercício 1: Dado um vetor de 10 posições, preenchido pelos valores 52, 10, 85, 1324, 01, 13,
//	62, 30, 12 e 127.

//	Imprima no console:
//	a) Sua ordenação crescente.
//	b) Sua ordenação decrescente.
	
}
