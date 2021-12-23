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

		return getAltura() * getBase();
	}
	
	@Override
	public String toString() {
		return super.toString()+this.area();
	}

}
