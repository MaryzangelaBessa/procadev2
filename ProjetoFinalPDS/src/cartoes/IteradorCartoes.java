package cartoes;

import java.util.ArrayList;

public class IteradorCartoes {
	private ArrayList<Cartao> cartoes = new ArrayList<Cartao>();
	private static IteradorCartoes iteradorCartoes = new IteradorCartoes();
	
	private IteradorCartoes() {
		
	}
	
	public Cartao getCartao(int index) {
		return cartoes.get(index);
	}
	
	public static IteradorCartoes getInstance() {
		return iteradorCartoes;
	}

	public ArrayList<Cartao> getCartoes() {
		return cartoes;
	}

	public void setCartoes(ArrayList<Cartao> cartoes) {
		this.cartoes = cartoes;
	}
}
