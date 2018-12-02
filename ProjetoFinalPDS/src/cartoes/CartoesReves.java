package cartoes;

import casas.Prisao;
import interfaces.Acao;

import interfaces.AcaoPagar;
import interfaces.AcaoVaPrisao;

public class CartoesReves extends Cartoes {

	private Acao acao;

	public CartoesReves(String desc) {
		super(desc);

	}

	public Acao getAcao() {
		return acao;
	}

	public void setAcaoPagar(int value) {
		this.acao = new AcaoPagar(value);
	}

	public void setAcaoPrender(Prisao casa) {
		this.acao = new AcaoVaPrisao(casa);
	}

}
