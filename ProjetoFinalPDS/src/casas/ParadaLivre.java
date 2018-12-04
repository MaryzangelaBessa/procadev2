package casas;

import java.util.ArrayList;

import JGamePlay.GameImage;
import base.Jogador;
import util.Posicao;

public class ParadaLivre extends CasaTabuleiro{

	public ParadaLivre(Posicao posicao) {
		super(posicao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addJogador(Jogador jogador) {
		// TODO Auto-generated method stub
		
	}
	
	public void desenhar() {
		this.imagem.draw();
	}

}
