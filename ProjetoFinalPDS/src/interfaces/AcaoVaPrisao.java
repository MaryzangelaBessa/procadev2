package interfaces;

import base.Jogador;
import casas.Casa;
import casas.Prisao;

public class AcaoVaPrisao implements Acao {
	private Casa casa;
	public  AcaoVaPrisao(Prisao casa) {
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
