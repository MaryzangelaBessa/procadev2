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
	
	private ArrayList<Casa> casas = new ArrayList<Casa>();
	private ArrayList<Cartoes> cartoes = new ArrayList<Cartoes>();
	
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
