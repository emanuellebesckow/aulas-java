package gerenciaFuncionarios;

public class FuncionarioGerente extends FuncionarioClt {
	int meta = 0;
	public static double salarioBaseGerente = 6000.00;
	public static double valorGanhoPorMetaGerente = 0.125;

	public FuncionarioGerente(int meta) {
		super(meta);
		this.meta = meta;
	}

}
