public class Executor {
	public static void main(String[] args) {
		Jogador j1 = new Jogador("Leandro Beserra", 1200, null);
		Casa c1 = new Propriedade(j1, 0, new float[] {50,100,150,250,500});
		System.out.println(c1.toString());
		c1.calcularAluguel();
	}
}
