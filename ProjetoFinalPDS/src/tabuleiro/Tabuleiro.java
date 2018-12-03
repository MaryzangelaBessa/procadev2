package tabuleiro;
import java.util.ArrayList;

import JGamePlay.GameImage;
import base.JogoMain;
import casas.*;
import cartoes.*;
public class Tabuleiro {
	private static Tabuleiro tabuleiro = new Tabuleiro();
	private String filepath = JogoMain.filepath;
	private GameImage background = new GameImage(filepath + "assets/background.png");
	
	private ArrayList<CasaTabuleiro> casas = new ArrayList<CasaTabuleiro>();
	private ArrayList<Cartao> cartoes = new ArrayList<Cartao>();
	
	private Tabuleiro() {
		background.x = 0;
		background.y = 0;
	}
	
	public static Tabuleiro getInstance() {
		return tabuleiro;
	}
	
	public void mostraTabuleiro() {
		background.draw();
	}
	
	public ArrayList<CasaTabuleiro> getCasas() {
		return casas;
	}
	public void setCasas(ArrayList<CasaTabuleiro> casas) {
		this.casas = casas;
	}
	public ArrayList<Cartao> getCartoes() {
		return cartoes;
	}
	public void setCartoes(ArrayList<Cartao> cartoes) {
		this.cartoes = cartoes;
	}
	
	
	
}
