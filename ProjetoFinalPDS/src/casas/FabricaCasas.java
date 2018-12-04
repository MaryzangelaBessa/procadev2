package casas;

import util.Posicao;

public class FabricaCasas {
		private static FabricaCasas fabricaCasas = new FabricaCasas(); 
	
		private FabricaCasas() {
			
		}
		
		public static FabricaCasas getInstance() {
			return fabricaCasas;
		}
	
		public CasaTabuleiro construirCasa(String tipo, Posicao posicao) {
		CasaTabuleiro casa = null;
		
		switch (tipo) {
		case "PontoPartida":
			casa = new PontoPartida(posicao);
			break;
		case "Terreno":
			casa = new Terreno(posicao);
			break;
		case "SorteReves":
			casa = new SorteReves(posicao);
			break;
		case "Compania":
			casa = new Compania(posicao);
			break;
		case "Prisao":
			casa = new Prisao(posicao);
			break;
		case "LucrosDividendos":
			casa = new LucrosDividendos(posicao);
			break;
		case "ParadaLivre":
			casa = new ParadaLivre(posicao);
			break;
		case "ImpostoRenda":
			casa = new ImpostoRenda(posicao);
			break;
		case "VaPrisao":
			casa = new VaPrisao(posicao);
			break;
		default:
			break;
		}
		
		return casa;
	}
}
