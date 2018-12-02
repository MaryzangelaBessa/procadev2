package interfaces;

import base.Jogador;
import casas.CasaTabuleiro;
import casas.PontoPartida;

public class AcaoMover implements Acao {
	private CasaTabuleiro casa;
	public AcaoMover(PontoPartida casa) {
		this.casa = casa;
	}
	@Override
	public void executarAcao(Jogador jogador) {
		jogador.setPosicaoAtual(casa);
	}
	public CasaTabuleiro getCasa() {
		return casa;
	}
	public void setCasa(CasaTabuleiro casa) {
		this.casa = casa;
	}
	
	
}
