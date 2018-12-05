package base;

import java.util.ArrayList;

import JGamePlay.GameImage;
import JGamePlay.Sprite;

public class TelaSelecionarPersonagem {
	private GameImage bgCharacters;
	private ArrayList<Sprite> personagens;
	private ArrayList<GameImage> lugaresPersons;
	
	public TelaSelecionarPersonagem(ArrayList<Sprite> personagens, Jogador jogador) {
		this.personagens = personagens;
		this.bgCharacters = new GameImage(JogoMain.filepath + "assets/character-selection.png");
		this.setBackcground();
		this.setLugarPersonagem(this.personagens.size());
		this.setPersonagemPadding();
	}
	
	private void setBackcground() {
		this.bgCharacters.x = 0;
		this.bgCharacters.y = 0;
	}
	
	private void setLugarPersonagem(int n) {
		this.lugaresPersons = new ArrayList<>();
		int inix = 0;
		int iniy = 539;
		for (int i = 0; i < n; i++) {
			GameImage novoLugar = new GameImage(JogoMain.filepath + "assets/character-space.png");
			novoLugar.setDimension(87, 87);
			this.lugaresPersons.add(novoLugar);
		}
		if(n == 6) {
			inix = 179;
		}else if(n == 5) {
			inix = 234;
		}else if(n == 4) {
			inix = 288;
		}else if(n == 3) {
			inix = 343;
		}else { // n == 2
			inix = 398;
		}
		for (int i = 0; i < n; i++) {
			GameImage lugar = this.lugaresPersons.get(i);
			lugar.x = inix;
			lugar.y = iniy;
			inix = inix + lugar.width + 22;
		}
		
	}
	
	private void setPersonagemPadding() {
		int padding = 28;
		for (int i = 0; i < this.lugaresPersons.size(); i++) {
			GameImage lugar = this.lugaresPersons.get(i);
			Sprite personagem = this.personagens.get(i);
			personagem.x = lugar.x + padding;
			personagem.y = lugar.y + padding;
		}
	}
	
	
	public void desenharTela() {
		this.bgCharacters.draw();
		for (int i = 0; i < this.lugaresPersons.size(); i++) {
			this.lugaresPersons.get(i).draw();
			this.personagens.get(i).draw();
		}
	}
	
}
