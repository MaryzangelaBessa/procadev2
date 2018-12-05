package cartoes;

import casas.PontoPartida;
import interfaces.AcaoMover;
import interfaces.AcaoReceber;
import interfaces.SaiPrisao;

public class CartaoSorte extends Cartao {
	public CartaoSorte(String desc) {
		super(desc);
	}

	public void setAcaoRecebe(int value) {
		this.acao = new AcaoReceber(value);
	}

	public void setAcaoMove(PontoPartida casa) {
		this.acao = new AcaoMover(casa);
	}

	public void setAcaoSaiPrisao() {
		this.acao = new SaiPrisao();
	}
}
