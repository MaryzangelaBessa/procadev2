package casas;

import JGamePlay.GameImage;
import base.Jogador;
import interfaces.Acao;
import interfaces.AcaoVaPrisao;
import util.Posicao;

public class VaPrisao extends CasaTabuleiro{

	public VaPrisao(Posicao posicao) {
		super(posicao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addJogador(Jogador jogador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executarAcao(Jogador jogador) {
		System.out.println("O jogador " + jogador.getNome() + " irá para a prisao!");
		Acao act = new AcaoVaPrisao();
		act.executarAcao(jogador);
	}

}
