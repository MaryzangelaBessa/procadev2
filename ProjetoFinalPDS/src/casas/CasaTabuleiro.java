package casas;

import java.util.ArrayList;

import JGamePlay.GameImage;
import base.Jogador;
import util.Posicao;

public abstract class CasaTabuleiro {

	private GameImage imagem;
	private ArrayList<Posicao> lugaresJogadores;
	private Posicao posicao;
	
	public CasaTabuleiro(GameImage imagem, Posicao posicao, ArrayList<Posicao> lugaresJogadores) {
		this.imagem = imagem;
		this.posicao = posicao;
		this.imagem.x = posicao.x;
		this.imagem.y = posicao.y;
		this.lugaresJogadores = lugaresJogadores;
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
	}


	public void setImagem(GameImage imagem) {
		this.imagem = imagem;
	}
	
	

}
