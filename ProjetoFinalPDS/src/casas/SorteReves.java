package casas;

import JGamePlay.GameImage;
import base.Jogador;
import base.JogoMain;
import cartoes.Cartao;
import cartoes.CartaoReves;
import cartoes.CartaoSorte;
import cartoes.IteradorCartoes;
import util.Posicao;
import java.util.Random;

public class SorteReves extends CasaTabuleiro {

	private Random r = new Random();

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

	@Override
	public void executarAcao(Jogador jogador) {		
		IteradorCartoes ic = IteradorCartoes.getInstance();
		int id_cartao = r.nextInt(30 - 1) + 1;
		Cartao c =  ic.getCartao(id_cartao);
		if(c instanceof CartaoReves) {
			System.out.println("Reves");
			((CartaoReves) c).executarAcao(jogador);
			
		}else if(c instanceof CartaoSorte) {
			System.out.println("Sorte");
			((CartaoSorte) c).executarAcao(jogador);
			
		}
		
		
	}

}
