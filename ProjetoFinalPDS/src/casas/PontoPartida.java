package casas;

import JGamePlay.GameImage;
import atores.Jogador;
import telas.ControladorJogo;
import util.Posicao;

public class PontoPartida extends CasaTabuleiro{
	
	public PontoPartida(Posicao posicao) {
		super(posicao);
		this.imagem = new GameImage(ControladorJogo.filepath + "assets/the-wall.png");
		this.imagem.setDimension(52, 143);
		this.imagem.x = posicao.x;
		this.imagem.y = posicao.y;
		this.setLugares();
	}
	
	private void setLugares() {
		Posicao p1 = new Posicao(this.imagem.x + 16, this.imagem.y + 21);
		Posicao p2 = new Posicao(this.imagem.x, this.imagem.y + 36);
		Posicao p3 = new Posicao(this.imagem.x + 16, this.imagem.y + 53);
		Posicao p4 = new Posicao(this.imagem.x, this.imagem.y + 70);
		Posicao p5 = new Posicao(this.imagem.x + 16, this.imagem.y + 86);
		Posicao p6 = new Posicao(this.imagem.x, this.imagem.y + 99);
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
	public void executarAcao(Jogador jogador) {
		int novoSaldo = jogador.getSaldo() + 200;
		jogador.setSaldo(novoSaldo);
	}
}
