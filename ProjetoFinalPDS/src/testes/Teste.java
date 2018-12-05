package testes;

import java.util.ArrayList;
import java.util.Scanner;

import base.Jogador;
import cartoes.Cartao;
import cartoes.ConstrutorCartoes;
import cartoes.IteradorCartoes;
import casas.*;
import iterador.IteradorCasa;

public class Teste {
	public static void main(String[] args) {
		ConstrutorCasas cc = new ConstrutorCasas();
		ConstrutorCartoes conscart = new ConstrutorCartoes();
		ArrayList<CasaTabuleiro> casas = cc.construirCasas();
		Jogador j = new Jogador("AAA", casas.get(0));
		IteradorCasa IC = IteradorCasa.getInstance();
		IC.setCasas(casas);
		ArrayList<Cartao> cartoes = conscart.construirCartoes();
		IteradorCartoes icar = IteradorCartoes.getInstance();
		icar.setCartoes(cartoes);

		Scanner entrada = new Scanner(System.in);

		// int casa = entrada.nextInt();
		while (true) {
			//IC.andar(j, casas, 2);
			//j.getPosicaoAtual().executarAcao(j);
			casas.get(30).executarAcao(j);
			System.out.println(j.getNome() + " " + j.getSaldo());
			entrada.nextLine();
		}
	}
}
