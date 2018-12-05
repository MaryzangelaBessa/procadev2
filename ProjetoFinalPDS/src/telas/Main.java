package telas;

public class Main {

	public static ControladorJogo controladorJogo = ControladorJogo.getInstance();
	
	public static void main(String[] args) {
		controladorJogo.criarCasas();
		controladorJogo.criarPersonagens();
		controladorJogo.selecionarJogadores();
		controladorJogo.selecionarPesonagem();
		controladorJogo.iniciarJogo();
	}
}
