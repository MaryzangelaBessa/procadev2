package casas;

import java.util.ArrayList;

import JGamePlay.GameImage;
import util.Posicao;

public class FabricaCasas {
		private static FabricaCasas fabricaCasas = new FabricaCasas(); 
	
		private FabricaCasas() {
			
		}
		
		public static FabricaCasas getInstance() {
			return fabricaCasas;
		}
	
		public CasaTabuleiro construirCasa(String tipo, GameImage imagem, Posicao posicao, 
			                            ArrayList<Posicao> lugaresJogadores) {
		CasaTabuleiro casa = null;
		
		switch (tipo) {
		case "PontoPartida":
			casa = new PontoPartida(imagem, posicao, lugaresJogadores);
			break;
		case "Terreno":
			casa = new Terreno(imagem, posicao, lugaresJogadores);
			break;
		case "SorteReves":
			casa = new SorteReves(imagem, posicao, lugaresJogadores);
			break;
		case "Compania":
			casa = new Compania(imagem, posicao, lugaresJogadores);
			break;
		case "Prisao":
			casa = new Prisao(imagem, posicao, lugaresJogadores);
			break;
		case "LucrosDividendos":
			casa = new LucrosDividendos(imagem, posicao, lugaresJogadores);
			break;
		case "ParadaLivre":
			casa = new ParadaLivre(imagem, posicao, lugaresJogadores);
			break;
		case "ImpostoRenda":
			casa = new ImpostoRenda(imagem, posicao, lugaresJogadores);
			break;
		case "VaPrisao":
			casa = new VaPrisao(imagem, posicao, lugaresJogadores);
			break;
		default:
			break;
		}
		
		return casa;
	}
}
