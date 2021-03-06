package telas;

import java.util.ArrayList;

import JGamePlay.*;
import atores.Jogador;
import atores.Tabuleiro;
import cartoes.Cartao;
import cartoes.ConstrutorCartoes;
import cartoes.IteradorCartoes;
import casas.IteradorCasa;

public class ControladorJogo {

	public static String filepath = "src/";
	public static Window janela = new Window(1000, 700);
	private TelaSelecionarJogadores telaSelecionar = new TelaSelecionarJogadores();
	private Tabuleiro tabuleiro = Tabuleiro.getInstance();
	private int numJogadores;
	private ArrayList<Jogador> jogadores;
	public ArrayList<Sprite> personagens;
	private MenuDado menuDado;
	private static ControladorJogo controladorJogo = new ControladorJogo(); 
	
	private ControladorJogo() {
		
	}
	
	public static ControladorJogo getInstance() {
		return controladorJogo;
	}
	
	public void criarCasas() {	
		tabuleiro.criarCasas();
	}
	
	public void selecionarJogadores() {
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
	
	public void iniciarJogo() {
		IteradorCasa ic = IteradorCasa.getInstance();
		ic.setCasas(tabuleiro.getCasas());
		
		ConstrutorCartoes cc = new ConstrutorCartoes();
		ArrayList<Cartao> cart = cc.construirCartoes();
		IteradorCartoes icar = IteradorCartoes.getInstance();
		icar.setCartoes(cart);

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
						janela.delay(500);
					}
					ic.andar(jogador, tabuleiro.getCasas(), obterDados);
					showTabuleiro();
					janela.display();
					janela.delay(1500);
					
					jogador.getPosicaoAtual().executarAcao(jogador);
					
					terminouVez = true;
				}		
			}
		}	
	}
	
	public void showTabuleiro() {
		tabuleiro.mostraTabuleiro();
		tabuleiro.desenharCasas();
		tabuleiro.desenharJogadores();
	}
	
	public void criarPersonagens() {
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
	
	public void selecionarPesonagem() {
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
		tabuleiro.receberJogadores(jogadores);
	}
}

