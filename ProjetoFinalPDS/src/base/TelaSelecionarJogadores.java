package base;

import JGamePlay.GameImage;
import JGamePlay.Mouse;

public class TelaSelecionarJogadores {

	private GameImage bgSelectPlayers;
	private GameImage p2;
	private GameImage p3;
	private GameImage p4;
	private GameImage p5;
	private GameImage p6;
	private Mouse mouse = JogoMain.janela.getMouse();
	
	public TelaSelecionarJogadores() {
		this.bgSelectPlayers = new GameImage(JogoMain.filepath + "assets/select-players.png");
		this.p2 = new GameImage(JogoMain.filepath + "assets/2p.png");
		this.p3 = new GameImage(JogoMain.filepath + "assets/3p.png");
		this.p4 = new GameImage(JogoMain.filepath + "assets/4p.png");
		this.p5 = new GameImage(JogoMain.filepath + "assets/5p.png");
		this.p6 = new GameImage(JogoMain.filepath + "assets/6p.png");
		this.setBackground();
		this.setComponents(237, 487);
	
	}
	
	public void desenharTela() {
		this.bgSelectPlayers.draw();
		this.p2.draw();
		this.p3.draw();
		this.p4.draw();
		this.p5.draw();
		this.p6.draw();
	}
	
	private void setBackground() {
		this.bgSelectPlayers.x = 0;
		this.bgSelectPlayers.y = 0;
	}
	
	private void setComponents(int x, int y) {
		int space = 22;
		int size = 87;
		
		this.p2.setDimension(size, size);
		this.p3.setDimension(size, size);
		this.p4.setDimension(size, size);
		this.p5.setDimension(size, size);
		this.p6.setDimension(size, size);
		
		this.p2.x = x;
		this.p2.y = y;
		this.p3.x = this.p2.x + this.p2.width + space;
		this.p3.y = this.p2.y;
		this.p4.x = this.p3.x + this.p3.width + space;
		this.p4.y = this.p2.y;
		this.p5.x = this.p4.x + this.p4.width + space;
		this.p5.y = this.p2.y;
		this.p6.x = this.p5.x + this.p5.width + space;
		this.p6.y = this.p2.y;
	}
	
	public int obterEscolha() {
		if(mouse.isOverObject(p2) && mouse.isLeftButtonPressed()){
			return 2;
		}
		if(mouse.isOverObject(p3) && mouse.isLeftButtonPressed()){
			return 3;
		}
		if(mouse.isOverObject(p4) && mouse.isLeftButtonPressed()){
			return 4;
		}
		if(mouse.isOverObject(p5) && mouse.isLeftButtonPressed()){
			return 5;
		}
		if(mouse.isOverObject(p6) && mouse.isLeftButtonPressed()){
			return 6;
		}
		return 0;
	}
	
}
