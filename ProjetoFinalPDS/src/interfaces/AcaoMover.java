package interfaces;

import base.Jogador;
import casas.CasaTabuleiro;
import casas.PontoPartida;
import iterador.IteradorCasa;

public class AcaoMover implements Acao {
	private CasaTabuleiro casa;
	private IteradorCasa ic = IteradorCasa.getInstance();
	
	public AcaoMover(PontoPartida casa) {
		this.casa = casa;
	}
	@Override
	public void executarAcao(Jogador jogador) {
		int novoSaldo = jogador.getSaldo() + 200;
		jogador.setSaldo(novoSaldo);
		jogador.setPosicaoAtual(ic.getCasas().get(0));
		
	}
	public CasaTabuleiro getCasa() {
		return casa;
	}
	public void setCasa(CasaTabuleiro casa) {
		this.casa = casa;
	}
	
	
}
