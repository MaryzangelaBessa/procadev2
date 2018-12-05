package casas;

import java.util.ArrayList;

import JGamePlay.GameImage;
import base.Jogador;
import interfaces.Acao;
import util.Posicao;

public abstract class CasaTabuleiro implements Acao {

	protected GameImage imagem;
	protected ArrayList<Posicao> lugaresJogadores;
	protected Jogador[] lugaresOcupados;
	protected Posicao posicao;
	
	
	public CasaTabuleiro(Posicao posicao) {
		this.posicao = posicao;
		this.lugaresJogadores = new ArrayList<>();
		this.lugaresOcupados = new Jogador[6];
		for (int i = 0; i < lugaresOcupados.length; i++) {
			this.lugaresOcupados[i] = null;
		}
	}
	
	public String euSou() {
		return "" + this.getClass();
	}
	
	
	
	public abstract void addJogador(Jogador jogador);
	
	public void desenhar() {
		this.imagem.draw();
	}
	
	public GameImage getImagem() {
		return this.imagem;
	}


	public ArrayList<Posicao> getLugaresJogadores() {
		return lugaresJogadores;
	}


	public void setLugaresJogadores(ArrayList<Posicao> lugaresJogadores) {
		this.lugaresJogadores = lugaresJogadores;
	}


	public Posicao getPosicao() {
		return posicao;
	}


	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
		this.imagem.x = posicao.x;
		this.imagem.y = posicao.y;
	}


	public void setImagem(GameImage imagem) {
		this.imagem = imagem;
	}

	
	
	

}
