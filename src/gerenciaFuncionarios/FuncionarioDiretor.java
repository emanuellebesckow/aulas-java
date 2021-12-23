package gerenciaFuncionarios;

public class FuncionarioDiretor extends Funcionarios {
	public static double salarioBaseDiretor = 15000.00;
	public static double participacaoLucros = 0.03;
	double lucroEmpresa = 0;

	public FuncionarioDiretor(double lucroEmpresa) {
		super();
		this.lucroEmpresa = lucroEmpresa;
	}

	public static double getSalarioBaseDiretor() {
		return salarioBaseDiretor;
	}

	public static void setSalarioBaseDiretor(double salarioBaseDiretor) {
		FuncionarioDiretor.salarioBaseDiretor = salarioBaseDiretor;
	}

	public static double getParticipacaoLucros() {
		return participacaoLucros;
	}

	public static void setParticipacaoLucros(double participacaoLucros) {
		FuncionarioDiretor.participacaoLucros = participacaoLucros;
	}

	public double getLucroEmpresa() {
		return lucroEmpresa;
	}

	public void setLucroEmpresa(double lucroEmpresa) {
		this.lucroEmpresa = lucroEmpresa;
	}

	@Override
	public double pagarSalario() {
		return getSalarioBaseDiretor() + (getParticipacaoLucros() * getLucroEmpresa());
	}

}
