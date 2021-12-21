package semana1;

import java.text.NumberFormat;

public class EmpresaCrescendo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Exercício 2: Em 2021 uma startup de tecnologia, denominada de “Empresa X” é avaliada em
//		R$ 1,13 milhão e possui uma média de crescimento anual de 148%. Uma concorrente do ramo,
//		“Empresa Y”, é avaliada em R$ 18,4 milhões e com sua média de crescimento anual em 32%.
//
//		Considerando este cenário, imprima no console (conforme formatação acima) a evolução anual até que a
//		empresa X ultrapasse a empresa Y em seu valor de mercado.

		double valorEmpresaX = 1130000.0;
		double valorEmpresaY = 18400000.0;
		double crescimentoX = 1.48;
		double crescimentoY = 0.32;
		int ano = 2021;
		NumberFormat formataReal = NumberFormat.getCurrencyInstance();

		while (valorEmpresaX < valorEmpresaY) {

			valorEmpresaX = valorEmpresaX + (valorEmpresaX * crescimentoX);
			valorEmpresaY = valorEmpresaY + (valorEmpresaY * crescimentoY);
			ano++;
			System.out.println("Empresa x - 1/1/" + ano + " - Valor da empresa:" + formataReal.format(valorEmpresaX));
			System.out.println("Empresa y - 1/1/" + ano + " - Valor da empresa:" + formataReal.format(valorEmpresaY));

		}
	}
}
