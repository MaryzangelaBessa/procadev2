package tabuleiro;
import java.util.ArrayList;
import java.util.Arrays;

import JGamePlay.GameImage;
import base.JogoMain;
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
		GameImage theWall = new GameImage(filepath + "assets/the-wall.png");
		theWall.setDimension(52, 143);
		Posicao posicao = new Posicao(0, 0);
		Posicao p1 = new Posicao(0,0);
		Posicao p2 = new Posicao(0,0);
		Posicao p3 = new Posicao(0,0);
		Posicao p4 = new Posicao(0,0);
		Posicao p5 = new Posicao(0,0);
		Posicao p6 = new Posicao(0,0);
		ArrayList<Posicao> lugaresJogadores = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6)); 
		PontoPartida wall; 
		wall = (PontoPartida) fabricaCasas.construirCasa("PontoPartida", theWall, posicao, lugaresJogadores);
		casas.add(wall);
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
	
	public CasaTabuleiro getCasaI() {
		for (CasaTabuleiro casa : casas) {
			if(casa.getClass() == PontoPartida.class) {
				return casa;
			}
		}
		return null;
	}
	
}
