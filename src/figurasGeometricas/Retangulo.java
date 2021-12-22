package figurasGeometricas;

public class Retangulo extends FiguraGeometrica {
	double altura;
	double base;

	public Retangulo(double altura, double base) {
		super();
		this.altura = altura;
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public double area() {

		return altura * base;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+this.area();
	}

}
