package interfaces;

import base.Jogador;
import casas.CasaTabuleiro;
import casas.Prisao;

public class AcaoVaPrisao implements Acao {
	private CasaTabuleiro casa;
	public  AcaoVaPrisao(Prisao casa) {
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
