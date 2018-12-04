package testes;

import java.util.*;

import base.*;
import cartoes.*;
import casas.*;
import iterador.IteradorCasa;
import tabuleiro.Tabuleiro;

public class Main {

	public static void main(String[] args) {
		ConstrutorCasas ccas = new ConstrutorCasas();
		ArrayList<CasaTabuleiro> casas = ccas.construirCasas();
		ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
		Dado d = new Dado();
		IteradorCasa ic = IteradorCasa.getInstance();		
		ic.setCasas(casas);
		ConstrutorCartoes cc = new ConstrutorCartoes();
		ArrayList<Cartao> cart = cc.construirCartoes();
		IteradorCartoes icar = IteradorCartoes.getInstance();
		icar.setCartoes(cart);
		
		Tabuleiro tab = Tabuleiro.getInstance();
		
		
		boolean jogar = true;
		int qtd_jogadores, valorDado1, valorDado2;
		Scanner entrada = new Scanner(System.in);
		
		
		
		System.out.println("Quantas pessoas vao jogar?");
		qtd_jogadores = entrada.nextInt();
		entrada.nextLine();

		for (int i = 1; i <= qtd_jogadores; i++) {
			System.out.println("Qual é o nome do " + i +"º jogador?");
			String n = entrada.nextLine();
			jogadores.add(new Jogador(n, tab.getCasaI()));
		}
		
		ic.inicializar((PontoPartida) casas.get(0), jogadores);
				

		while (jogar) {
			for (Jogador jogador : jogadores) {
				valorDado1 = d.jogarDado();
				System.out.println(jogador.getNome() + " jogou o dado e saiu "
						+ valorDado1);
				valorDado2 = d.jogarDado();
				System.out.println(jogador.getNome() + " jogou o dado novamente e saiu "
						+ valorDado2);
				entrada.nextLine();
				
				ic.andar(jogador, casas, valorDado1 + valorDado2);
				
				System.out.println("O jogador " + jogador.getNome() + " está agora na casa "
						+ jogador.getPosicaoAtual().euSou());
				entrada.nextLine();
				
				jogador.getPosicaoAtual().executarAcao(jogador);
				System.out.println(jogador.getNome() + " " + jogador.getSaldo() + "\n");
				
				
				// realizar acao
				// casos de testes
				
				
			}
		}
		entrada.close();
	}

}
