package iterador;
import java.util.ArrayList;

import base.Jogador;
import casas.CasaTabuleiro;
public class IteradorCasa {
	private ArrayList<CasaTabuleiro> casas = new ArrayList<CasaTabuleiro>();
	private Jogador jogador;
	
	public IteradorCasa(ArrayList<CasaTabuleiro> casas, Jogador jogador) {
		this.casas = casas;
		this.jogador = jogador;
	}
	public void andar(int x) {
		int atual = this.getCasaAtual(jogador.getPosicaoAtual());
		int novaPosicao = (atual + x) % casas.size();
		jogador.setPosicaoAtual(casas.get(novaPosicao));
	}
	
	
	public int getCasaAtual(CasaTabuleiro casaAtual) {
		for (int i = 0; i < casas.size(); i++) {
			if(casas.get(i) == casaAtual) {
				return i;
			}
		}
		return -1;
	}
	public ArrayList<CasaTabuleiro> getCasas() {
		return casas;
	}
	public void setCasas(ArrayList<CasaTabuleiro> casas) {
		this.casas = casas;
	}
	public Jogador getJogador() {
		return jogador;
	}
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	
}
