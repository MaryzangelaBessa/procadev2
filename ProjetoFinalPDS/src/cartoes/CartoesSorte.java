package cartoes;

import casas.PontoPartida;
import interfaces.Acao;
import interfaces.AcaoReceber;
import interfaces.AcaoMover;

public  class CartoesSorte extends Cartoes {
	private Acao acao;

	public CartoesSorte(String desc) {
		super(desc);
		
	}

	public Acao getAcao() {
		return acao;
	}

	public void setAcaoRecebe(int value) {
		this.acao = new AcaoReceber(value);
	}
	public void setAcaoMove(PontoPartida casa) {
		this.acao = new AcaoMover(casa);
	}
	
}
