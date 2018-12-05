package casas;

import JGamePlay.GameImage;
import atores.Jogador;
import telas.ControladorJogo;
import util.Posicao;

public class ParadaLivre extends CasaTabuleiro{

	public ParadaLivre(Posicao posicao) {
		super(posicao);
		this.imagem = new GameImage(ControladorJogo.filepath + "assets/freestop.png");
		this.imagem.setDimension(125, 125);
		this.imagem.x = posicao.x;
		this.imagem.y = posicao.y;
	}

	@Override
	public void addJogador(Jogador jogador) {
		// TODO Auto-generated method stub
		
	}
	
	public void desenhar() {
		this.imagem.draw();
	}

	@Override
	public void executarAcao(Jogador jogador) {
		System.out.println("Ola jogador " + jogador.getId() + " voce esta na Parada Livre! "
				+ "Nada de mais Acontece aqui!");
		
	}

}
