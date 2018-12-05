package testes;

import java.util.*;

import base.*;
import cartoes.*;
import casas.*;
import iterador.IteradorCasa;
import base.Tabuleiro;

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

		
		int qtd_jogadores, valorDado1, valorDado2;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantas pessoas v�o jogar?");
		qtd_jogadores = entrada.nextInt();
		entrada.nextLine();

		for (int i = 1; i <= qtd_jogadores; i++) {
			System.out.println("Qual � o nome do " + i + "� jogador?");
			int n = entrada.nextInt();
			jogadores.add(new Jogador(n));
		}

		ic.inicializar((PontoPartida) casas.get(0), jogadores);
		Jogador perdeu = null;
		while (jogadores.size() != 1) {
			for (Jogador jogador : jogadores) {
				entrada.nextLine();
				
				valorDado1 = d.jogarDado();
				System.out.println(jogador.getId() + " jogou o dado e saiu " + valorDado1);
				valorDado2 = d.jogarDado();
				System.out.println(jogador.getId() + " jogou o dado novamente e saiu " + valorDado2);
				entrada.nextLine();

				ic.andar(jogador, casas, valorDado1 + valorDado2);

				System.out.println(
						"O jogador " + jogador.getId() + " est� agora na casa " + jogador.getPosicaoAtual().euSou());

				entrada.nextLine();

				jogador.getPosicaoAtual().executarAcao(jogador);
				System.out.println(jogador.getId() + " " + jogador.getSaldo() + "\n");

				// 
				if(jogador.getSaldo() <= 0) {
					perdeu = jogador;
					break;
				}
				
			}
			jogadores.remove(perdeu);
		}
		
		System.out.println("Parab�ns " + jogadores.get(0).getId() + " voc� ganhou!");
		entrada.close();
	}

}
