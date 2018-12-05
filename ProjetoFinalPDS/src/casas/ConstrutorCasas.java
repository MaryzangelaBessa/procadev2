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
		castleBlack.setPrecoTerreno(100);
		castleBlack.setAluguelTerreno(6);
		castleBlack.setAluguel1(30);
		castleBlack.setAluguel2(90);
		castleBlack.setAluguel3(270);
		castleBlack.setAluguel4(400);
		castleBlack.setHotel(new Hotel(500));
		castleBlack.setGrupo("Stark");
		
		casas.add(castleBlack);
		
		
		
		Posicao SR = new Posicao(124, 12);
		SorteReves sortRev;
		sortRev = (SorteReves) fc.construirCasa("SorteReves", SR);
		casas.add(sortRev);
		
		p.x = 186;
		p.y = 12;
		Terreno castel;
		castel = (Terreno) fc.construirCasa("Terreno", p);
		castel.setNome("Castel Boldon");
		castel.setGrupo("Stark");
		castel.setPrecoTerreno(60);
		castel.setAluguelTerreno(2);
		casas.add(castel);
		
		p.x = 248;
		p.y = 12;
		castel = (Terreno) fc.construirCasa("Terreno", p);
		castel.setNome("Castel Winterfel");
		castel.setGrupo("Stark");
		castel.setPrecoTerreno(60);
		castel.setAluguelTerreno(4);
		casas.add(castel);
		
		
		p.x = 310;
		p.y = 12;
		comp = (Compania) fc.construirCasa("Compania", p);
		comp.setPrecoCompania(200);
		comp.setTaxa(50);
		casas.add(comp);
		
		p.x = 372;
		p.y = 12;
		castel = (Terreno) fc.construirCasa("Terreno", p);
		castel.setNome("");
		castel.setGrupo("Greyjoy");
		castel.setPrecoTerreno(240);
		castel.setAluguelTerreno(20);
		casas.add(castel);
		
		p.x = 434;
		p.y = 12;
		comp = (Compania) fc.construirCasa("Compania", p);
		comp.setPrecoCompania(-200);
		comp.setTaxa(50);
		casas.add(comp);
		
		p.x = 496;
		p.y = 12;
		castel = (Terreno) fc.construirCasa("Terreno", p);
		castel.setGrupo("Greyjoy");
		castel.setPrecoTerreno(220);
		castel.setAluguelTerreno(18);
		//castel.setNome("Castel Winterfel");
		casas.add(castel);
		
		p.x = 558;
		p.y = 12;
		castel = (Terreno) fc.construirCasa("Terreno", p);
		castel.setGrupo("GreyJoy");
		//castel.setNome("Castel Winterfel");
		castel.setPrecoTerreno(220);
		castel.setAluguelTerreno(18);
		casas.add(castel);
		
		p.x = 620;
		p.y = 12;
		pris = (Prisao) fc.construirCasa("Prisao", p);
		casas.add(pris);
		
		// <-------------- SEGUNDA LINHA
		
		p.x = 620;
		p.y = 74;
		castel = (Terreno) fc.construirCasa("Terreno", p);
		castel.setGrupo("Ayrrin");
		castel.setPrecoTerreno(200);
		castel.setAluguelTerreno(16);
		//castel.setNome("Castel Winterfel");
		casas.add(castel);
		
		p.x = 558;
		p.y = 74;
		sortRev = (SorteReves) fc.construirCasa("SorteReves", p);
		//castel.setNome("Castel Winterfel");
		casas.add(sortRev);
		
		p.x = 496;
		p.y = 74;
		castel = (Terreno) fc.construirCasa("Terreno", p);
		castel.setGrupo("Ayrrin");
		castel.setPrecoTerreno(180);
		castel.setAluguelTerreno(14);
		//castel.setNome("Castel Winterfel");
		casas.add(castel);
		
		p.x = 434;
		p.y = 74;
		castel = (Terreno) fc.construirCasa("Terreno", p);
		castel.setGrupo("Ayrrin");
		castel.setPrecoTerreno(180);
		castel.setAluguelTerreno(14);
		//castel.setNome("Castel Winterfel");
		casas.add(castel);
		
		p.x = 372;
		p.y = 74;
		comp = (Compania) fc.construirCasa("Compania", p);
		comp.setPrecoCompania(150);
		comp.setTaxa(40);
		//castel.setNome("Castel Winterfel");
		casas.add(comp);
		
		
		p.x = 310;
		p.y = 74;
		sortRev = (SorteReves) fc.construirCasa("SorteReves", p);
		//castel.setNome("Castel Winterfel");
		casas.add(sortRev);
		
		p.x = 248;
		p.y = 74;
		castel = (Terreno) fc.construirCasa("Terreno", p);
		castel.setGrupo("Targaryen");
		castel.setPrecoTerreno(350);
		castel.setAluguelTerreno(35);
		//castel.setNome("Castel Winterfel");
		casas.add(castel);
		
		p.x = 186;
		p.y = 74;
		lc = (LucrosDividendos) fc.construirCasa("LucrosDividendos", p);
		//castel.setNome("Castel Winterfel");
		casas.add(lc);
		
		p.x = 124;
		p.y = 74;
		castel = (Terreno) fc.construirCasa("Terreno", p);
		castel.setGrupo("Targaryen");
		castel.setPrecoTerreno(400);
		castel.setAluguelTerreno(50);
		//castel.setNome("Castel Winterfel");
		casas.add(castel);
		
		p.x = 62;
		p.y = 74;
		pl = (ParadaLivre) fc.construirCasa("ParadaLivre", p);
		//castel.setNome("Castel Winterfel");
		casas.add(pl);
		
		// <------- TERCEIRA LINHA
		
		p.x = 62;
		p.y = 136;
		castel = (Terreno) fc.construirCasa("Terreno", p);
		castel.setGrupo("");
		castel.setGrupo("Lennister");
		castel.setPrecoTerreno(120);
		castel.setAluguelTerreno(8);
		//castel.setNome("Castel Winterfel");
		casas.add(castel);
		
		p.x = 124;
		p.y = 136;
		sortRev = (SorteReves) fc.construirCasa("SorteReves", p);
		
		//castel.setNome("Castel Winterfel");
		casas.add(sortRev);
		
		p.x = 186;
		p.y = 136;
		castel = (Terreno) fc.construirCasa("Terreno", p);
		castel.setGrupo("Lennster");
		castel.setPrecoTerreno(100);
		castel.setAluguelTerreno(6);
		//castel.setNome("Castel Winterfel");
		casas.add(castel);
		
		p.x = 248;
		p.y = 136;
		ip = (ImpostoRenda) fc.construirCasa("ImpostoRenda", p);
		//castel.setNome("Castel Winterfel");
		casas.add(ip);
		
		
		p.x = 310;
		p.y = 136;
		comp = (Compania) fc.construirCasa("Compania", p);
		comp.setPrecoCompania(150);
		comp.setTaxa(40);
		//castel.setNome("Castel Winterfel");
		casas.add(comp);
		
		p.x = 372;
		p.y = 136;
		castel = (Terreno) fc.construirCasa("Terreno", p);
		castel.setGrupo("Baratheon");
		castel.setPrecoTerreno(160);
		castel.setAluguelTerreno(12);
		//castel.setNome("Castel Winterfel");
		casas.add(castel);
		
		p.x = 434;
		p.y = 136;
		sortRev = (SorteReves) fc.construirCasa("SorteReves", p);
		//castel.setNome("Castel Winterfel");
		casas.add(sortRev);
		
		
		p.x = 496;
		p.y = 136;
		castel = (Terreno) fc.construirCasa("Terreno", p);
		castel.setGrupo("Baratheon");
		castel.setPrecoTerreno(140);
		castel.setAluguelTerreno(10);
		//castel.setNome("Castel Winterfel");
		casas.add(castel);
		
		
		p.x = 558;
		p.y = 136;
		castel = (Terreno) fc.construirCasa("Terreno", p);
		castel.setGrupo("Baratheon");
		castel.setPrecoTerreno(140);
		castel.setAluguelTerreno(10);
		//castel.setNome("Castel Winterfel");
		casas.add(castel);
		
		
		p.x = 620;
		p.y = 136;
		vp = (VaPrisao) fc.construirCasa("VaPrisao", p);
		//castel.setNome("Castel Winterfel");
		casas.add(vp);
		
		
		// <---- QUARTA LINHA
		
		p.x = 558;
		p.y = 198;
		castel = (Terreno) fc.construirCasa("Terreno", p);
		castel.setGrupo("tyrell");
		castel.setPrecoTerreno(260);
		castel.setAluguelTerreno(22);
		//castel.setNome("Castel Winterfel");
		casas.add(castel);
		
		
		p.x = 496;
		p.y = 198;
		comp = (Compania) fc.construirCasa("Compania", p);
		comp.setPrecoCompania(200);
		comp.setTaxa(50);
		//castel.setNome("Castel Winterfel");
		casas.add(comp);
		
		p.x = 434;
		p.y = 198;
		castel = (Terreno) fc.construirCasa("Terreno", p);
		castel.setGrupo("tyrell");
		castel.setPrecoTerreno(320);
		castel.setAluguelTerreno(28);
		//castel.setNome("Castel Winterfel");
		casas.add(castel);
		
		p.x = 372;
		p.y = 198;
		castel = (Terreno) fc.construirCasa("Terreno", p);
		castel.setGrupo("tyrell");
		castel.setPrecoTerreno(300);
		castel.setAluguelTerreno(26);
		//castel.setNome("Castel Winterfel");
		casas.add(castel);
		
		p.x = 310;
		p.y = 198;
		comp = (Compania) fc.construirCasa("Compania", p);
		comp.setPrecoCompania(200);
		comp.setTaxa(50);
		//castel.setNome("Castel Winterfel");
		casas.add(comp);
		
		p.x = 248;
		p.y = 198;
		castel = (Terreno) fc.construirCasa("Terreno", p);
		castel.setGrupo("tyrell");
		castel.setPrecoTerreno(300);
		castel.setAluguelTerreno(26);
		//castel.setNome("Castel Winterfel");
		casas.add(castel);
		
		p.x = 186;
		p.y = 198;
		sortRev = (SorteReves) fc.construirCasa("SorteReves", p);
		//castel.setNome("Castel Winterfel");
		casas.add(sortRev);
		
		p.x = 124;
		p.y = 198;
		castel = (Terreno) fc.construirCasa("Terreno", p);
		castel.setGrupo("Martell");
		castel.setPrecoTerreno(280);
		castel.setAluguelTerreno(24);
		//castel.setNome("Castel Winterfel");
		casas.add(castel);
		
		p.x = 558;
		p.y = 198;
		castel = (Terreno) fc.construirCasa("Terreno", p);
		castel.setGrupo("Martell");
		castel.setPrecoTerreno(260);
		castel.setAluguelTerreno(22);
		//castel.setNome("Castel Winterfel");
		casas.add(castel);
		
		
		return this.casas;
	}
	
	
}
