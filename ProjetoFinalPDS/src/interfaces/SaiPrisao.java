package interfaces;

import atores.Jogador;

public class SaiPrisao implements Acao {

	public  SaiPrisao() {	
	}

	@Override
	public void executarAcao(Jogador jogador) {
		jogador.setEstaPreso(false);
	}
}
