package cartoes;
public class FabricaCartoes{
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
