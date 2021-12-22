package figurasGeometricas;

public abstract class FiguraGeometrica {
	
	public abstract double area();
	
	@Override
	public String toString() {
		return "a área é: ";
	}

}
//1. Crie a classe abstrata FiguraGeometrica e com o método:
//public abstract double area ();
//
//2. Substitua corretamente o método toString. Discussão em grupo: faz sentido substituir
//o método toString em uma classe abstrata?
//3. Crie as classes Círculo, Triangulo e Retangulo, todas subclasses de
//FiguraGeometrica. Que erro de compilação aparece? Como você resolveria isso?
//4. Adicione os atributos (variáveis de instância) que correspondem em cada caso e
//substitua adequadamente o método de área em todas as subclasses de
//FiguraGeometrica.
//
//5. Crie uma classe de utilidade com um método estático: public static double
//areaMedia (FiguraGeometrica arr [ ]), que calcula e retorna a área média das figuras
//contidas no array.
//
//6. Crie um programa, instancie um array de FiguraGeometrica[ ], carregue os dados
//nele e execute o método areaMedia para obter a área média. Mostre o resultado.