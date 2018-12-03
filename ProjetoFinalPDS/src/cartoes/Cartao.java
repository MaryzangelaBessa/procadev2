package cartoes;



public abstract class Cartao {
	private String descricao;
	
	public Cartao(String desc) {
		this.descricao = desc;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
