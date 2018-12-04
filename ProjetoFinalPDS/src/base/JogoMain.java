package base;

import java.awt.Font;

import JGamePlay.*;

public class JogoMain {

	public static String filepath = "src/";
	private static Window janela = new Window(1000, 700);
	private static Tabuleiro tabuleiro = Tabuleiro.getInstance();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tabuleiro.criarCasas();
		
		while(true) {
			tabuleiro.mostraTabuleiro();
			tabuleiro.desenharCasas();
//<<<<<<< HEAD
			
			
			
			
			
			
//=======

///>>>>>>> branch 'master' of https://github.com/MaryzangelaBessa/procadev2.git
			janela.display();
		}

	}

}
