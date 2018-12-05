package cartoes;

import interfaces.AcaoPagar;
import interfaces.AcaoVaPrisao;

public class CartaoReves extends Cartao {

	public CartaoReves(String desc) {
		super(desc);
	}

	public void setAcaoPagar(int value) {
		this.acao = new AcaoPagar(value);
	}

	public void setAcaoPrender() {
		this.acao = new AcaoVaPrisao();
	}
}
