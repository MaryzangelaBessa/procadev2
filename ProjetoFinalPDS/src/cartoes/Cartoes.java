package cartoes;

public abstract class Cartoes {
	private String descricao;

	public Cartoes(String desc) {
		this.descricao = desc;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
