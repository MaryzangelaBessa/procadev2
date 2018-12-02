package cartoes;

import casas.PontoPartida;
import interfaces.Acao;
import interfaces.AcaoReceber;
import interfaces.AcaoMover;

public abstract class CartoesSorte extends Cartoes {
	private Acao acao;

	public CartoesSorte(String desc, int value) {
		super(desc);
		this.setAcao(new AcaoReceber(value));
	}

	public CartoesSorte(String desc, PontoPartida casa) {
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
