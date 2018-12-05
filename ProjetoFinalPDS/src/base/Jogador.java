package base;

import JGamePlay.Sprite;
import casas.CasaTabuleiro;

public class Jogador {
	private int id;
	private String nome;
	private int saldo;
	private CasaTabuleiro posicaoAtual;
	private int duplasSeguidas;
	private boolean estaPreso;
	private int rodadasPreso;
	private Sprite personagem;

	public Jogador(int id) {
		this.id = id;
		this.saldo = 2458;
//		this.posicaoAtual = posicaoAtual;
		this.duplasSeguidas = 0;
		this.estaPreso = false;
		this.rodadasPreso = 0;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public int getSaldo() {
		return saldo;
	}

	public CasaTabuleiro getPosicaoAtual() {
		return posicaoAtual;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void setPosicaoAtual(CasaTabuleiro posicaoAtual) {
		this.posicaoAtual = posicaoAtual;
	}
	
	public Sprite getPersonagem() {
		return this.personagem;
	}
	
	public void setPersonagem(Sprite personagem) {
		this.personagem = personagem;
	}
	
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


	@Override
	public String toString() {
		return "Jogador [nome=" + nome + "]\n";
	}

}
