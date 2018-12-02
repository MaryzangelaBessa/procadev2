package interfaces;

import base.Jogador;

public class AcaoPagar implements Acao {
	private int valor;

	public AcaoPagar(int value) {
		this.valor = value;
	}

	public void executarAcao(Jogador jogador) {
		int novoSaldo = jogador.getSaldo() - this.valor;
		jogador.setSaldo(novoSaldo);

	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
}
