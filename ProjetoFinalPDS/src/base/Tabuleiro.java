package base;
import java.util.ArrayList;
import java.util.Arrays;

import JGamePlay.GameImage;
import casas.*;
import util.Posicao;
import cartoes.*;
public class Tabuleiro {
	private static Tabuleiro tabuleiro = new Tabuleiro();
	private String filepath;
	private GameImage background;
	
//<<<<<<< HEAD
	
//=======
	private ArrayList<CasaTabuleiro> casas;
	private ArrayList<Cartao> cartoes;
	
	private FabricaCasas fabricaCasas;
//>>>>>>> branch 'master' of https://github.com/MaryzangelaBessa/procadev2.git
	
	private Tabuleiro() {
		this.filepath = JogoMain.filepath;
		background = new GameImage(filepath + "assets/background.png");
		casas = new ArrayList<CasaTabuleiro>();
		cartoes = new ArrayList<Cartao>();
		background.x = 0;
		background.y = 0;
		fabricaCasas = FabricaCasas.getInstance();
	}
	
	public static Tabuleiro getInstance() {
		return tabuleiro;
	}
	
	public void mostraTabuleiro() {
		background.draw();
	}
	
	public void criarCasas() {
		int tabuleiroWidth = JogoMain.janela.getWidth(); 
		int vypadding = 12;
		
		// Casas da primeira linha
		int l1xpadding = 10;
		
		Posicao twPos = new Posicao(0, 0); 
		PontoPartida wall = (PontoPartida) fabricaCasas.construirCasa("PontoPartida", twPos);
		casas.add(wall);
		
		Posicao cbPos = new Posicao(twPos.x+wall.getImagem().width+l1xpadding, vypadding); 
		Terreno castleBlack = (Terreno) fabricaCasas.construirCasa("Terreno", cbPos);
		casas.add(castleBlack);
		
		Posicao pSR1 = new Posicao(cbPos.x+castleBlack.getImagem().width+l1xpadding, vypadding); 
		SorteReves sr1 = (SorteReves) fabricaCasas.construirCasa("SorteReves", pSR1);
		casas.add(sr1);
		
		Posicao wiPos = new Posicao(pSR1.x+sr1.getImagem().width+l1xpadding, vypadding); 
		Terreno winterfell = (Terreno) fabricaCasas.construirCasa("Terreno", wiPos);
		casas.add(winterfell);
		
		Posicao boPos = new Posicao(wiPos.x+winterfell.getImagem().width+l1xpadding, vypadding); 
		Terreno bolton = (Terreno) fabricaCasas.construirCasa("Terreno", boPos);
		casas.add(bolton);
		
		Posicao co1Pos = new Posicao(boPos.x+bolton.getImagem().width+l1xpadding, vypadding);
		Compania comp1 = (Compania) fabricaCasas.construirCasa("Compania", co1Pos);
		casas.add(comp1);
		
		Posicao haPos = new Posicao(co1Pos.x+comp1.getImagem().width+l1xpadding, vypadding); 
		Terreno hammer = (Terreno) fabricaCasas.construirCasa("Terreno", haPos);
		casas.add(hammer);
		
		Posicao co2Pos = new Posicao(haPos.x+hammer.getImagem().width+l1xpadding, vypadding);
		Compania comp2 = (Compania) fabricaCasas.construirCasa("Compania", co2Pos);
		casas.add(comp2);
		
		Posicao pikePos = new Posicao(co2Pos.x+comp2.getImagem().width+l1xpadding, vypadding); 
		Terreno pike = (Terreno) fabricaCasas.construirCasa("Terreno", pikePos);
		casas.add(pike);
		
		// Casas da segunda linha
		double l2xpadding = 9.5;
		
		Posicao ttPos = new Posicao(tabuleiroWidth-l2xpadding, pike.getImagem().y+pike.getImagem().height+vypadding); 
		Terreno tenTowers = (Terreno) fabricaCasas.construirCasa("Terreno", ttPos);
		ttPos = tenTowers.getPosicao();
		ttPos.x = ttPos.x - tenTowers.getImagem().width;
		tenTowers.setPosicao(ttPos);
		casas.add(tenTowers);
		
		Posicao duPos = new Posicao(ttPos.x-l2xpadding, ttPos.y);
		Prisao dungeon = (Prisao) fabricaCasas.construirCasa("Prisao", duPos);
		duPos = dungeon.getPosicao();
		duPos.x = duPos.x - tenTowers.getImagem().width;
		dungeon.setPosicao(duPos);
		casas.add(dungeon);
		
		Posicao ssPos = new Posicao(duPos.x-l2xpadding, ttPos.y); 
		Terreno strongSong = (Terreno) fabricaCasas.construirCasa("Terreno", ssPos);
		ssPos = strongSong.getPosicao();
		ssPos.x = ssPos.x - strongSong.getImagem().width;
		strongSong.setPosicao(ssPos);
		casas.add(strongSong);
		
		Posicao pSR2 = new Posicao(ssPos.x-l2xpadding, ttPos.y); 
		SorteReves sr2 = (SorteReves) fabricaCasas.construirCasa("SorteReves", pSR2);
		pSR2 = sr2.getPosicao();
		pSR2.x = pSR2.x - sr2.getImagem().width;
		sr2.setPosicao(pSR2);
		casas.add(sr2);
		
		Posicao tePos = new Posicao(pSR2.x-l2xpadding, ttPos.y); 
		Terreno theEyre = (Terreno) fabricaCasas.construirCasa("Terreno", tePos);
		tePos = theEyre.getPosicao();
		tePos.x = tePos.x - theEyre.getImagem().width;
		theEyre.setPosicao(tePos);
		casas.add(theEyre);
		
		Posicao rfPos = new Posicao(tePos.x-l2xpadding, ttPos.y); 
		Terreno redFort = (Terreno) fabricaCasas.construirCasa("Terreno", rfPos);
		rfPos = redFort.getPosicao();
		rfPos.x = rfPos.x - redFort.getImagem().width;
		redFort.setPosicao(rfPos);
		casas.add(redFort);
		
		Posicao co3Pos = new Posicao(rfPos.x-l2xpadding, ttPos.y);
		Compania comp3 = (Compania) fabricaCasas.construirCasa("Compania", co3Pos);
		co3Pos = comp3.getPosicao();
		co3Pos.x = co3Pos.x - comp3.getImagem().width;
		comp3.setPosicao(co3Pos);
		casas.add(comp3);
		
		Posicao pSR3 = new Posicao(co3Pos.x-l2xpadding, ttPos.y); 
		SorteReves sr3 = (SorteReves) fabricaCasas.construirCasa("SorteReves", pSR3);
		pSR3 = sr3.getPosicao();
		pSR3.x = pSR3.x - sr3.getImagem().width;
		sr3.setPosicao(pSR3);
		casas.add(sr3);
		
		Posicao crPos = new Posicao(pSR3.x-l2xpadding, ttPos.y); 
		Terreno casterlyRock = (Terreno) fabricaCasas.construirCasa("Terreno", crPos);
		crPos = casterlyRock.getPosicao();
		crPos.x = crPos.x - casterlyRock.getImagem().width;
		casterlyRock.setPosicao(crPos);
		casas.add(casterlyRock);
		
		// Casas da terceira linha
		double l3xpadding = 17.875;
		
		Posicao ldPos = new Posicao(l3xpadding, crPos.y+casterlyRock.getImagem().height+vypadding);
		LucrosDividendos profits = (LucrosDividendos) fabricaCasas.construirCasa("LucrosDividendos", ldPos);
		casas.add(profits);
		
		Posicao hvPos = new Posicao(ldPos.x+profits.getImagem().width+l3xpadding, ldPos.y);
		Terreno hornVale = (Terreno) fabricaCasas.construirCasa("Terreno", hvPos);
		casas.add(hornVale);
		
		Posicao fsPos = new Posicao(hvPos.x+hornVale.getImagem().width+l3xpadding, ldPos.y);
		ParadaLivre freeStop = (ParadaLivre) fabricaCasas.construirCasa("ParadaLivre", fsPos);
		casas.add(freeStop);
		
		Posicao ddPos = new Posicao(fsPos.x+freeStop.getImagem().width+(2*l3xpadding)+283, ldPos.y);
		Terreno deepDen = (Terreno) fabricaCasas.construirCasa("Terreno", ddPos);
		casas.add(deepDen);
	}
	
	public void desenharCasas() {
		for (CasaTabuleiro casa : casas) {
			casa.desenhar();
		}
	}
	
	public ArrayList<CasaTabuleiro> getCasas() {
		return casas;
	}
	public void setCasas(ArrayList<CasaTabuleiro> casas) {
		this.casas = casas;
	}
	public ArrayList<Cartao> getCartoes() {
		return cartoes;
	}
	public void setCartoes(ArrayList<Cartao> cartoes) {
		this.cartoes = cartoes;
	}
	
	
	
}
