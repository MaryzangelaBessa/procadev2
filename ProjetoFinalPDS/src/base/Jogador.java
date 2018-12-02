package base;

import casas.Casa;

public class Jogador {
	private String nome;
	private int saldo;
	private Casa posicaoAtual;
	private int duplasSeguidas;
	private boolean estaPreso;
	private int rodadasPreso;

	public int getDuplasSeguidas() {
		return duplasSeguidas;
	}

	public void setDuplasSeguidas(int duplasSeguidas) {
		this.duplasSeguidas = duplasSeguidas;
	}

	public boolean isEstaPreso() {
		return estaPreso;
	}

	public void setEstaPreso(boolean estaPreso) {
		this.estaPreso = estaPreso;
	}

	public int getRodadasPreso() {
		return rodadasPreso;
	}

	public void setRodadasPreso(int rodadasPreso) {
		this.rodadasPreso = rodadasPreso;
	}

	public Jogador(String nome, Casa posicaoAtual) {
		this.nome = nome;
		this.saldo = 2000;
		this.posicaoAtual = posicaoAtual;
		this.duplasSeguidas = 0;
		this.estaPreso = false;
		this.rodadasPreso = 0;
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
