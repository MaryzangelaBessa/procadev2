package telas;

import java.awt.Color;
import java.awt.Font;

import JGamePlay.GameImage;
import JGamePlay.Mouse;
import JGamePlay.Text;
import casas.Compania;

public class CompaniaMenu {
	private GameImage menuCompaniaBG;
	private Compania compania;
	private Font fontTops;
	private Font fontPrices;
	private Text txtNomeCompania;
	private Text txtOwner;
	private Text txtTaxa;
	private Text txtPrice;
	private GameImage buyBtn;
	private GameImage passBtn;
	private Mouse mouse;
	
	public CompaniaMenu(Compania compania) {
		this.compania = compania;
		this.menuCompaniaBG = new GameImage(ControladorJogo.filepath + "assets/land-action-menu.png");
		this.menuCompaniaBG.x = 164;
		this.menuCompaniaBG.y = 76;
		this.setTexts();
		this.buyBtn = new GameImage(ControladorJogo.filepath + "assets/buy-land-btn.png");
		this.buyBtn.setDimension(98, 70);
		this.buyBtn.x = 164+371; 
		this.buyBtn.y = 76+422;
		this.passBtn = new GameImage(ControladorJogo.filepath + "assets/pass-btn.png");
		this.passBtn.setDimension(118, 70);
		this.passBtn.x = 164+485; 
		this.passBtn.y = 76+422;
		this.mouse = ControladorJogo.janela.getMouse();
	}
	
	private void setTexts() {
		int mtx = (int) this.menuCompaniaBG.x;
		int mty = (int) this.menuCompaniaBG.y;
		this.fontTops = new Font("Gothic Pixel", Font.TRUETYPE_FONT, 70);
		this.txtNomeCompania = new Text(compania.getNome(), mtx + 70, mty + 101); 
		this.txtNomeCompania.setColor(Color.BLACK);
		this.txtNomeCompania.setFont(fontTops);
		
		this.txtOwner = new Text("Owner", mtx + 70, mty + 190); 
		this.txtOwner.setColor(Color.RED);
		this.txtOwner.setFont(fontTops);
		
		this.fontPrices = new Font("Gothic Pixel", Font.TRUETYPE_FONT, 35);
		this.txtPrice = new Text("Price " + compania.getPrecoCompania(), mtx + 70, mty + 254); 
		this.txtPrice.setColor(Color.BLACK);
		this.txtPrice.setFont(fontPrices);
		
		this.txtTaxa = new Text("Tax " + compania.getTaxa(), mtx + 70, mty + 294); 
		this.txtTaxa.setColor(Color.BLACK);
		this.txtTaxa.setFont(fontPrices);
		
	}
	
	private void drawTxts() {
		this.txtOwner.setText("Iron Bank Property");
		this.txtOwner.draw();
		this.txtTaxa.draw();
		this.txtNomeCompania.draw();
		this.txtPrice.draw();
	}
	
	private void drawBtnActions() {
		if(this.compania.isComprado()) {
			
		} else {
			this.buyBtn.draw();
		}
		this.passBtn.draw();
	}
	
	public void desenharBuy() {
		this.menuCompaniaBG.draw();
		this.drawTxts();
		this.drawBtnActions();
	}
	
	public int obterEscolha() {
		if(this.mouse.isOverObject(this.buyBtn) && this.mouse.isLeftButtonPressed()) {
			return 1;
		}
		if(this.mouse.isOverObject(this.passBtn) && this.mouse.isLeftButtonPressed()) {
			return 2;
		}
		return 0;
	}
	
}
