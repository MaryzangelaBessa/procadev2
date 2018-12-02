package casas;

import base.Jogador;

public class ImpostoRenda extends CasaTabuleiro {
	public void executaAcao(Jogador jogador) {
		int novoSaldo = jogador.getSaldo() - 200;
		jogador.setSaldo(novoSaldo);
	}
}
