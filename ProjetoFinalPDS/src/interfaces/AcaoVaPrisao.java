package interfaces;

import base.Jogador;
import casas.CasaTabuleiro;
import casas.Prisao;
import iterador.IteradorCasa;

public class AcaoVaPrisao implements Acao {
	
	private IteradorCasa ic = IteradorCasa.getInstance();
	public  AcaoVaPrisao() {	
	}
	@Override
	public void executarAcao(Jogador jogador) {
		jogador.setPosicaoAtual(ic.getCasas().get(10));
		jogador.setEstaPreso(true);
	}
		
}
