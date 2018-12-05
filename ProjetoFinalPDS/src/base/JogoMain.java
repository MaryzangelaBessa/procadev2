package base;

import java.util.ArrayList;
import java.util.Scanner;

import JGamePlay.*;
import iterador.IteradorCasa;

public class JogoMain {

	public static String filepath = "src/";
	public static Window janela = new Window(1000, 700);
	private static TelaSelecionarJogadores telaSelecionar = new TelaSelecionarJogadores();
	private static Tabuleiro tabuleiro = Tabuleiro.getInstance();
	private static int numJogadores;
	private static ArrayList<Jogador> jogadores;
	public static ArrayList<Sprite> personagens;
	private static MenuDado menuDado;
	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		tabuleiro.criarCasas();
		criarPersonagens();
		selecionarJogadores();
		selecionarPesonagem();
		tabuleiro.receberJogadores(jogadores);
		iniciarJogo();
		
	}
	
	public static void selecionarJogadores() {
		boolean selNumJogadores = false;
		while(!selNumJogadores) {
			telaSelecionar.desenharTela();
			numJogadores = telaSelecionar.obterEscolha();
			if(numJogadores > 0) {
				selNumJogadores = true;
			}
			janela.display();
		}
		jogadores = new ArrayList<>();
		for (int i = 1; i <= numJogadores; i++) {
			Jogador novoJogador = new Jogador(i);
			jogadores.add(novoJogador);
		}
	}
	
	public static void iniciarJogo() {
		
		IteradorCasa ic = IteradorCasa.getInstance();
		
	    while(true) {
			for (Jogador jogador : jogadores) {
				boolean terminouVez = false;
				menuDado = new MenuDado(jogador);
				int obterDados = 0;
				while(!terminouVez) {
					while(obterDados == 0) {
						showTabuleiro();
						menuDado.desenhar();
						obterDados = menuDado.lancarDados();
						janela.display();
						janela.delay(1000);
					}
					ic.andar(jogador, tabuleiro.getCasas(), obterDados);
					showTabuleiro();
					janela.display();
					janela.delay(1000);
					
					showTabuleiro();
					jogador.getPosicaoAtual().executarAcao(jogador);
					janela.display();
					while(!terminouVez) {
						entrada.nextLine();
						terminouVez = true;
					}
					
					
				}		
				
			}
			
		}
		
	}
	
	public static void showTabuleiro() {
		tabuleiro.mostraTabuleiro();
		tabuleiro.desenharCasas();
		tabuleiro.desenharJogadores();
	}
	
	public static void criarPersonagens() {
		personagens = new ArrayList<>();
		Sprite adventure = new Sprite(filepath + "assets/characters/adventure.png", 13);
		adventure.setDimension(32, 32);
		adventure.setCurrFrame(0);
		Sprite gabe = new Sprite(filepath + "assets/characters/gabe.png", 7);
		gabe.setDimension(32, 32);
		gabe.setCurrFrame(0);
		Sprite gladiator = new Sprite(filepath + "assets/characters/gladiator.png", 5);
		gladiator.setDimension(32, 32);
		gladiator.setCurrFrame(0);
		Sprite mani = new Sprite(filepath + "assets/characters/mani.png", 5);
		mani.setDimension(32, 32);
		mani.setCurrFrame(0);
		Sprite master = new Sprite(filepath + "assets/characters/master.png", 2);
		master.setDimension(32, 32);
		master.setCurrFrame(0);
		Sprite wizard = new Sprite(filepath + "assets/characters/wizard.png", 2);
		wizard.setDimension(32, 32);
		wizard.setCurrFrame(0);
		personagens.add(adventure);
		personagens.add(gabe);
		personagens.add(gladiator);
		personagens.add(mani);
		personagens.add(master);
		personagens.add(wizard);
	}
	
	public static void selecionarPesonagem() {
		for(int i = 0; (i < jogadores.size()) & (personagens.size() > 1); i++) {
			boolean selecionou = false;
			while(!selecionou) {
				TelaSelecionarPersonagem telaPersonagem;
				telaPersonagem = new TelaSelecionarPersonagem(personagens, jogadores.get(i));
				telaPersonagem.desenharTela();
				selecionou = telaPersonagem.obterPersonagem();
				janela.display();
			}
		}
		if(personagens.size() == 1) {
			int size = jogadores.size();
			Jogador ultimo  = jogadores.get(size - 1);
			int sizep = personagens.size();
			Sprite personagem = personagens.get(sizep - 1);
			ultimo.setPersonagem(personagem);
		}
		
	}
	
	

}
