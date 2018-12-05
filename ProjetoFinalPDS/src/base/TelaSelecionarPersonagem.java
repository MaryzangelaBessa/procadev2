package base;

import java.awt.Font;
import java.util.ArrayList;

import JGamePlay.GameImage;
import JGamePlay.Mouse;
import JGamePlay.Sprite;
import JGamePlay.Text;

public class TelaSelecionarPersonagem {
	private GameImage bgCharacters;
	private ArrayList<Sprite> personagens;
	private ArrayList<GameImage> lugaresPersons;
	private Text txtPlayer;
	private Mouse mouse;
	private Jogador jogador;
	
	public TelaSelecionarPersonagem(ArrayList<Sprite> personagens, Jogador jogador) {
		this.mouse = JogoMain.janela.getMouse();
		this.personagens = personagens;
		this.jogador = jogador;
		this.bgCharacters = new GameImage(JogoMain.filepath + "assets/character-selection.png");
		txtPlayer = new Text("Player " + jogador.getId(), 403, 332);
		txtPlayer.setFont(new Font("Gothic Pixel", Font.TRUETYPE_FONT, 70));
		this.setBackcground();
		this.setLugarPersonagem(JogoMain.personagens.size());
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
		this.txtPlayer.draw();
	}
	
	public boolean obterPersonagem() {
		for (int i = 0; i < this.personagens.size(); i++) {
			if(mouse.isOverObject(this.personagens.get(i)) && mouse.isLeftButtonPressed()){
				Sprite personagem = this.personagens.get(i);
				this.jogador.setPersonagem(personagem);
				this.personagens.remove(this.personagens.get(i));
				return true;
			}
		}
		return false;
	}
	
	
	
}
