package figurasGeometricas;

public class Utilidades {

	public static double areaMedia (FiguraGeometrica arr[]) {
		
		double totalSoma = 0;
		Integer totalParaDividir = arr.length;
		for (FiguraGeometrica figuraGeometrica : arr) {
			totalSoma =+ figuraGeometrica.area();
		}		
		return totalSoma/totalParaDividir;		
	}

}
