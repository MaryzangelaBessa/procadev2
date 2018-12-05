package telas;

import java.awt.Font;

import JGamePlay.GameImage;
import JGamePlay.Mouse;
import JGamePlay.Sprite;
import JGamePlay.Text;
import atores.Dado;
import atores.Jogador;

public class MenuDado {
	private GameImage bgDado;
	private Sprite dado1;
	private Sprite dado2;
	private Text txtPlayer;
	private GameImage btnThrowDice;
	private Mouse mouse = ControladorJogo.janela.getMouse();
	private Dado dado;
	
	public MenuDado(Jogador jogador) {
		this.bgDado = new GameImage(ControladorJogo.filepath + "assets/dice-menu.png");
		this.bgDado.setDimension(672, 296);
		this.bgDado.x = 164;
		this.bgDado.y = 202;
		int tx = (int) this.bgDado.x + 137;
		int ty = (int) this.bgDado.y + 123;
		this.txtPlayer = new Text("Player " + jogador.getId() + " turn", tx, ty);
		this.txtPlayer.setFont(new Font("Gothic Pixel", Font.TRUETYPE_FONT, 60));
		this.setDados();
		this.btnThrowDice = new GameImage(ControladorJogo.filepath + "assets/dice-button.png");
		this.btnThrowDice.setDimension(254, 70);
		this.btnThrowDice.x = (int) this.bgDado.x + 314;
		this.btnThrowDice.y = (int) this.bgDado.y + 174;
		this.dado = new Dado();

	}
	
	public void desenhar() {
		this.bgDado.draw();
		this.txtPlayer.draw();
		this.dado1.draw();
		this.dado2.draw();
		this.btnThrowDice.draw();
	}
	
	public void esconder() {
		this.bgDado.draw();
		this.txtPlayer.draw();
		this.dado1.hide();
		this.dado2.hide();
		this.btnThrowDice.draw();
	}
	
	public int lancarDados() {
		if(mouse.isOverObject(btnThrowDice) & mouse.isLeftButtonPressed()) {
			int d1 = this.dado.jogarDado();
			int d2 = this.dado.jogarDado();
			dado1.runAnimation();
			dado2.runAnimation();
			dado1.setCurrFrame(d1-1);
			dado2.setCurrFrame(d2-1); 
			dado1.draw();
			dado2.draw();
			return d1 + d2;
		}
		return 0;
	}
	
	private void setDados() {
		this.dado1 = new Sprite(ControladorJogo.filepath + "assets/dice.png", 6);
		this.dado1.setDimension(70, 70);
		this.dado1.setCurrFrame(0);
		this.dado1.setTimeChangeFrame(125);
		this.dado2 = new Sprite(ControladorJogo.filepath + "assets/dice.png", 6);
		this.dado2.setDimension(70, 70);
		this.dado2.setCurrFrame(0);
		this.dado2.setTimeChangeFrame(125);
		this.dado1.x = this.bgDado.x + 104;
		this.dado1.y = this.bgDado.y + 174;
		this.dado2.x = this.bgDado.x + 209;
		this.dado2.y = this.bgDado.y + 174;
	}
	
}
