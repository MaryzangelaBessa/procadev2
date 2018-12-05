package testes;

import java.util.ArrayList;
import java.util.Scanner;
import casas.*;
import iterador.IteradorCasa;
import base.Dado;
import base.Jogador;

public class Jogadas {
	public void linhaPrincipal(Jogador jogador, ArrayList<CasaTabuleiro> casas, IteradorCasa ic, int valorDado1,
			int valorDado2) {
		if (jogador.getDuplasSeguidas() == 3) {
			jogador.setEstaPreso(true); 
			System.out.println("O jogador " + jogador.getId() + " deve ser preso");
			return;
		}

		Scanner entrada = new Scanner(System.in);
		entrada.nextLine();

		System.out.println(jogador.getId() + " jogou o dado e saiu " + valorDado1);
		System.out.println(jogador.getId() + " jogou o dado novamente e saiu " + valorDado2);
		entrada.nextLine();

		ic.andar(jogador, casas, valorDado1 + valorDado2);

		System.out.println(
				"O jogador " + jogador.getId() + " está agora na " + "casa " + jogador.getPosicaoAtual().euSou());
		entrada.nextLine();

		jogador.getPosicaoAtual().executarAcao(jogador);
		System.out.println(jogador.getId() + " " + jogador.getSaldo() + "\n");

		if (valorDado1 == valorDado2) {
			int duplas = jogador.getDuplasSeguidas();
			duplas++;
			jogador.setDuplasSeguidas(duplas);
			this.linhaPrincipal(jogador, casas, ic, valorDado1, valorDado2);
		}
	}

	public void linhaPreso(Jogador jogador, int valorDado1, int valorDado2) {

		if (jogador.getRodadasPreso() >= 3) {
			jogador.setSaldo(jogador.getSaldo() - 50);

			jogador.setEstaPreso(false);

		} else if (valorDado1 == valorDado2) {
			jogador.setEstaPreso(false);
		}

		
		

	}

	public void falir(ArrayList<Jogador> jogadores, Jogador j) {
		// antes de tudo transferir suas coisas para o banco
		for (Jogador jogador : jogadores) {
			if (jogador == j)
				jogadores.remove(j);
		}
	}

}
