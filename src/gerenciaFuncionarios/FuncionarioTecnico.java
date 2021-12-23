package gerenciaFuncionarios;

public class FuncionarioTecnico extends FuncionarioClt {
	int meta;
	double salarioBaseTecnico = 3200.00;
	double valorGanhoPorMetaTecnico = 0.05;

	public FuncionarioTecnico(int meta) {
		super(meta);
		this.salarioBase = salarioBaseTecnico;
		this.meta = meta;
		this.valorGanhoPorMeta = salarioBaseTecnico;
	}

	public int getMeta() {
		return meta;
	}

	public void setMeta(int meta) {
		this.meta = meta;
	}

	public double getSalarioBaseTecnico() {
		return salarioBaseTecnico;
	}

	public void setSalarioBaseTecnico(double salarioBaseTecnico) {
		this.salarioBaseTecnico = salarioBaseTecnico;
	}

	public double getValorGanhoPorMetaTecnico() {
		return valorGanhoPorMetaTecnico;
	}

	public void setValorGanhoPorMetaTecnico(double valorGanhoPorMetaTecnico) {
		this.valorGanhoPorMetaTecnico = valorGanhoPorMetaTecnico;
	}

}
