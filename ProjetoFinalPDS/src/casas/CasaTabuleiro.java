package casas;

import java.util.ArrayList;

import JGamePlay.GameImage;
import base.Jogador;
import util.Posicao;

public abstract class CasaTabuleiro {

	private GameImage imagem;
	private ArrayList<Posicao> lugaresJogadores;
	private Posicao posicao;
	
	
	public abstract void addJogador(Jogador jogador);
	
	public GameImage getImagem() {
		return this.imagem;
	}

}
