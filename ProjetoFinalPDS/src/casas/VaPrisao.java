package casas;

import JGamePlay.GameImage;
import atores.Jogador;
import interfaces.Acao;
import interfaces.AcaoVaPrisao;
import telas.ControladorJogo;
import util.Posicao;

public class VaPrisao extends CasaTabuleiro{

	public VaPrisao(Posicao posicao) {
		super(posicao);
		this.imagem = new GameImage(ControladorJogo.filepath + "assets/dungeon-gate.png");
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
		System.out.println("O jogador " + jogador.getNome() + " ir� para a prisao!");
		Acao act = new AcaoVaPrisao();
		act.executarAcao(jogador);
	}

}
