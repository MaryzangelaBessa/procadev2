package cartoes;
import interfaces.Fabrica;
public class FabricaCartoes implements Fabrica {
	private Cartao cartao;
	public Cartao criarCartao(String tipo, String desc) {
		
		switch (tipo) {
		case "Sorte":
			cartao = new CartaoSorte(desc);
			break;
		case "Reves":
			cartao = new CartaoReves(desc);
			break;
		default:
			break;
		}
		return this.cartao;
	}
}
