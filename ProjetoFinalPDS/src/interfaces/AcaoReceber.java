package interfaces;

import atores.Jogador;

public class AcaoReceber implements Acao {
	private int valor;
	public AcaoReceber(int value) {
		this.valor = value;
	}
	
	@Override
	public void executarAcao(Jogador jogador) {
		System.out.println("Receba " + this.valor);
		int novoSaldo = jogador.getSaldo() + this.valor;
		jogador.setSaldo(novoSaldo);

	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
}
