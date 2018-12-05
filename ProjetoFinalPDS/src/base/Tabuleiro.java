package base;
import java.util.ArrayList;

import JGamePlay.GameImage;
import casas.*;
import util.Posicao;
import cartoes.*;
public class Tabuleiro {
	private static Tabuleiro tabuleiro = new Tabuleiro();
	private String filepath;
	private GameImage background;
	
	private ArrayList<CasaTabuleiro> casas;
	private ArrayList<Cartao> cartoes;
	private ArrayList<Jogador> jogadores;
	
	private FabricaCasas fabricaCasas;
	
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
		
		Posicao ttPos = new Posicao(tabuleiroWidth-l2xpadding, pikePos.y+pike.getImagem().height+vypadding); 
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
		
		Posicao dsPos = new Posicao(pSR3.x-l2xpadding, ttPos.y); 
		Terreno dragonStone = (Terreno) fabricaCasas.construirCasa("Terreno", dsPos);
		dsPos = dragonStone.getPosicao();
		dsPos.x = dsPos.x - dragonStone.getImagem().width;
		dragonStone.setPosicao(dsPos);
		casas.add(dragonStone);
		
		// Casas da terceira linha
		double l3xpadding = 17.875;
		
		Posicao ldPos = new Posicao(l3xpadding, dsPos.y+dragonStone.getImagem().height+vypadding);
		LucrosDividendos profits = (LucrosDividendos) fabricaCasas.construirCasa("LucrosDividendos", ldPos);
		casas.add(profits);
		
		Posicao rrPos = new Posicao(ldPos.x+profits.getImagem().width+l3xpadding, ldPos.y);
		Terreno rooksRest = (Terreno) fabricaCasas.construirCasa("Terreno", rrPos);
		casas.add(rooksRest);
		
		Posicao fsPos = new Posicao(rrPos.x+rooksRest.getImagem().width+l3xpadding, ldPos.y);
		ParadaLivre freeStop = (ParadaLivre) fabricaCasas.construirCasa("ParadaLivre", fsPos);
		casas.add(freeStop);
		
		Posicao crPos = new Posicao(fsPos.x+freeStop.getImagem().width+(2*l3xpadding)+283, ldPos.y);
		Terreno casterlyRock = (Terreno) fabricaCasas.construirCasa("Terreno", crPos);
		casas.add(casterlyRock);
		
		Posicao pSR4 = new Posicao(crPos.x+casterlyRock.getImagem().width+l3xpadding, ldPos.y); 
		SorteReves sr4 = (SorteReves) fabricaCasas.construirCasa("SorteReves", pSR4);
		casas.add(sr4);
		
		Posicao hvPos = new Posicao(pSR4.x+sr4.getImagem().width+l3xpadding, ldPos.y);
		Terreno hornVale = (Terreno) fabricaCasas.construirCasa("Terreno", hvPos);
		casas.add(hornVale);
		
		// Casas da quarta linha
		double l4xpadding = 14.888;
		
		Posicao ntPos = new Posicao(tabuleiroWidth-l4xpadding, hvPos.y+hornVale.getImagem().height+vypadding); 
		ImpostoRenda notToday = (ImpostoRenda) fabricaCasas.construirCasa("ImpostoRenda", ntPos);
		ntPos = notToday.getPosicao();
		ntPos.x = ntPos.x - notToday.getImagem().width;
		notToday.setPosicao(ntPos);
		casas.add(notToday);
		
		Posicao co4Pos = new Posicao(ntPos.x-l4xpadding, ntPos.y);
		Compania comp4 = (Compania) fabricaCasas.construirCasa("Compania", co4Pos);
		co4Pos = comp4.getPosicao();
		co4Pos.x = co4Pos.x - comp4.getImagem().width;
		comp4.setPosicao(co4Pos);
		casas.add(comp4);
		
		Posicao shPos = new Posicao(co4Pos.x-l4xpadding, ntPos.y); 
		Terreno sowsHorn = (Terreno) fabricaCasas.construirCasa("Terreno", shPos);
		shPos = sowsHorn.getPosicao();
		shPos.x = shPos.x - sowsHorn.getImagem().width;
		sowsHorn.setPosicao(shPos);
		casas.add(sowsHorn);
		
		Posicao pSR5 = new Posicao(shPos.x-l4xpadding, ntPos.y); 
		SorteReves sr5 = (SorteReves) fabricaCasas.construirCasa("SorteReves", pSR5);
		pSR5 = sr5.getPosicao();
		pSR5.x = pSR5.x - sr5.getImagem().width;
		sr5.setPosicao(pSR5);
		casas.add(sr5);
		
		Posicao hfPos = new Posicao(pSR5.x-l4xpadding, ntPos.y); 
		Terreno hayford = (Terreno) fabricaCasas.construirCasa("Terreno", hfPos);
		hfPos = hayford.getPosicao();
		hfPos.x = hfPos.x - hayford.getImagem().width;
		hayford.setPosicao(hfPos);
		casas.add(hayford);
		
		Posicao klPos = new Posicao(hfPos.x-l4xpadding, ntPos.y); 
		Terreno kingsLanding = (Terreno) fabricaCasas.construirCasa("Terreno", klPos);
		klPos = kingsLanding.getPosicao();
		klPos.x = klPos.x - kingsLanding.getImagem().width;
		kingsLanding.setPosicao(klPos);
		casas.add(kingsLanding);
		
		Posicao dgPos = new Posicao(klPos.x-l4xpadding, ntPos.y);
		VaPrisao dungeonGate = (VaPrisao) fabricaCasas.construirCasa("VaPrisao", dgPos);
		dgPos = dungeonGate.getPosicao();
		dgPos.x = dgPos.x - dungeonGate.getImagem().width;
		dungeonGate.setPosicao(dgPos);
		casas.add(dungeonGate);
		
		Posicao bbPos = new Posicao(dgPos.x-l4xpadding, ntPos.y);
		Terreno bitterbridge = (Terreno) fabricaCasas.construirCasa("Terreno", bbPos);
		bbPos = bitterbridge.getPosicao();
		bbPos.x = bbPos.x - bitterbridge.getImagem().width;
		bitterbridge.setPosicao(bbPos);
		casas.add(bitterbridge);
		
		// Casas da quinta linha
		double l5xpadding = 15.555;
		
		Posicao co5Pos = new Posicao(l5xpadding, bbPos.y+bitterbridge.getImagem().height+vypadding);
		Compania comp5 = (Compania) fabricaCasas.construirCasa("Compania", co5Pos);
		casas.add(comp5);
		
		Posicao ltPos = new Posicao(co5Pos.x + comp5.getImagem().width + l5xpadding, co5Pos.y);
		Terreno longTable = (Terreno) fabricaCasas.construirCasa("Terreno", ltPos);
		casas.add(longTable);
		
		Posicao chPos = new Posicao(ltPos.x + longTable.getImagem().width + l5xpadding, co5Pos.y);
		Terreno ciderHall = (Terreno) fabricaCasas.construirCasa("Terreno", chPos);
		casas.add(ciderHall);
		
		Posicao co6Pos = new Posicao(chPos.x + ciderHall.getImagem().width + l5xpadding, co5Pos.y);
		Compania comp6 = (Compania) fabricaCasas.construirCasa("Compania", co6Pos);
		casas.add(comp6);
		
		Posicao hgPos = new Posicao(co6Pos.x + comp6.getImagem().width + l5xpadding, co5Pos.y);
		Terreno highGarden = (Terreno) fabricaCasas.construirCasa("Terreno", hgPos);
		casas.add(highGarden);
		
		Posicao pSR6 = new Posicao(hgPos.x + highGarden.getImagem().width + l5xpadding, co5Pos.y); 
		SorteReves sr6 = (SorteReves) fabricaCasas.construirCasa("SorteReves", pSR6);
		casas.add(sr6);
		
		Posicao ggPos = new Posicao(pSR6.x + sr6.getImagem().width + l5xpadding, co5Pos.y);
		Terreno godsGrace = (Terreno) fabricaCasas.construirCasa("Terreno", ggPos);
		casas.add(godsGrace);
		
		Posicao spPos = new Posicao(ggPos.x + godsGrace.getImagem().width + l5xpadding, co5Pos.y);
		Terreno sunspear = (Terreno) fabricaCasas.construirCasa("Terreno", spPos);
		casas.add(sunspear);
		
	}
	
	public void desenharCasas() {
		for (CasaTabuleiro casa : casas) {
			casa.desenhar();
		}
	}
	
	public void receberJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
		PontoPartida pp = (PontoPartida) casas.get(0);
		for (Jogador jogador : this.jogadores) {
			System.out.println("ID em Tabuleiro: " + jogador.getId());
			pp.addJogador(jogador);
		}
	}
	
	public void desenharJogadores() {
		for (Jogador jogador : this.jogadores) {
			jogador.getPersonagem().draw();
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
