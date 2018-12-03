package cartoes;

import casas.PontoPartida;
import interfaces.Acao;
import interfaces.AcaoReceber;
import interfaces.AcaoMover;

public class CartaoSorte extends Cartao {
	private Acao acao;

	public CartaoSorte(String desc) {
		super(desc);
	}

	public void setAcaoRecebe(int value) {
		this.acao = new AcaoReceber(value);
	}

	public void setAcaoMove(PontoPartida casa) {
		this.acao = new AcaoMover(casa);
	}

	public Acao getAcao() {
		return acao;
	}

}
