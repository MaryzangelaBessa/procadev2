package base;

import JGamePlay.*;
import tabuleiro.Tabuleiro;

public class JogoMain {

	public static String filepath = "src/";
	private static Window janela = new Window(1000, 700);
	private static Tabuleiro tabuleiro = Tabuleiro.getInstance();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		while(true) {
			tabuleiro.mostraTabuleiro();
			
			janela.display();
		}

	}

}
