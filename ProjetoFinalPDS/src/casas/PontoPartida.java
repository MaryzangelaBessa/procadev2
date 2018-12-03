package casas;

import JGamePlay.GameImage;
import base.Jogador;
import base.JogoMain;
import util.Posicao;

public class PontoPartida extends CasaTabuleiro{
	
	public PontoPartida(Posicao posicao) {
		super(posicao);
		this.imagem = new GameImage(JogoMain.filepath + "assets/the-wall.png");
		this.imagem.setDimension(52, 143);
		this.imagem.x = posicao.x;
		this.imagem.y = posicao.y;

	}

	@Override
	public void addJogador(Jogador jogador) {
		// TODO Auto-generated method stub
		
	}
}
