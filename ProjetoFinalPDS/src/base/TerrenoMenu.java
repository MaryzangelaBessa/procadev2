package base;

import java.awt.Color;
import java.awt.Font;

import JGamePlay.GameImage;
import JGamePlay.Text;
import casas.Terreno;

public class TerrenoMenu {
	private GameImage menuTerrenoBG;
	private Terreno terreno;
	private Font fontTops;
	private Text txtNomeTerreno;
	private Text txtOwner;
	
	public TerrenoMenu(Terreno terreno) {
		this.terreno = terreno;
		this.menuTerrenoBG = new GameImage(JogoMain.filepath + "assets/land-action-menu.png");
		this.menuTerrenoBG.x = 164;
		this.menuTerrenoBG.y = 76;
		this.setTexts();
		
	}
	
	private void setTexts() {
		this.fontTops = new Font("Gothic Pixel", Font.TRUETYPE_FONT, 70);
		this.txtNomeTerreno = new Text("Nome do terreno", 164 + 70, 76 + 101); 
		this.txtNomeTerreno.setColor(Color.BLACK);
		this.txtNomeTerreno.setFont(fontTops);
		
		this.txtOwner = new Text("Owner", 164 + 70, 76 + 190); 
		this.txtNomeTerreno.setColor(Color.RED);
		this.txtNomeTerreno.setFont(fontTops);
	}
	
	private void drawTxts() {
		if(this.terreno.isComprado()) {
			txtOwner.setText("Owner: You");
		} else {
			txtOwner.setText("Owner: Iron Bank");
		}
		this.txtNomeTerreno.draw();
	}
	
	public void desenharBuy() {
		this.menuTerrenoBG.draw();
		this.drawTxts();
		
	}
	
}
