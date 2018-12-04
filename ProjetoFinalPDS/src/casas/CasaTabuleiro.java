package casas;

import java.util.ArrayList;

import JGamePlay.GameImage;
import JGamePlay.Text;
import base.Jogador;
import util.Posicao;

public abstract class CasaTabuleiro {

	protected GameImage imagem;
	protected ArrayList<Posicao> lugaresJogadores;
	protected Posicao posicao;
	
	public CasaTabuleiro(Posicao posicao) {
		this.posicao = posicao;
	}
	
	public String euSou() {
		return "Eu sou :" + this.getClass();
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
