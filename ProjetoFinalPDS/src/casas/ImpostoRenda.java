package casas;

//import java.util.ArrayList;

import JGamePlay.GameImage;
import base.Jogador;
import base.JogoMain;
import util.Posicao;

public class ImpostoRenda extends CasaTabuleiro {
	public ImpostoRenda(Posicao posicao) {
		super(posicao);
		this.imagem = new GameImage(JogoMain.filepath + "assets/not-today-tax.png");
		this.imagem.setDimension(111, 118);
		this.imagem.x = posicao.x;
		this.imagem.y = posicao.y;
		// TODO Auto-generated constructor stub
	}

	public void executarAcao(Jogador jogador) {
		int novoSaldo = jogador.getSaldo() - 200;
		jogador.setSaldo(novoSaldo);
	}

	@Override
	public void addJogador(Jogador jogador) {
		// TODO Auto-generated method stub
		
	}
}
