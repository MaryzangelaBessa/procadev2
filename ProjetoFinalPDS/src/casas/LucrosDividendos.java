package casas;



import JGamePlay.GameImage;
import base.Jogador;
import util.Posicao;

public class LucrosDividendos extends CasaTabuleiro {
	public LucrosDividendos(Posicao posicao) {
		super(posicao);
		// TODO Auto-generated constructor stub
	}

	public void executarAcao(Jogador jogador) {
		int novoSaldo = jogador.getSaldo() + 200;
		jogador.setSaldo(novoSaldo);
	}

	@Override
	public void addJogador(Jogador jogador) {
		// TODO Auto-generated method stub
		
	}
}
