package base;
import java.util.ArrayList;
import java.util.Arrays;

import JGamePlay.GameImage;
import casas.*;
import util.Posicao;
import cartoes.*;
public class Tabuleiro {
	private static Tabuleiro tabuleiro = new Tabuleiro();
	private String filepath;
	private GameImage background;
	
//<<<<<<< HEAD
	
//=======
	private ArrayList<CasaTabuleiro> casas;
	private ArrayList<Cartao> cartoes;
	
	private FabricaCasas fabricaCasas;
//>>>>>>> branch 'master' of https://github.com/MaryzangelaBessa/procadev2.git
	
	private Tabuleiro() {
		this.filepath = JogoMain.filepath;
		background = new GameImage(filepath + "assets/background.png");
		casas = new ArrayList<CasaTabuleiro>();
		cartoes = new ArrayList<Cartao>();
		background.x = 0;
		background.y = 0;
		fabricaCasas = FabricaCasas.getInstance();
	}
	
	public static Tabuleiro getInstance() {
		return tabuleiro;
	}
	
	public void mostraTabuleiro() {
		background.draw();
	}
	
	public void criarCasas() {
		Posicao twPos = new Posicao(0, 0); 
		PontoPartida wall; 
		wall = (PontoPartida) fabricaCasas.construirCasa("PontoPartida", twPos);
		casas.add(wall);
		
		Posicao cbPos = new Posicao(62, 12); 
		Terreno castleBlack; 
		castleBlack = (Terreno) fabricaCasas.construirCasa("Terreno", cbPos);
		castleBlack.setNome("CASTLE BLACK");
		casas.add(castleBlack);
		
		
	}
	
	public void desenharCasas() {
		for (CasaTabuleiro casa : casas) {
			casa.desenhar();
		}
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
