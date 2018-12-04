package base;

import java.awt.Font;

import JGamePlay.*;

public class JogoMain {

	public static String filepath = "src/";
	public static Window janela = new Window(1000, 700);
	private static Tabuleiro tabuleiro = Tabuleiro.getInstance();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tabuleiro.criarCasas();
		
		while(true) {
			tabuleiro.mostraTabuleiro();
			tabuleiro.desenharCasas();

			janela.display();
		}

	}

}
