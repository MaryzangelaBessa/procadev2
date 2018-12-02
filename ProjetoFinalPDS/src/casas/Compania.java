package casas;
import base.Jogador;

public class Compania {
	private int taxa;
	private Jogador proprietario;
	private boolean comprado;
	private int precoCompania;
	
	
	public void comprarCompania(Jogador novoProprietario) {
		int novoSaldo = novoProprietario.getSaldo() - this.precoCompania;
		novoProprietario.setSaldo(novoSaldo);
		this.comprado = true;
		this.proprietario = novoProprietario;
	}
	
	public int getTaxa() {
		return taxa;
	}
	public void setTaxa(int taxa) {
		this.taxa = taxa;
	}
	public Jogador getProprietario() {
		return proprietario;
	}
	public void setProprietario(Jogador proprietario) {
		this.proprietario = proprietario;
	}
	public boolean isComprado() {
		return comprado;
	}
	public void setComprado(boolean comprado) {
		this.comprado = comprado;
	}
	public int getPrecoCompania() {
		return precoCompania;
	}
	public void setPrecoCompania(int precoCompania) {
		this.precoCompania = precoCompania;
	}
	
	
	
	
}
