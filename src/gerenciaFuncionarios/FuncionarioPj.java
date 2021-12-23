package gerenciaFuncionarios;

public class FuncionarioPj extends Funcionarios {
	double valorHora;
	double horasTrabalhadas;

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	@Override
	public double pagarSalario() {
		return getValorHora() * getHorasTrabalhadas();
	}

}
