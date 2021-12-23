package gerenciaFuncionarios;

public abstract class FuncionarioClt extends Funcionarios {
	double salarioBase;
	int meta = 0;
	double valorGanhoPorMeta;

	public FuncionarioClt(int meta) {
		super();
		this.meta = meta;
	}

	public int getMeta() {
		return meta;
	}

	public void setMeta(int meta) {
		this.meta = meta;
	}

	public double getValorGanhoPorMeta() {
		return valorGanhoPorMeta;
	}

	public void setValorGanhoPorMeta(double valorGanhoPorMeta) {
		this.valorGanhoPorMeta = valorGanhoPorMeta;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public double pagarSalario() {

		return getSalarioBase() + calculaMeta(getSalarioBase(), getMeta(), getValorGanhoPorMeta());
	}

	public double calculaMeta(double salarioBase, int meta, double valorGanhoPorMeta) {
		return (getSalarioBase() * getValorGanhoPorMeta()) * getMeta();
	}

}
