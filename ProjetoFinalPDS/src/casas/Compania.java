package casas;

//import java.util.ArrayList;

import JGamePlay.GameImage;
import base.Jogador;
import base.JogoMain;
import util.Posicao;

public class Compania extends CasaTabuleiro {
	private int taxa;
	private Jogador proprietario;
	private boolean comprado;
	private int precoCompania;

	public Compania(Posicao posicao) {
		super(posicao);

		this.comprado = false;

		this.imagem = new GameImage(JogoMain.filepath + "assets/company.png");
		this.imagem.setDimension(105, 114);
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

	public void comprarCompania(Jogador novoProprietario) {
		int novoSaldo = novoProprietario.getSaldo() - this.precoCompania;
		novoProprietario.setSaldo(novoSaldo);
		this.comprado = true;
		this.proprietario = novoProprietario;
	}

	public void cobrarTaxa(Jogador jogador) { // rever
		jogador.setSaldo(jogador.getSaldo() - this.taxa);
		int novoSaldo = this.proprietario.getSaldo();
		novoSaldo += this.taxa;
		this.proprietario.setSaldo(novoSaldo);
	}

	public void executarAcao(Jogador jogador) {
		if (!comprado)
			this.comprarCompania(jogador);
		else
			this.cobrarTaxa(jogador);
	}

	public int getTaxa() {
		return taxa;
	}

	public void setTaxa(int taxa) {
		this.taxa = taxa;
	}

	public Jogador getProprietario() {
		return proprietario;
	}

	public void setProprietario(Jogador proprietario) {
		this.proprietario = proprietario;
	}

	public boolean isComprado() {
		return comprado;
	}

	public void setComprado(boolean comprado) {
		this.comprado = comprado;
	}

	public int getPrecoCompania() {
		return precoCompania;
	}

	public void setPrecoCompania(int precoCompania) {
		this.precoCompania = precoCompania;
	}

}
