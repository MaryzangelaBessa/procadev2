package casas;

import java.util.ArrayList;

import util.Posicao;

public class ConstrutorCasas {
	ArrayList<CasaTabuleiro> casas = new ArrayList<CasaTabuleiro>();
	FabricaCasas fc = FabricaCasas.getInstance();
	public ArrayList<CasaTabuleiro> construirCasas(){
		
		// <------------- VARIAVEIS
		
		ParadaLivre pl;
		Posicao p = new Posicao(0, 0);
		Compania comp;
		Prisao pris;
		LucrosDividendos lc;
		ImpostoRenda ip;
		VaPrisao vp;
		
		
		// <----------- PRIMEIRA LINHA
		
		
		Posicao twPos = new Posicao(0, 0); 
		PontoPartida wall; 
		wall = (PontoPartida) fc.construirCasa("PontoPartida", twPos);
		casas.add(wall);
		
		Posicao cbPos = new Posicao(62, 12); 
		Terreno castleBlack; 
		castleBlack = (Terreno) fc.construirCasa("Terreno", cbPos);		
		castleBlack.setNome("CASTLE BLACK");
		castleBlack.setGrupo("Stark");
		castleBlack.setPrecoTerreno(100);
		castleBlack.setAluguelTerreno(6);
		castleBlack.setAluguel1(30);
		castleBlack.setAluguel2(90);
		castleBlack.setAluguel3(270);
		castleBlack.setAluguel4(400);
		castleBlack.setHotel(new Hotel(500));
		casas.add(castleBlack);
		
		Posicao SR = new Posicao(124, 12);
		SorteReves sortRev;
		sortRev = (SorteReves) fc.construirCasa("SorteReves", SR);
		casas.add(sortRev);
		
		
		Posicao cbdPos = new Posicao(186, 12);
		Terreno castelBoldon;
		castelBoldon = (Terreno) fc.construirCasa("Terreno", cbdPos);
		castelBoldon.setNome("Castel Boldon");
		castelBoldon.setGrupo("Stark");
		castelBoldon.setPrecoTerreno(60);
		castelBoldon.setAluguelTerreno(2);
		castelBoldon.setAluguel1(10);
		castelBoldon.setAluguel2(30);
		castelBoldon.setAluguel3(90);
		castelBoldon.setAluguel4(160);
		castelBoldon.setHotel(new Hotel(250));
		casas.add(castelBoldon);
		
		
		Posicao cwPos = new Posicao(248, 12);
		Terreno castelWinterfel;
		castelWinterfel = (Terreno) fc.construirCasa("Terreno", cwPos);
		castelWinterfel.setNome("Castel Winterfel");
		castelWinterfel.setGrupo("Stark");
		castelWinterfel.setPrecoTerreno(60);
		castelWinterfel.setAluguelTerreno(4);
		castelWinterfel.setAluguel1(20);
		castelWinterfel.setAluguel2(60);
		castelWinterfel.setAluguel3(180);
		castelWinterfel.setAluguel4(320);
		castelWinterfel.setHotel(new Hotel(450));
		casas.add(castelWinterfel);
		
		
		Posicao comPos = new Posicao(310, 12);
		comp = (Compania) fc.construirCasa("Compania", comPos);
		comp.setPrecoCompania(200);
		comp.setTaxa(50);
		casas.add(comp);
		
		
		Posicao pos = new Posicao(372, 12);
		Terreno nomeT;
		nomeT = (Terreno) fc.construirCasa("Terreno", pos);
		nomeT.setNome("");
		nomeT.setGrupo("Greyjoy");
		nomeT.setPrecoTerreno(240);
		nomeT.setAluguelTerreno(20);
		nomeT.setAluguel1(100);
		nomeT.setAluguel2(300);
		nomeT.setAluguel3(750);
		nomeT.setAluguel4(925);
		nomeT.setHotel(new Hotel(150));
		casas.add(nomeT);
		
		
		comPos = new Posicao(434, 12);
		comp = (Compania) fc.construirCasa("Compania", comPos);
		comp.setPrecoCompania(-200);
		comp.setTaxa(50);
		casas.add(comp);
		
		
		pos = new Posicao(496, 12);
		//Terreno nomeT;
		nomeT = (Terreno) fc.construirCasa("Terreno", pos);
		//nomeT.setNome("");
		nomeT.setGrupo("Greyjoy");
		nomeT.setPrecoTerreno(220);
		nomeT.setAluguelTerreno(18);
		nomeT.setAluguel1(90);
		nomeT.setAluguel2(250);
		nomeT.setAluguel3(700);
		nomeT.setAluguel4(875);
		nomeT.setHotel(new Hotel(1050));
		casas.add(nomeT);
		
		
		pos = new Posicao(558, 12);
		//Terreno nomeT;
		nomeT = (Terreno) fc.construirCasa("Terreno", pos);
		//nomeT.setNome("");
		nomeT.setGrupo("Greyjoy");
		nomeT.setPrecoTerreno(220);
		nomeT.setAluguelTerreno(18);
		nomeT.setAluguel1(90);
		nomeT.setAluguel2(250);
		nomeT.setAluguel3(700);
		nomeT.setAluguel4(875);
		nomeT.setHotel(new Hotel(1050));
		casas.add(nomeT);
		
		p.x = 620;
		p.y = 12;
		pris = (Prisao) fc.construirCasa("Prisao", p);
		casas.add(pris);
		
		// <-------------- SEGUNDA LINHA
		
		pos = new Posicao(620, 74);
		//Terreno nomeT;
		nomeT = (Terreno) fc.construirCasa("Terreno", pos);
		//nomeT.setNome("");
		nomeT.setGrupo("Ayrrin");
		nomeT.setPrecoTerreno(200);
		nomeT.setAluguelTerreno(16);
		nomeT.setAluguel1(80);
		nomeT.setAluguel2(220);
		nomeT.setAluguel3(600);
		nomeT.setAluguel4(800);
		nomeT.setHotel(new Hotel(1000));
		casas.add(nomeT);
		
		p.x = 558;
		p.y = 74;
		sortRev = (SorteReves) fc.construirCasa("SorteReves", p);
		//castel.setNome("Castel Winterfel");
		casas.add(sortRev);
		
		
		pos = new Posicao(496, 74);
		//Terreno nomeT;
		nomeT = (Terreno) fc.construirCasa("Terreno", pos);
		//nomeT.setNome("");
		nomeT.setGrupo("Ayrrin");
		nomeT.setPrecoTerreno(180);
		nomeT.setAluguelTerreno(14);
		nomeT.setAluguel1(70);
		nomeT.setAluguel2(200);
		nomeT.setAluguel3(550);
		nomeT.setAluguel4(750);
		nomeT.setHotel(new Hotel(950));
		casas.add(nomeT);
		
		pos = new Posicao(434, 74);
		//Terreno nomeT;
		nomeT = (Terreno) fc.construirCasa("Terreno", pos);
		//nomeT.setNome("");
		nomeT.setGrupo("Ayrrin");
		nomeT.setPrecoTerreno(180);
		nomeT.setAluguelTerreno(14);
		nomeT.setAluguel1(70);
		nomeT.setAluguel2(200);
		nomeT.setAluguel3(550);
		nomeT.setAluguel4(750);
		nomeT.setHotel(new Hotel(950));
		casas.add(nomeT);
		
		
		comPos = new Posicao(372, 74);
		comp = (Compania) fc.construirCasa("Compania", comPos);
		comp.setPrecoCompania(150);
		comp.setTaxa(40);
		//castel.setNome("Castel Winterfel");
		casas.add(comp);
		
		
		p.x = 310;
		p.y = 74;
		sortRev = (SorteReves) fc.construirCasa("SorteReves", p);
		//castel.setNome("Castel Winterfel");
		casas.add(sortRev);
	
		
		pos = new Posicao(248, 74);
		//Terreno nomeT;
		nomeT = (Terreno) fc.construirCasa("Terreno", pos);
		//nomeT.setNome("");
		nomeT.setGrupo("Targaryen");
		nomeT.setPrecoTerreno(350);
		nomeT.setAluguelTerreno(35);
		nomeT.setAluguel1(175);
		nomeT.setAluguel2(500);
		nomeT.setAluguel3(1100);
		nomeT.setAluguel4(1300);
		nomeT.setHotel(new Hotel(1500));
		casas.add(nomeT);
		
		p.x = 186;
		p.y = 74;
		lc = (LucrosDividendos) fc.construirCasa("LucrosDividendos", p);
		//castel.setNome("Castel Winterfel");
		casas.add(lc);
		
		
		pos = new Posicao(124, 74);
		//Terreno nomeT;
		nomeT = (Terreno) fc.construirCasa("Terreno", pos);
		//nomeT.setNome("");
		nomeT.setGrupo("Targaryen");
		nomeT.setPrecoTerreno(400);
		nomeT.setAluguelTerreno(50);
		nomeT.setAluguel1(200);
		nomeT.setAluguel2(600);
		nomeT.setAluguel3(1400);
		nomeT.setAluguel4(1700);
		nomeT.setHotel(new Hotel(2000));
		casas.add(nomeT);
		
		p.x = 62;
		p.y = 74;
		pl = (ParadaLivre) fc.construirCasa("ParadaLivre", p);
		//castel.setNome("Castel Winterfel");
		casas.add(pl);
		
		// <------- TERCEIRA LINHA
		
		pos = new Posicao(62, 136);
		//Terreno nomeT;
		nomeT = (Terreno) fc.construirCasa("Terreno", pos);
		//nomeT.setNome("");
		nomeT.setGrupo("Lennister");
		nomeT.setPrecoTerreno(120);
		nomeT.setAluguelTerreno(8);
		nomeT.setAluguel1(40);
		nomeT.setAluguel2(100);
		nomeT.setAluguel3(300);
		nomeT.setAluguel4(450);
		nomeT.setHotel(new Hotel(600));
		casas.add(nomeT);
		
		p.x = 124;
		p.y = 136;
		sortRev = (SorteReves) fc.construirCasa("SorteReves", p);
		//castel.setNome("Castel Winterfel");
		casas.add(sortRev);
		
		
		pos = new Posicao(186, 136);
		//Terreno nomeT;
		nomeT = (Terreno) fc.construirCasa("Terreno", pos);
		//nomeT.setNome("");
		nomeT.setGrupo("Lennister");
		nomeT.setPrecoTerreno(100);
		nomeT.setAluguelTerreno(6);
		nomeT.setAluguel1(30);
		nomeT.setAluguel2(90);
		nomeT.setAluguel3(270);
		nomeT.setAluguel4(400);
		nomeT.setHotel(new Hotel(500));
		casas.add(nomeT);
		
		p.x = 248;
		p.y = 136;
		ip = (ImpostoRenda) fc.construirCasa("ImpostoRenda", p);
		//castel.setNome("Castel Winterfel");
		casas.add(ip);
		
		
		comPos = new Posicao(310, 136);
		comp = (Compania) fc.construirCasa("Compania", comPos);
		comp.setPrecoCompania(150);
		comp.setTaxa(40);
		//castel.setNome("Castel Winterfel");
		casas.add(comp);
		
		
		pos = new Posicao(372, 136);
		//Terreno nomeT;
		nomeT = (Terreno) fc.construirCasa("Terreno", pos);
		//nomeT.setNome("");
		nomeT.setGrupo("Baratheon");
		nomeT.setPrecoTerreno(160);
		nomeT.setAluguelTerreno(12);
		nomeT.setAluguel1(60);
		nomeT.setAluguel2(180);
		nomeT.setAluguel3(500);
		nomeT.setAluguel4(700);
		nomeT.setHotel(new Hotel(900));
		casas.add(nomeT);
		
		p.x = 434;
		p.y = 136;
		sortRev = (SorteReves) fc.construirCasa("SorteReves", p);
		//castel.setNome("Castel Winterfel");
		casas.add(sortRev);
		
		
		pos = new Posicao(496, 136);
		//Terreno nomeT;
		nomeT = (Terreno) fc.construirCasa("Terreno", pos);
		//nomeT.setNome("");
		nomeT.setGrupo("Baratheon");
		nomeT.setPrecoTerreno(140);
		nomeT.setAluguelTerreno(10);
		nomeT.setAluguel1(50);
		nomeT.setAluguel2(150);
		nomeT.setAluguel3(450);
		nomeT.setAluguel4(625);
		nomeT.setHotel(new Hotel(750));
		casas.add(nomeT);
		
		
		pos = new Posicao(558, 136);
		//Terreno nomeT;
		nomeT = (Terreno) fc.construirCasa("Terreno", pos);
		//nomeT.setNome("");
		nomeT.setGrupo("Baratheon");
		nomeT.setPrecoTerreno(140);
		nomeT.setAluguelTerreno(10);
		nomeT.setAluguel1(50);
		nomeT.setAluguel2(150);
		nomeT.setAluguel3(450);
		nomeT.setAluguel4(625);
		nomeT.setHotel(new Hotel(750));
		casas.add(nomeT);
		
		
		p.x = 620;
		p.y = 136;
		vp = (VaPrisao) fc.construirCasa("VaPrisao", p);
		//castel.setNome("Castel Winterfel");
		casas.add(vp);
		
		
		// <---- QUARTA LINHA
		
		
		pos = new Posicao(558, 198);
		//Terreno nomeT;
		nomeT = (Terreno) fc.construirCasa("Terreno", pos);
		//nomeT.setNome("");
		nomeT.setGrupo("Tyrell");
		nomeT.setPrecoTerreno(260);
		nomeT.setAluguelTerreno(22);
		nomeT.setAluguel1(110);
		nomeT.setAluguel2(330);
		nomeT.setAluguel3(800);
		nomeT.setAluguel4(975);
		nomeT.setHotel(new Hotel(1150));
		casas.add(nomeT);
		
		
		comPos = new Posicao(496, 198);
		comp = (Compania) fc.construirCasa("Compania", comPos);
		comp.setPrecoCompania(200);
		comp.setTaxa(50);
		//castel.setNome("Castel Winterfel");
		casas.add(comp);
	
		
		pos = new Posicao(434, 198);
		//Terreno nomeT;
		nomeT = (Terreno) fc.construirCasa("Terreno", pos);
		//nomeT.setNome("");
		nomeT.setGrupo("Tyrell");
		nomeT.setPrecoTerreno(320);
		nomeT.setAluguelTerreno(28);
		nomeT.setAluguel1(150);
		nomeT.setAluguel2(450);
		nomeT.setAluguel3(1000);
		nomeT.setAluguel4(1200);
		nomeT.setHotel(new Hotel(1400));
		casas.add(nomeT);
	
		
		pos = new Posicao(372, 198);
		//Terreno nomeT;
		nomeT = (Terreno) fc.construirCasa("Terreno", pos);
		//nomeT.setNome("");
		nomeT.setGrupo("Tyrell");
		nomeT.setPrecoTerreno(300);
		nomeT.setAluguelTerreno(26);
		nomeT.setAluguel1(130);
		nomeT.setAluguel2(390);
		nomeT.setAluguel3(900);
		nomeT.setAluguel4(1100);
		nomeT.setHotel(new Hotel(1275));
		casas.add(nomeT);
		
		
		comPos = new Posicao(310, 198);
		comp = (Compania) fc.construirCasa("Compania", comPos);
		comp.setPrecoCompania(200);
		comp.setTaxa(50);
		//castel.setNome("Castel Winterfel");
		casas.add(comp);
		
		
		pos = new Posicao(248, 198);
		//Terreno nomeT;
		nomeT = (Terreno) fc.construirCasa("Terreno", pos);
		//nomeT.setNome("");
		nomeT.setGrupo("Tyrell");
		nomeT.setPrecoTerreno(300);
		nomeT.setAluguelTerreno(26);
		nomeT.setAluguel1(130);
		nomeT.setAluguel2(390);
		nomeT.setAluguel3(900);
		nomeT.setAluguel4(1100);
		nomeT.setHotel(new Hotel(1275));
		casas.add(nomeT);
		
		p.x = 186;
		p.y = 198;
		sortRev = (SorteReves) fc.construirCasa("SorteReves", p);
		//castel.setNome("Castel Winterfel");
		casas.add(sortRev);
		
		
		pos = new Posicao(124, 198);
		//Terreno nomeT;
		nomeT = (Terreno) fc.construirCasa("Terreno", pos);
		//nomeT.setNome("");
		nomeT.setGrupo("Martell");
		nomeT.setPrecoTerreno(280);
		nomeT.setAluguelTerreno(24);
		nomeT.setAluguel1(120);
		nomeT.setAluguel2(360);
		nomeT.setAluguel3(850);
		nomeT.setAluguel4(1025);
		nomeT.setHotel(new Hotel(1200));
		casas.add(nomeT);
		
		
		pos = new Posicao(558, 198);
		//Terreno nomeT;
		nomeT = (Terreno) fc.construirCasa("Terreno", pos);
		//nomeT.setNome("");
		nomeT.setGrupo("Martell");
		nomeT.setPrecoTerreno(260);
		nomeT.setAluguelTerreno(22);
		nomeT.setAluguel1(110);
		nomeT.setAluguel2(330);
		nomeT.setAluguel3(800);
		nomeT.setAluguel4(975);
		nomeT.setHotel(new Hotel(1150));
		casas.add(nomeT);
		
		
		return this.casas;
	}
	
	
}
