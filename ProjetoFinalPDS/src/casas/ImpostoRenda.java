package casas;

import base.Jogador;

public class ImpostoRenda extends CasaTabuleiro {
	public void pagarImposto(Jogador jogador) {
		int novoSaldo = jogador.getSaldo() - 200;
		jogador.setSaldo(novoSaldo);
	}

	@Override
	public void addJogador(Jogador jogador) {
		// TODO Auto-generated method stub
		
	}
}
