package figurasGeometricas;

public class ProgramaExecutor {

	public static void main(String[] args) {
		Triangulo triangulo1 = new Triangulo(10.2, 5.0);
		Triangulo triangulo2 = new Triangulo(55.2, 5.0);
		Triangulo triangulo3 = new Triangulo(6.0, 3.0);
		Retangulo retangulo1 = new Retangulo(15, 5);
		Retangulo retangulo2 = new Retangulo(3, 25);
		Circulo circulo1 = new Circulo(5);
		Circulo circulo2 = new Circulo(52);
		Circulo circulo3 = new Circulo(3);
		
		FiguraGeometrica[] arrayFiguras = {triangulo1, triangulo2, triangulo3, retangulo1, retangulo2, circulo1, circulo2, circulo3};
		
		double areaCalculada = Utilidades.areaMedia(arrayFiguras);
		
		System.out.println(areaCalculada);
		
	}

}
