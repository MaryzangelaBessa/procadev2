package casas;

import base.Jogador;

public class LucrosDividendos extends CasaTabuleiro {
	public void executaAcao(Jogador jogador) {
		int novoSaldo = jogador.getSaldo() + 200;
		jogador.setSaldo(novoSaldo);
	}
}
