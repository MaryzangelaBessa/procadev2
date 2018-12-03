package testes;

import cartoes.Cartao;
import cartoes.FabricaCartoes;

public class Main {

	public static void main(String[] args) {
		FabricaCartoes f = new FabricaCartoes();
		Cartao c = f.criarCartao("Sorte", "  ");
	}

}
