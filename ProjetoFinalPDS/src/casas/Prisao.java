package casas;

import java.util.ArrayList;

import JGamePlay.GameImage;
import base.Jogador;
import base.JogoMain;
import util.Posicao;

public class Prisao extends CasaTabuleiro {

	public Prisao(Posicao posicao) {
		super(posicao);
		this.imagem = new GameImage(JogoMain.filepath + "assets/dungeon.png");
		this.imagem.setDimension(125, 125);
		this.imagem.x = posicao.x;
		this.imagem.y = posicao.y;
	}

	@Override
	public void addJogador(Jogador jogador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executarAcao(Jogador jogador) {
		// TODO Auto-generated method stub
		
	}
}
