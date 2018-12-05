package atores;
import java.util.ArrayList;

import JGamePlay.GameImage;
import casas.*;
import telas.ControladorJogo;
import cartoes.*;
public class Tabuleiro {
	private static Tabuleiro tabuleiro = new Tabuleiro();
	private String filepath;
	private GameImage background;
	
	private ArrayList<CasaTabuleiro> casas;
	private ArrayList<Cartao> cartoes;
	private ArrayList<Jogador> jogadores;
	private ConstrutorCasas construtorCasas = ConstrutorCasas.getInstance();
	
	private Tabuleiro() {
		this.filepath = ControladorJogo.filepath;
		background = new GameImage(filepath + "assets/background.png");
		casas = new ArrayList<CasaTabuleiro>();
		cartoes = new ArrayList<Cartao>();
		background.x = 0;
		background.y = 0;
	}
	
	public static Tabuleiro getInstance() {
		return tabuleiro;
	}
	
	public void mostraTabuleiro() {
		background.draw();
	}
	
	public void criarCasas() {
		this.casas = construtorCasas.construirCasas(); 	
	}
	
	public void desenharCasas() {
		for (CasaTabuleiro casa : casas) {
			casa.desenhar();
		}
	}
	
	public void receberJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
		PontoPartida pp = (PontoPartida) casas.get(0);
		for (Jogador jogador : this.jogadores) {
			pp.addJogador(jogador);
		}
	}
	
	public void desenharJogadores() {
		for (Jogador jogador : this.jogadores) {
			jogador.getPersonagem().draw();
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
