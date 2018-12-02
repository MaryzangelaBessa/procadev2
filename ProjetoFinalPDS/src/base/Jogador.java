package base;
import casas.Casa;

public class Jogador {
	private String nome;
	private int saldo;
	private Casa posicaoAtual;
	
	public Jogador(String nome,  Casa posicaoAtual) {
		this.nome = nome;
		this.saldo = 2000;
		this.posicaoAtual = posicaoAtual;
	}

	public String getNome() {
		return nome;
	}

	public int getSaldo() {
		return saldo;
	}

	public Casa getPosicaoAtual() {
		return posicaoAtual;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void setPosicaoAtual(Casa posicaoAtual) {
		this.posicaoAtual = posicaoAtual;
	}

	@Override
	public String toString() {
		return "Jogador [nome=" + nome + "]\n";
	}
	
	
}
