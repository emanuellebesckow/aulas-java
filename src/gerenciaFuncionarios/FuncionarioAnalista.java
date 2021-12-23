package gerenciaFuncionarios;

public class FuncionarioAnalista extends FuncionarioClt {
	int meta = 0;
	public static double salarioBaseAnalista = 4000.00;
	public static double valorGanhoPorMetaAnalista = 0.08;

	public FuncionarioAnalista(int meta) {
		super(meta);
		this.meta = meta;
	}

	public int getMeta() {
		return meta;
	}

	public void setMeta(int meta) {
		this.meta = meta;
	}

	public static double getSalarioBaseAnalista() {
		return salarioBaseAnalista;
	}

	public static void setSalarioBaseAnalista(double salarioBaseAnalista) {
		FuncionarioAnalista.salarioBaseAnalista = salarioBaseAnalista;
	}

	public static double getValorGanhoPorMetaAnalista() {
		return valorGanhoPorMetaAnalista;
	}

	public static void setValorGanhoPorMetaAnalista(double valorGanhoPorMetaAnalista) {
		FuncionarioAnalista.valorGanhoPorMetaAnalista = valorGanhoPorMetaAnalista;
	}

}
