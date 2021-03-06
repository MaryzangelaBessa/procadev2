package casas;

import java.util.ArrayList;

import atores.Jogador;

public class IteradorCasa {
	private ArrayList<CasaTabuleiro> casas = new ArrayList<CasaTabuleiro>();
	private static IteradorCasa iteradorCasa = new IteradorCasa();
	
	private IteradorCasa() {
		// TODO Auto-generated constructor stub
	}
	
	public static IteradorCasa getInstance() {
		return iteradorCasa;
	}
	
	public void andar(Jogador j, ArrayList<CasaTabuleiro> casas, int x){
		int atual = this.getCasaAtual(j.getPosicaoAtual(), casas);
		int novaPosicao = (atual + x) % casas.size();
		CasaTabuleiro novaCasa = casas.get(novaPosicao);
		j.setPosicaoAtual(novaCasa);
		novaCasa.addJogador(j);
	}

	public int getCasaAtual(CasaTabuleiro casaAtual, ArrayList<CasaTabuleiro> casas) {
		for (int i = 0; i < casas.size(); i++) {
			if (casas.get(i).equals(casaAtual)) {
				return i;
			}
		}
		return -1;
	}
	
	public void inicializar(PontoPartida pp, ArrayList<Jogador> jogadores) {
		for (Jogador jogador : jogadores) {
			jogador.setPosicaoAtual(pp);
		}
	}

	public ArrayList<CasaTabuleiro> getCasas() {
		return casas;
	}

	public void setCasas(ArrayList<CasaTabuleiro> casas) {
		this.casas = casas;
	}
}
