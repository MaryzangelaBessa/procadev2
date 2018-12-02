package cartoes;

import casas.PontoPartida;
import interfaces.Acao;
import interfaces.AcaoMover;
import interfaces.AcaoPagar;

public abstract class CartoesReves extends Cartoes {

	private Acao acao;

	public CartoesReves(String desc, int value) {
		super(desc);
		this.setAcao(new AcaoPagar(value));
	}

	public CartoesReves(String desc, PontoPartida casa) {
		super(desc);
		this.setAcao(new AcaoMover(casa));
	}

	public Acao getAcao() {
		return acao;
	}

	public void setAcao(Acao acao) {
		this.acao = acao;
	}

}
