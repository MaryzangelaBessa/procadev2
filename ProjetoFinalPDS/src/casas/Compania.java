package casas;

import java.util.ArrayList;

import JGamePlay.GameImage;
import base.Jogador;
import util.Posicao;

public class Compania extends CasaTabuleiro {
	private int taxa;
	private Jogador proprietario;
	private boolean comprado;
	private int precoCompania;
	
	public Compania(GameImage imagem, Posicao posicao, ArrayList<Posicao> lugaresJogadores) {
		super(imagem, posicao, lugaresJogadores);
		// TODO Auto-generated constructor stub
	}

	public void comprarCompania(Jogador novoProprietario) {
		int novoSaldo = novoProprietario.getSaldo() - this.precoCompania;
		novoProprietario.setSaldo(novoSaldo);
		this.comprado = true;
		this.proprietario = novoProprietario;
	}

	public void cobrarTaxa(Jogador jogador) { // rever
		jogador.setSaldo(jogador.getSaldo() - this.taxa);
	}
	
	public void executaAcao(Jogador jogador) {
		if(!comprado) this.comprarCompania(jogador);
		else this.cobrarTaxa(jogador);
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

	@Override
	public void addJogador(Jogador jogador) {
		// TODO Auto-generated method stub
		
	}

}
