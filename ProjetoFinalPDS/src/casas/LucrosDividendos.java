package casas;

import base.Jogador;

public class LucrosDividendos {
	public void lucrar(Jogador jogador) {
		int novoSaldo = jogador.getSaldo() + 200;
		jogador.setSaldo(novoSaldo);
	}
}
