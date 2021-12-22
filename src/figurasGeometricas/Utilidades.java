package figurasGeometricas;

public class Utilidades {

	public static double areaMedia (FiguraGeometrica arr[]) {
		
		double totalSoma = 0;
		Integer totalParaDividir = 0;
		for (FiguraGeometrica figuraGeometrica : arr) {
			totalSoma =+ figuraGeometrica.area();
			totalParaDividir =+ 1;
		}		
		return totalSoma/totalParaDividir;		
	}

}
