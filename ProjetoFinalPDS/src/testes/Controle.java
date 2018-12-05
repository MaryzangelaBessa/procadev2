package testes;

import java.util.ArrayList;
import java.util.Scanner;

import base.Dado;
import base.Jogador;
import cartoes.Cartao;
import cartoes.ConstrutorCartoes;
import cartoes.IteradorCartoes;
import casas.CasaTabuleiro;
import casas.ConstrutorCasas;
import casas.PontoPartida;
import iterador.IteradorCasa;
import tabuleiro.Tabuleiro;

public class Controle {
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

		System.out.println("Quantas pessoas vão jogar?");
		qtd_jogadores = entrada.nextInt();
		entrada.nextLine();

		for (int i = 1; i <= qtd_jogadores; i++) {
			System.out.println("Qual é o nome do " + i + "º jogador?");
			int n = entrada.nextInt();
			jogadores.add(new Jogador(n));
		}

		ic.inicializar((PontoPartida) casas.get(0), jogadores);

		while (jogar) {
			for (Jogador jogador : jogadores) {
				valorDado1 = d.jogarDado();
				valorDado2 = d.jogarDado();
				
				
				
				
				
				
			}
		}

	}
}
