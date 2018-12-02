package casas;

public class FabricaCasas {
	public CasaTabuleiro construirCasas(String tipo) {
		CasaTabuleiro casa = null;
		
		switch (tipo) {
		case "PontoPartida":
			casa = new PontoPartida();
			break;
		case "Terreno":
			casa = new Terreno();
			break;
		case "SorteReves":
			casa = new SorteReves();
			break;
		case "Compania":
			casa = new Compania();
			break;
		case "Prisao":
			casa = new Prisao();
			break;
		case "LucrosDividendos":
			casa = new LucrosDividendos();
			break;
		case "ParadaLivre":
			casa = new ParadaLivre();
			break;
		case "ImpostoRenda":
			casa = new ImpostoRenda();
			break;
		case "VaPrisao":
			casa = new VaPrisao();
			break;
			
		default:
			break;
		}
		
		return casa;
	}
}
