package casas;

import java.util.ArrayList;

import telas.JogoMain;
import util.Posicao;

public class ConstrutorCasas {
	ArrayList<CasaTabuleiro> casas = new ArrayList<CasaTabuleiro>();
	FabricaCasas fc = FabricaCasas.getInstance();
	private static ConstrutorCasas construtorCasas = new ConstrutorCasas();
	
	private ConstrutorCasas() {
		
	}
	
	public static ConstrutorCasas getInstance() {
		return construtorCasas;
	}
	
	public ArrayList<CasaTabuleiro> construirCasas() {

		int tabuleiroWidth = JogoMain.janela.getWidth();
		int vypadding = 12;

		// <----------- PRIMEIRA LINHA
		// Casas da primeira linha
		int l1xpadding = 10;

		Posicao twPos = new Posicao(0, 0);
		PontoPartida wall = (PontoPartida) fc.construirCasa("PontoPartida", twPos);
		casas.add(wall);

		Posicao cbPos = new Posicao(twPos.x + wall.getImagem().width + l1xpadding, vypadding);
		Terreno castleBlack;
		castleBlack = (Terreno) fc.construirCasa("Terreno", cbPos);
		castleBlack.setNome("Castle Black");
		castleBlack.setGrupo("Stark");
		castleBlack.setPrecoTerreno(100);
		castleBlack.setAluguelTerreno(6);
		castleBlack.setAluguel1(30);
		castleBlack.setAluguel2(90);
		castleBlack.setAluguel3(270);
		castleBlack.setAluguel4(400);
		castleBlack.setHotel(new Hotel(500));
		casas.add(castleBlack);

		Posicao pSR1 = new Posicao(cbPos.x + castleBlack.getImagem().width + l1xpadding, vypadding);
		SorteReves sr1 = (SorteReves) fc.construirCasa("SorteReves", pSR1);
		casas.add(sr1);

		Posicao wiPos = new Posicao(pSR1.x + sr1.getImagem().width + l1xpadding, vypadding);
		Terreno winterfel;
		winterfel = (Terreno) fc.construirCasa("Terreno", wiPos);
		winterfel.setNome("Winterfell");
		winterfel.setGrupo("Stark");
		winterfel.setPrecoTerreno(60);
		winterfel.setAluguelTerreno(2);
		winterfel.setAluguel1(10);
		winterfel.setAluguel2(30);
		winterfel.setAluguel3(90);
		winterfel.setAluguel4(160);
		winterfel.setHotel(new Hotel(250));
		casas.add(winterfel);

		Posicao boPos = new Posicao(wiPos.x + winterfel.getImagem().width + l1xpadding, vypadding);
		Terreno bolton;
		bolton = (Terreno) fc.construirCasa("Terreno", boPos);
		bolton.setNome("Bolton Castle");
		bolton.setGrupo("Stark");
		bolton.setPrecoTerreno(60);
		bolton.setAluguelTerreno(4);
		bolton.setAluguel1(20);
		bolton.setAluguel2(60);
		bolton.setAluguel3(180);
		bolton.setAluguel4(320);
		bolton.setHotel(new Hotel(450));
		casas.add(bolton);

		Posicao co1Pos = new Posicao(boPos.x + bolton.getImagem().width + l1xpadding, vypadding);
		Compania comp1 = (Compania) fc.construirCasa("Compania", co1Pos);
		comp1.setNome("Stark Beer Co");
		comp1.setPrecoCompania(200);
		comp1.setTaxa(50);
		casas.add(comp1);

		Posicao haPos = new Posicao(co1Pos.x + comp1.getImagem().width + l1xpadding, vypadding);
		Terreno nom;
		nom = (Terreno) fc.construirCasa("Terreno", haPos);
		nom.setNome("Hammer");
		nom.setGrupo("Greyjoy");
		nom.setPrecoTerreno(240);
		nom.setAluguelTerreno(20);
		nom.setAluguel1(100);
		nom.setAluguel2(300);
		nom.setAluguel3(750);
		nom.setAluguel4(925);
		nom.setHotel(new Hotel(150));
		casas.add(nom);

		Posicao co2Pos = new Posicao(haPos.x + nom.getImagem().width + l1xpadding, vypadding);
		Compania comp2 = (Compania) fc.construirCasa("Compania", co2Pos);
		comp2.setNome("Greijoy Sail");
		comp2.setPrecoCompania(-200);
		comp2.setTaxa(50);
		casas.add(comp2);

		Posicao pikePos = new Posicao(co2Pos.x + comp2.getImagem().width + l1xpadding, vypadding);
		Terreno pike = (Terreno) fc.construirCasa("Terreno", pikePos);
		pike.setNome("Pike");
		pike.setGrupo("Greyjoy");
		pike.setPrecoTerreno(220);
		pike.setAluguelTerreno(18);
		pike.setAluguel1(90);
		pike.setAluguel2(250);
		pike.setAluguel3(700);
		pike.setAluguel4(875);
		pike.setHotel(new Hotel(1050));
		casas.add(pike);

		// <---------- segunda linha
		double l2xpadding = 9.5;

		Posicao ttPos = new Posicao(tabuleiroWidth - l2xpadding, pikePos.y + pike.getImagem().height + vypadding);
		Terreno tenTowers = (Terreno) fc.construirCasa("Terreno", ttPos);
		ttPos = tenTowers.getPosicao();
		ttPos.x = ttPos.x - tenTowers.getImagem().width;
		tenTowers.setPosicao(ttPos);
		tenTowers.setNome("Ten Towers");
		tenTowers.setGrupo("Greyjoy");
		tenTowers.setPrecoTerreno(220);
		tenTowers.setAluguelTerreno(18);
		tenTowers.setAluguel1(90);
		tenTowers.setAluguel2(250);
		tenTowers.setAluguel3(700);
		tenTowers.setAluguel4(875);
		tenTowers.setHotel(new Hotel(1050));
		casas.add(tenTowers);

		Posicao duPos = new Posicao(ttPos.x - l2xpadding, ttPos.y);
		Prisao dungeon = (Prisao) fc.construirCasa("Prisao", duPos);
		duPos = dungeon.getPosicao();
		duPos.x = duPos.x - tenTowers.getImagem().width;
		dungeon.setPosicao(duPos);
		casas.add(dungeon);

		Posicao ssPos = new Posicao(duPos.x - l2xpadding, ttPos.y);
		Terreno strongSong = (Terreno) fc.construirCasa("Terreno", ssPos);
		ssPos = strongSong.getPosicao();
		ssPos.x = ssPos.x - strongSong.getImagem().width;
		strongSong.setPosicao(ssPos);
		strongSong.setNome("Strong Song");
		strongSong.setGrupo("Ayrrin");
		strongSong.setPrecoTerreno(200);
		strongSong.setAluguelTerreno(16);
		strongSong.setAluguel1(80);
		strongSong.setAluguel2(220);
		strongSong.setAluguel3(600);
		strongSong.setAluguel4(800);
		strongSong.setHotel(new Hotel(1000));
		casas.add(strongSong);

		Posicao pSR2 = new Posicao(ssPos.x - l2xpadding, ttPos.y);
		SorteReves sr2 = (SorteReves) fc.construirCasa("SorteReves", pSR2);
		pSR2 = sr2.getPosicao();
		pSR2.x = pSR2.x - sr2.getImagem().width;
		sr2.setPosicao(pSR2);
		casas.add(sr2);

		Posicao tePos = new Posicao(pSR2.x - l2xpadding, ttPos.y);
		Terreno theEyre = (Terreno) fc.construirCasa("Terreno", tePos);
		tePos = theEyre.getPosicao();
		tePos.x = tePos.x - theEyre.getImagem().width;
		theEyre.setPosicao(tePos);
		theEyre.setNome("The Eyre");
		theEyre.setGrupo("Ayrrin");
		theEyre.setPrecoTerreno(180);
		theEyre.setAluguelTerreno(14);
		theEyre.setAluguel1(70);
		theEyre.setAluguel2(200);
		theEyre.setAluguel3(550);
		theEyre.setAluguel4(750);
		theEyre.setHotel(new Hotel(950));
		casas.add(theEyre);

		Posicao rfPos = new Posicao(tePos.x - l2xpadding, ttPos.y);
		Terreno redFort = (Terreno) fc.construirCasa("Terreno", rfPos);
		rfPos = redFort.getPosicao();
		rfPos.x = rfPos.x - redFort.getImagem().width;
		redFort.setPosicao(rfPos);
		redFort.setNome("Red Fort");
		redFort.setGrupo("Ayrrin");
		redFort.setPrecoTerreno(180);
		redFort.setAluguelTerreno(14);
		redFort.setAluguel1(70);
		redFort.setAluguel2(200);
		redFort.setAluguel3(550);
		redFort.setAluguel4(750);
		redFort.setHotel(new Hotel(950));
		casas.add(redFort);

		Posicao co3Pos = new Posicao(rfPos.x - l2xpadding, ttPos.y);
		Compania comp3 = (Compania) fc.construirCasa("Compania", co3Pos);
		co3Pos = comp3.getPosicao();
		co3Pos.x = co3Pos.x - comp3.getImagem().width;
		comp3.setPosicao(co3Pos);
		comp3.setNome("Fly Ayrrin");
		comp3.setPrecoCompania(150);
		comp3.setTaxa(40);
		casas.add(comp3);

		Posicao pSR3 = new Posicao(co3Pos.x - l2xpadding, ttPos.y);
		SorteReves sr3 = (SorteReves) fc.construirCasa("SorteReves", pSR3);
		pSR3 = sr3.getPosicao();
		pSR3.x = pSR3.x - sr3.getImagem().width;
		sr3.setPosicao(pSR3);
		casas.add(sr3);

		Posicao dsPos = new Posicao(pSR3.x - l2xpadding, ttPos.y);
		Terreno dragonStone = (Terreno) fc.construirCasa("Terreno", dsPos);
		dsPos = dragonStone.getPosicao();
		dsPos.x = dsPos.x - dragonStone.getImagem().width;
		dragonStone.setPosicao(dsPos);
		dragonStone.setNome("Dragon Stone");
		dragonStone.setGrupo("Targaryen");
		dragonStone.setPrecoTerreno(350);
		dragonStone.setAluguelTerreno(35);
		dragonStone.setAluguel1(175);
		dragonStone.setAluguel2(500);
		dragonStone.setAluguel3(1100);
		dragonStone.setAluguel4(1300);
		dragonStone.setHotel(new Hotel(1500));
		casas.add(dragonStone);
		
		// tercaira linha

		double l3xpadding = 17.875;

		Posicao ldPos = new Posicao(l3xpadding, dsPos.y + dragonStone.getImagem().height + vypadding);
		LucrosDividendos profits = (LucrosDividendos) fc.construirCasa("LucrosDividendos", ldPos);
		casas.add(profits);

		
		Posicao rrPos = new Posicao(ldPos.x+profits.getImagem().width+l3xpadding, ldPos.y);
		Terreno rooksRest = (Terreno) fc.construirCasa("Terreno", rrPos);
		rooksRest.setNome("Rooks Rest");
		rooksRest.setGrupo("Targaryen");
		rooksRest.setPrecoTerreno(400);
		rooksRest.setAluguelTerreno(50);
		rooksRest.setAluguel1(200);
		rooksRest.setAluguel2(600);
		rooksRest.setAluguel3(1400);
		rooksRest.setAluguel4(1700);
		rooksRest.setHotel(new Hotel(2000));
		casas.add(rooksRest);

		Posicao fsPos = new Posicao(rrPos.x+rooksRest.getImagem().width+l3xpadding, ldPos.y);
		ParadaLivre freeStop = (ParadaLivre) fc.construirCasa("ParadaLivre", fsPos);
		casas.add(freeStop);

		// <------- TERCEIRA LINHA

		Posicao crPos = new Posicao(fsPos.x+freeStop.getImagem().width+(2*l3xpadding)+283, ldPos.y);
		Terreno casterlyRock = (Terreno) fc.construirCasa("Terreno", crPos);		
		casterlyRock.setNome("Casterly Rock");
		casterlyRock.setGrupo("Lennister");
		casterlyRock.setPrecoTerreno(120);
		casterlyRock.setAluguelTerreno(8);
		casterlyRock.setAluguel1(40);
		casterlyRock.setAluguel2(100);
		casterlyRock.setAluguel3(300);
		casterlyRock.setAluguel4(450);
		casterlyRock.setHotel(new Hotel(600));
		casas.add(casterlyRock);

		Posicao pSR4 = new Posicao(crPos.x+casterlyRock.getImagem().width+l3xpadding, ldPos.y); 
		SorteReves sr4 = (SorteReves) fc.construirCasa("SorteReves", pSR4);
		casas.add(sr4);

		Posicao hvPos = new Posicao(pSR4.x+sr4.getImagem().width+l3xpadding, ldPos.y);
		Terreno hornVale = (Terreno) fc.construirCasa("Terreno", hvPos);
		hornVale.setNome("Horn Vale");
		hornVale.setGrupo("Lennister");
		hornVale.setPrecoTerreno(100);
		hornVale.setAluguelTerreno(6);
		hornVale.setAluguel1(30);
		hornVale.setAluguel2(90);
		hornVale.setAluguel3(270);
		hornVale.setAluguel4(400);
		hornVale.setHotel(new Hotel(500));
		casas.add(hornVale);
		
		// <----- asas quarta linha
		
		double l4xpadding = 14.888;
		
		Posicao ntPos = new Posicao(tabuleiroWidth-l4xpadding, hvPos.y+hornVale.getImagem().height+vypadding); 
		ImpostoRenda notToday = (ImpostoRenda) fc.construirCasa("ImpostoRenda", ntPos);
		ntPos = notToday.getPosicao();
		ntPos.x = ntPos.x - notToday.getImagem().width;
		notToday.setPosicao(ntPos);
		casas.add(notToday);

		Posicao co4Pos = new Posicao(ntPos.x-l4xpadding, ntPos.y);
		Compania comp4 = (Compania) fc.construirCasa("Compania", co4Pos);
		co4Pos = comp4.getPosicao();
		co4Pos.x = co4Pos.x - comp4.getImagem().width;
		comp4.setPosicao(co4Pos);
		comp4.setNome("Lannister Loans");
		casas.add(comp4);

		Posicao shPos = new Posicao(co4Pos.x-l4xpadding, ntPos.y); 
		Terreno sowsHorn = (Terreno) fc.construirCasa("Terreno", shPos);
		shPos = sowsHorn.getPosicao();
		shPos.x = shPos.x - sowsHorn.getImagem().width;
		sowsHorn.setPosicao(shPos);
		sowsHorn.setNome("Sows Horn");
		sowsHorn.setGrupo("Baratheon");
		sowsHorn.setPrecoTerreno(160);
		sowsHorn.setAluguelTerreno(12);
		sowsHorn.setAluguel1(60);
		sowsHorn.setAluguel2(180);
		sowsHorn.setAluguel3(500);
		sowsHorn.setAluguel4(700);
		sowsHorn.setHotel(new Hotel(900));
		casas.add(sowsHorn);

		Posicao pSR5 = new Posicao(shPos.x-l4xpadding, ntPos.y); 
		SorteReves sr5 = (SorteReves) fc.construirCasa("SorteReves", pSR5);
		pSR5 = sr5.getPosicao();
		pSR5.x = pSR5.x - sr5.getImagem().width;
		sr5.setPosicao(pSR5);
		casas.add(sr5);

		Posicao hfPos = new Posicao(pSR5.x-l4xpadding, ntPos.y); 
		Terreno hayford = (Terreno) fc.construirCasa("Terreno", hfPos);
		hfPos = hayford.getPosicao();
		hfPos.x = hfPos.x - hayford.getImagem().width;
		hayford.setPosicao(hfPos);
		hayford.setNome("Hayford");
		hayford.setGrupo("Baratheon");
		hayford.setPrecoTerreno(140);
		hayford.setAluguelTerreno(10);
		hayford.setAluguel1(50);
		hayford.setAluguel2(150);
		hayford.setAluguel3(450);
		hayford.setAluguel4(625);
		hayford.setHotel(new Hotel(750));
		casas.add(hayford);

		Posicao klPos = new Posicao(hfPos.x-l4xpadding, ntPos.y); 
		Terreno kingsLanding = (Terreno) fc.construirCasa("Terreno", klPos);
		klPos = kingsLanding.getPosicao();
		klPos.x = klPos.x - kingsLanding.getImagem().width;
		kingsLanding.setPosicao(klPos);
		kingsLanding.setNome("Kings Landing");
		kingsLanding.setGrupo("Baratheon");
		kingsLanding.setPrecoTerreno(140);
		kingsLanding.setAluguelTerreno(10);
		kingsLanding.setAluguel1(50);
		kingsLanding.setAluguel2(150);
		kingsLanding.setAluguel3(450);
		kingsLanding.setAluguel4(625);
		kingsLanding.setHotel(new Hotel(750));
		casas.add(kingsLanding);

		Posicao dgPos = new Posicao(klPos.x-l4xpadding, ntPos.y);
		VaPrisao dungeonGate = (VaPrisao) fc.construirCasa("VaPrisao", dgPos);
		dgPos = dungeonGate.getPosicao();
		dgPos.x = dgPos.x - dungeonGate.getImagem().width;
		dungeonGate.setPosicao(dgPos);
		casas.add(dungeonGate);

		// <---- QUARTA LINHA

		Posicao bbPos = new Posicao(dgPos.x-l4xpadding, ntPos.y);
		Terreno bitterbridge = (Terreno) fc.construirCasa("Terreno", bbPos);
		bbPos = bitterbridge.getPosicao();
		bbPos.x = bbPos.x - bitterbridge.getImagem().width;
		bitterbridge.setPosicao(bbPos);
		bitterbridge.setNome("Bitter Bridge");
		bitterbridge.setGrupo("Tyrell");
		bitterbridge.setPrecoTerreno(260);
		bitterbridge.setAluguelTerreno(22);
		bitterbridge.setAluguel1(110);
		bitterbridge.setAluguel2(330);
		bitterbridge.setAluguel3(800);
		bitterbridge.setAluguel4(975);
		bitterbridge.setHotel(new Hotel(1150));
		casas.add(bitterbridge);

		double l5xpadding = 15.555;
		
		Posicao co5Pos = new Posicao(l5xpadding, bbPos.y+bitterbridge.getImagem().height+vypadding);
		Compania comp5 = (Compania) fc.construirCasa("Compania", co5Pos);
		comp5.setPrecoCompania(200);
		comp5.setTaxa(50);
		comp5.setNome("Tyrell Foods");
		casas.add(comp5);

		Posicao ltPos = new Posicao(co5Pos.x + comp5.getImagem().width + l5xpadding, co5Pos.y);
		Terreno longTable = (Terreno) fc.construirCasa("Terreno", ltPos);
		longTable.setNome("Long Table");
		longTable.setGrupo("Tyrell");
		longTable.setPrecoTerreno(320);
		longTable.setAluguelTerreno(28);
		longTable.setAluguel1(150);
		longTable.setAluguel2(450);
		longTable.setAluguel3(1000);
		longTable.setAluguel4(1200);
		longTable.setHotel(new Hotel(1400));
		casas.add(longTable);

		Posicao chPos = new Posicao(ltPos.x + longTable.getImagem().width + l5xpadding, co5Pos.y);
		Terreno ciderHall = (Terreno) fc.construirCasa("Terreno", chPos);
		ciderHall.setNome("Cider Hall");
		ciderHall.setGrupo("Tyrell");
		ciderHall.setPrecoTerreno(300);
		ciderHall.setAluguelTerreno(26);
		ciderHall.setAluguel1(130);
		ciderHall.setAluguel2(390);
		ciderHall.setAluguel3(900);
		ciderHall.setAluguel4(1100);
		ciderHall.setHotel(new Hotel(1275));
		casas.add(ciderHall);

		Posicao co6Pos = new Posicao(chPos.x + ciderHall.getImagem().width + l5xpadding, co5Pos.y);
		Compania comp6 = (Compania) fc.construirCasa("Compania", co6Pos);
		comp6.setNome("Tyrell Flowers");
		casas.add(comp6);
		
		Posicao hgPos = new Posicao(co6Pos.x + comp6.getImagem().width + l5xpadding, co5Pos.y);
		Terreno highGarden = (Terreno) fc.construirCasa("Terreno", hgPos);
		highGarden.setNome("HighGarden");
		highGarden.setGrupo("Tyrell");
		highGarden.setPrecoTerreno(300);
		highGarden.setAluguelTerreno(26);
		highGarden.setAluguel1(130);
		highGarden.setAluguel2(390);
		highGarden.setAluguel3(900);
		highGarden.setAluguel4(1100);
		highGarden.setHotel(new Hotel(1275));
		casas.add(highGarden);

		Posicao pSR6 = new Posicao(hgPos.x + highGarden.getImagem().width + l5xpadding, co5Pos.y); 
		SorteReves sr6 = (SorteReves) fc.construirCasa("SorteReves", pSR6);
		casas.add(sr6);

		Posicao ggPos = new Posicao(pSR6.x + sr6.getImagem().width + l5xpadding, co5Pos.y);
		Terreno godsGrace = (Terreno) fc.construirCasa("Terreno", ggPos);
		godsGrace.setNome("Gods Grace");
		godsGrace.setGrupo("Martell");
		godsGrace.setPrecoTerreno(280);
		godsGrace.setAluguelTerreno(24);
		godsGrace.setAluguel1(120);
		godsGrace.setAluguel2(360);
		godsGrace.setAluguel3(850);
		godsGrace.setAluguel4(1025);
		godsGrace.setHotel(new Hotel(1200));
		casas.add(godsGrace);

		Posicao spPos = new Posicao(ggPos.x + godsGrace.getImagem().width + l5xpadding, co5Pos.y);
		Terreno sunspear = (Terreno) fc.construirCasa("Terreno", spPos);
		sunspear.setNome("Sunspear");
		sunspear.setGrupo("Martell");
		sunspear.setPrecoTerreno(260);
		sunspear.setAluguelTerreno(22);
		sunspear.setAluguel1(110);
		sunspear.setAluguel2(330);
		sunspear.setAluguel3(800);
		sunspear.setAluguel4(975);
		sunspear.setHotel(new Hotel(1150));
		casas.add(sunspear);

		return this.casas;
	}

}
