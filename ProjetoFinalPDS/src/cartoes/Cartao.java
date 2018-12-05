package cartoes;

import atores.Jogador;

import interfaces.Acao;

public abstract class Cartao implements Acao {
	private String descricao;
	protected Acao acao;

	public void executarAcao(Jogador j) {
		System.out.println(this.getDescricao());
		acao.executarAcao(j);
	}

	public Cartao(String desc) {
		this.descricao = desc;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Acao getAcao() {
		System.out.println(this.getDescricao());
		return acao;
	}

	@Override
	public String toString() {
		return "Cartao [descricao=" + descricao + "]\n";
	}

}
