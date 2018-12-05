package interfaces;

import base.Jogador;
import iterador.IteradorCasa;

public class SaiPrisao implements Acao {

	private IteradorCasa ic = IteradorCasa.getInstance();

	public  SaiPrisao() {	
	}

	@Override
	public void executarAcao(Jogador jogador) {
		jogador.setEstaPreso(false);
	}
}
