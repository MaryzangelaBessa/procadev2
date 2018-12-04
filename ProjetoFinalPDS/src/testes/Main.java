package testes;

import java.util.*;

import base.*;
import cartoes.*;
import tabuleiro.Tabuleiro;

public class Main {

	public static void main(String[] args) {
		ConstrutorCartoes cc = new ConstrutorCartoes();
		Tabuleiro tab = Tabuleiro.getInstance();
		ArrayList<Cartao> cart = cc.construirCartoes();
		boolean jogar = true;
		ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
		int qtd_jogadores, valorDado1, valorDado2;
		Scanner entrada = new Scanner(System.in);
		Dado d = new Dado();
		
		System.out.println("Quantas pessoas vao jogar?");
		qtd_jogadores = entrada.nextInt();
		entrada.nextLine();

		for (int i = 1; i <= qtd_jogadores; i++) {
			System.out.println("Qual é o nome do " + i +"º jogador?");
			String n = entrada.nextLine();
			jogadores.add(new Jogador(n, tab.getCasaI()));
		}
		

		while (jogar) {
			for (Jogador jogador : jogadores) {
				valorDado1 = d.jogarDado();
				System.out.println(jogador.getNome() + " jogou o dado e saiu "
						+ valorDado1);
				valorDado2 = d.jogarDado();
				System.out.println(jogador.getNome() + " jogou o dado novamente e saiu "
						+ valorDado2);
				entrada.nextLine();
				
				
				
				
				/*
				 * 
				 * */
				// Andar para a casa correrta
				// realizar acao
				// casos de testes
				
				
			}
		}
		entrada.close();
	}

}
