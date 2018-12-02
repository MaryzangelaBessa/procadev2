package cartoes;

public class FabricaCartoes {
	public Cartoes criarCartao(String tipo, String desc) {
		Cartoes cartao = null;
		switch (tipo) {
		case "Sorte":
			cartao = new CartoesSorte(desc);
			break;
		case "Reves":
			cartao = new CartoesReves(desc);
			break;
		default:
			break;
		}
		return cartao;
	}
}
