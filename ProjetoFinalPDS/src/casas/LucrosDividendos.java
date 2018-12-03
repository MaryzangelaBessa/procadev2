package casas;

import java.util.ArrayList;

import JGamePlay.GameImage;
import base.Jogador;
import util.Posicao;

public class LucrosDividendos extends CasaTabuleiro {
	public LucrosDividendos(GameImage imagem, Posicao posicao, ArrayList<Posicao> lugaresJogadores) {
		super(imagem, posicao, lugaresJogadores);
		// TODO Auto-generated constructor stub
	}

	public void executaAcao(Jogador jogador) {
		int novoSaldo = jogador.getSaldo() + 200;
		jogador.setSaldo(novoSaldo);
	}

	@Override
	public void addJogador(Jogador jogador) {
		// TODO Auto-generated method stub
		
	}
}
