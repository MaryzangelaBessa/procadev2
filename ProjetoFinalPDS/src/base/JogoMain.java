package base;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Scanner;

import JGamePlay.*;

public class JogoMain {

	public static String filepath = "src/";
	public static Window janela = new Window(1000, 700);
	private static TelaSelecionarJogadores telaSelecionar = new TelaSelecionarJogadores();
	private static Tabuleiro tabuleiro = Tabuleiro.getInstance();
	private static int numJogadores;
	private static ArrayList<Jogador> jogadores;
	private static ArrayList<Sprite> personagens;
	
	
	public static void main(String[] args) {
		tabuleiro.criarCasas();
		criarPersonagens();
		selecionarJogadores();
		selecionarPesonagem();
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
		while(true) {
			tabuleiro.mostraTabuleiro();
			tabuleiro.desenharCasas();
//<<<<<<< HEAD
			
			
			
			
			
			
//=======

///>>>>>>> branch 'master' of https://github.com/MaryzangelaBessa/procadev2.git
			janela.display();
		}
		
	}
	
	public static void criarPersonagens() {
		personagens = new ArrayList<>();
		Sprite adventure = new Sprite(filepath + "assests/characters/adventure.png", 13);
		adventure.setDimension(32, 32);
		adventure.setCurrFrame(0);
		Sprite gabe = new Sprite(filepath + "assests/characters/gabe.png", 7);
		gabe.setDimension(32, 32);
		gabe.setCurrFrame(0);
		Sprite gladiator = new Sprite(filepath + "assests/characters/gladiator.png", 5);
		gladiator.setDimension(32, 32);
		gladiator.setCurrFrame(0);
		Sprite mani = new Sprite(filepath + "assests/characters/mani.png", 5);
		mani.setDimension(32, 32);
		mani.setCurrFrame(0);
		Sprite master = new Sprite(filepath + "assests/characters/master.png", 2);
		master.setDimension(32, 32);
		master.setCurrFrame(0);
		Sprite wizard = new Sprite(filepath + "assests/characters/wizard.png", 2);
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
		int i = 0;
		while(i < numJogadores) {
			TelaSelecionarPersonagem telaPersonagem = new TelaSelecionarPersonagem(personagens, jogadores.get(i));
			telaPersonagem.desenharTela();
			janela.display();
			
		}
	}

}
