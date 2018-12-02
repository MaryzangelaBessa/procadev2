package telas;

import java.util.ArrayList;
import java.util.Scanner;
import base.Jogador;

public class Main {

	public static void main(String[] args) {
		int qtd_jogadores = 0;
		boolean rodar = true;
		ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
		Scanner entrada = new Scanner(System.in);
		qtd_jogadores = entrada.nextInt();
		entrada.nextLine();
		
		for (int i = 1; i <= qtd_jogadores; i++) {			
			System.out.println("Digite o nome do " + i + "º jogador");
			String nome = entrada.nextLine();
			jogadores.add(new Jogador(nome, null));
		}
		System.out.println(jogadores);
		
		
		
		/*
		 * pega os jogadores
		 * 
		 * while rodar == true for cada jogador joga os dados vai para a casa
		 * correspondente casa realiza açao
		 */

	}

}
