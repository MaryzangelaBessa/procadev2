package interfaces;

import atores.Jogador;

public class AcaoPagar implements Acao {
	private int valor;

	public AcaoPagar(int value) {
		this.valor = value;
	}

	public void executarAcao(Jogador jogador) {
		System.out.println("Pague " + this.valor);
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
