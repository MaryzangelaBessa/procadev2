package testes;

import java.util.ArrayList;

import base.Jogador;
import casas.*;
import iterador.IteradorCasa;

public class Teste {
	public static void main(String[] args) {
		ConstrutorCasas cc = new ConstrutorCasas();
		ArrayList<CasaTabuleiro> casas = cc.construirCasas();
		Jogador j = new Jogador("AAA", casas.get(0));
		IteradorCasa IC = new IteradorCasa(casas, j);
		IC.andar(43);
		System.out.println(	IC.getJogador().getPosicaoAtual().euSou());
	}
}
