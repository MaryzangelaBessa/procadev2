package base;

import java.awt.Color;
import java.awt.Font;

import JGamePlay.GameImage;
import JGamePlay.Mouse;
import JGamePlay.Text;
import casas.Terreno;

public class TerrenoMenu {
	private GameImage menuTerrenoBG;
	private Terreno terreno;
	private Font fontTops;
	private Font fontPrices;
	private Text txtNomeTerreno;
	private Text txtOwner;
	private Text txtPrice;
	private Text txtLandRent;
	private Text txtOneHouseRent;
	private Text txtTwoHouseRent;
	private Text txtTreeHouseRent;
	private Text txtFourHouseRent;
	private Text txtCastleRent;
	private Text txtHousePrice;
	private Text txtCastlePrice;
	private GameImage buyBtn;
	private GameImage buildHouseBtn;
	private GameImage buildCastleBtn;
	private GameImage passBtn;
	private Mouse mouse;
	
	public TerrenoMenu(Terreno terreno) {
		this.terreno = terreno;
		this.menuTerrenoBG = new GameImage(JogoMain.filepath + "assets/land-action-menu.png");
		this.menuTerrenoBG.x = 164;
		this.menuTerrenoBG.y = 76;
		this.setTexts();
		this.buyBtn = new GameImage(JogoMain.filepath + "assets/buy-land-btn.png");
		this.buyBtn.x = 164+371; 
		this.buyBtn.y = 76+422;
		this.passBtn = new GameImage(JogoMain.filepath + "assets/pass-btn.png");
		this.passBtn.x = 164+485; 
		this.passBtn.y = 76+422;
		this.mouse = JogoMain.janela.getMouse();
	}
	
	private void setTexts() {
		int mtx = (int) this.menuTerrenoBG.x;
		int mty = (int) this.menuTerrenoBG.y;
		this.fontTops = new Font("Gothic Pixel", Font.TRUETYPE_FONT, 70);
		this.txtNomeTerreno = new Text("Nome do terreno", mtx + 70, mty + 101); 
		this.txtNomeTerreno.setColor(Color.BLACK);
		this.txtNomeTerreno.setFont(fontTops);
		
		this.txtOwner = new Text("Owner", mtx + 70, mty + 190); 
		this.txtOwner.setColor(Color.RED);
		this.txtOwner.setFont(fontTops);
		
		this.fontPrices = new Font("Gothic Pixel", Font.TRUETYPE_FONT, 35);
		this.txtPrice = new Text("Price 200", mtx + 70, mty + 254); 
		this.txtPrice.setColor(Color.BLACK);
		this.txtPrice.setFont(fontPrices);
		
		this.txtLandRent = new Text("Land Rent 22", mtx + 70, mty + 294); 
		this.txtLandRent.setColor(Color.RED);
		this.txtLandRent.setFont(fontPrices);
		
		this.txtOneHouseRent = new Text("One House Rent 22", mtx + 70, mty + 334); 
		this.txtOneHouseRent.setColor(Color.RED);
		this.txtOneHouseRent.setFont(fontPrices);
		
		this.txtTwoHouseRent = new Text("Two House Rent 22", mtx + 70, mty + 374); 
		this.txtTwoHouseRent.setColor(Color.RED);
		this.txtTwoHouseRent.setFont(fontPrices);
		
		this.txtTreeHouseRent = new Text("Three House Rent 22", mtx + 70, mty + 414); 
		this.txtTreeHouseRent.setColor(Color.RED);
		this.txtTreeHouseRent.setFont(fontPrices);
		
		this.txtFourHouseRent = new Text("Four House Rent 22", mtx + 70, mty + 454); 
		this.txtFourHouseRent.setColor(Color.RED);
		this.txtFourHouseRent.setFont(fontPrices);
		
		this.txtCastleRent = new Text("Castle Rent 22", mtx + 70, mty + 494); 
		this.txtCastleRent.setColor(Color.RED);
		this.txtCastleRent.setFont(fontPrices);
		
		this.txtHousePrice = new Text("House Price 100", mtx + 371, mty + 254); 
		this.txtHousePrice.setColor(Color.BLACK);
		this.txtHousePrice.setFont(fontPrices);
		
		this.txtCastlePrice = new Text("Castle Price 100", mtx + 371, mty + 294); 
		this.txtCastlePrice.setColor(Color.BLACK);
		this.txtCastlePrice.setFont(fontPrices);
		
	}
	
	private void drawTxts() {
		if(this.terreno.isComprado()) {
			this.txtOwner.setText("You is the owner");
		} else {
			this.txtOwner.setText("Iron Bank property");
		}
		this.txtOwner.draw();
		this.txtNomeTerreno.draw();
		this.txtPrice.draw();
		this.txtLandRent.draw();
		this.txtOneHouseRent.draw();
		this.txtTwoHouseRent.draw();
		this.txtTreeHouseRent.draw();
		this.txtFourHouseRent.draw();
		this.txtCastleRent.draw();
		this.txtHousePrice.draw();
		this.txtCastlePrice.draw();
	}
	
	private void drawBtnActions() {
		if(this.terreno.isComprado()) {
			
		} else {
			this.buyBtn.draw();
		}
		this.passBtn.draw();
	}
	
	public void desenharBuy() {
		this.menuTerrenoBG.draw();
		this.drawTxts();
		this.drawBtnActions();
	}
	
	public boolean buyClicked() {
		if(mouse.isOverObject(this.buyBtn) & mouse.isLeftButtonPressed()) {
			return true;
		}
		return false;
	}
	
}
