package cartoes;

import base.Jogador;
import casas.Prisao;
import interfaces.Acao;

import interfaces.AcaoPagar;
import interfaces.AcaoVaPrisao;

public class CartaoReves extends Cartao {

	private Acao acao;

	public CartaoReves(String desc) {
		super(desc);

	}
	
	public void executarAcao(Jogador j) {
		System.out.println(this.getDescricao());
		acao.executarAcao(j);
	}
	
	public Acao getAcao() {
		System.out.println(this.getDescricao());
		return acao;
	}

	public void setAcaoPagar(int value) {
		this.acao = new AcaoPagar(value);
	}

	public void setAcaoPrender() {
		this.acao = new AcaoVaPrisao();
	}

}
