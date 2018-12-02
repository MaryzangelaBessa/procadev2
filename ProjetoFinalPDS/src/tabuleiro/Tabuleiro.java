package tabuleiro;
import java.util.ArrayList;
import casas.*;
import cartoes.*;
public class Tabuleiro {
	private ArrayList<Casa> casas = new ArrayList<Casa>();
	private ArrayList<Cartoes> cartoes = new ArrayList<Cartoes>();
	
	
	public ArrayList<Casa> getCasas() {
		return casas;
	}
	public void setCasas(ArrayList<Casa> casas) {
		this.casas = casas;
	}
	public ArrayList<Cartoes> getCartoes() {
		return cartoes;
	}
	public void setCartoes(ArrayList<Cartoes> cartoes) {
		this.cartoes = cartoes;
	}
	
	
	
}
