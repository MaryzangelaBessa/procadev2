public class Jogador {
	private String nome;
	private float saldo;
	private Casa posicaoAtual;
	
	public Jogador(String nome, float saldo, Casa posicaoAtual) {
		this.nome = nome;
		this.saldo = saldo;
		this.posicaoAtual = posicaoAtual;
	}

	public String getNome() {
		return nome;
	}

	public float getSaldo() {
		return saldo;
	}

	public Casa getPosicaoAtual() {
		return posicaoAtual;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void setPosicaoAtual(Casa posicaoAtual) {
		this.posicaoAtual = posicaoAtual;
	}
	
	
}
