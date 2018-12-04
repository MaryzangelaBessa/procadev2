package casas;

import java.util.ArrayList;

import JGamePlay.GameImage;
import base.Jogador;
import base.JogoMain;
import util.Posicao;

public class SorteReves extends CasaTabuleiro {

	public SorteReves(Posicao posicao) {
		super(posicao);
		this.imagem = new GameImage(JogoMain.filepath + "assets/setback.png");
		this.imagem.setDimension(25, 38);
		this.imagem.x = posicao.x;
		this.imagem.y = posicao.y;
	}

	@Override
	public void addJogador(Jogador jogador) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void desenhar() {
		super.desenhar();
	}

}
