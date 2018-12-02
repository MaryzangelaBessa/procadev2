package interfaces;

import base.Jogador;
import casas.Casa;
import casas.PontoPartida;

public class AcaoMover implements Acao {
	private Casa casa;
	public AcaoMover(PontoPartida casa) {
		this.casa = casa;
	}
	@Override
	public void executarAcao(Jogador jogador) {
		jogador.setPosicaoAtual(casa);
	}
	public Casa getCasa() {
		return casa;
	}
	public void setCasa(Casa casa) {
		this.casa = casa;
	}
	
	
}
