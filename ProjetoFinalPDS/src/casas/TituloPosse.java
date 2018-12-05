package casas;

import atores.Jogador;

public abstract class TituloPosse {
	private boolean comprado;
	private Jogador proprietario;
	private int precoTitulo;
	
	public void comprarTitulo(Jogador novoProprietario) {
		int novoSaldo = novoProprietario.getSaldo() - this.precoTitulo;
		novoProprietario.setSaldo(novoSaldo);
		this.comprado = true;
		this.proprietario = novoProprietario;
	}

	public boolean isComprado() {
		return comprado;
	}

	public void setComprado(boolean comprado) {
		this.comprado = comprado;
	}

	public Jogador getProprietario() {
		return proprietario;
	}

	public void setProprietario(Jogador proprietario) {
		this.proprietario = proprietario;
	}

	public int getPrecoTitulo() {
		return precoTitulo;
	}

	public void setPrecoTitulo(int precoTitulo) {
		this.precoTitulo = precoTitulo;
	}
	
	
	
}
