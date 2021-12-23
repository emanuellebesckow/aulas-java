package figurasGeometricas;

public class Triangulo extends FiguraGeometrica {

	double altura;
	double base;

	public Triangulo(double altura, double base) {
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

		return (getAltura() * getBase())/2;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+this.area();
	}

}
