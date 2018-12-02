package casas;
import java.util.Arrays;
import base.Jogador;


public class Propriedade extends Casa{
	private Jogador proprietario;
	private int qtdCasas;
	private float aluguel[];
	
	public Propriedade(Jogador proprietario, int qtdCasas, float[] aluguel) {
		this.proprietario = proprietario;
		this.qtdCasas = qtdCasas;
		this.aluguel = aluguel;
	}
	
	public void calcularAluguel() {
	//	return aluguel[qtdCasas];
	}

	public Jogador getProprietario() {
		return proprietario;
	}

	public int getQtdCasas() {
		return qtdCasas;
	}

	public float[] getAluguel() {
		return aluguel;
	}

	public void setProprietario(Jogador proprietario) {
		this.proprietario = proprietario;
	}

	public void setQtdCasas(int qtdCasas) {
		this.qtdCasas = qtdCasas;
	}

	public void setAluguel(float[] aluguel) {
		this.aluguel = aluguel;
	}

	@Override
	public String toString() {
		return "Propriedade [proprietario=" + proprietario.getNome() + ", qtdCasas=" + qtdCasas + ", aluguel="
				+ Arrays.toString(aluguel) + "]";
	}
	
	
	
}
