package casas;

import base.Jogador;

public class ImpostoRenda extends Casa {
	public void pagarImposto(Jogador jogador) {
		int novoSaldo = jogador.getSaldo() - 200;
		jogador.setSaldo(novoSaldo);
	}
}
