package casas;



import JGamePlay.GameImage;
import base.Jogador;
import base.JogoMain;
import util.Posicao;

public class LucrosDividendos extends CasaTabuleiro {
	public LucrosDividendos(Posicao posicao) {
		super(posicao);
		this.imagem = new GameImage(JogoMain.filepath + "assets/profits.png");
		this.imagem.setDimension(49, 125);
		this.imagem.x = posicao.x;
		this.imagem.y = posicao.y;
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
