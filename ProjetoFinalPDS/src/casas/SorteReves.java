package casas;

import JGamePlay.GameImage;
import atores.Jogador;
import cartoes.Cartao;
import cartoes.CartaoReves;
import cartoes.CartaoSorte;
import cartoes.IteradorCartoes;
import telas.JogoMain;
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
		this.setLugares();
	}
	
	private void setLugares() {
		Posicao p1 = new Posicao(this.imagem.x, this.imagem.y + 35);
		Posicao p2 = new Posicao(this.imagem.x, this.imagem.y + 62);
		Posicao p3 = new Posicao(this.imagem.x, this.imagem.y + 87);
		Posicao p4 = new Posicao(this.imagem.x + 95, this.imagem.y + 35);
		Posicao p5 = new Posicao(this.imagem.x + 95, this.imagem.y + 62);
		Posicao p6 = new Posicao(this.imagem.x + 95, this.imagem.y + 87);
		this.lugaresJogadores.add(p1);
		this.lugaresJogadores.add(p2);
		this.lugaresJogadores.add(p3);
		this.lugaresJogadores.add(p4);
		this.lugaresJogadores.add(p5);
		this.lugaresJogadores.add(p6);
	}

	@Override
	public void addJogador(Jogador jogador) {
		jogador.setPosicaoAtual(this);
		for (int i = 0; i < lugaresJogadores.size(); i++) {
			if(this.lugaresOcupados[i] == null) {
				this.lugaresOcupados[i] = jogador;
				jogador.getPersonagem().x = this.lugaresJogadores.get(i).x;
				jogador.getPersonagem().y = this.lugaresJogadores.get(i).y;
				break;
			}
		}	
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
