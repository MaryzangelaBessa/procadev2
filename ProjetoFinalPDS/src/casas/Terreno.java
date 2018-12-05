package casas;

import java.util.ArrayList;
import java.util.Scanner;

import JGamePlay.GameImage;
import base.Jogador;
import base.JogoMain;

import base.TerrenoMenu;
import iterador.IteradorCasa;

import util.Posicao;

public class Terreno extends CasaTabuleiro {
	private int aluguel1;
	private int aluguel2;
	private int aluguel3;
	private int aluguel4;

	private boolean comprado; // titulo
	private boolean compravel;
	private String grupo;
	private int aluguelTerreno;
	private Jogador proprietario;
	private int precoTerreno;
	private int precoCasa;
	private int precoHotel;
	private int qtd_casas;
	private Hotel hotel = new Hotel();
	private TerrenoMenu terrenoMenu;

	public Terreno(Posicao posicao) {
		super(posicao);
		this.compravel = true;
		this.qtd_casas = 0;
		this.imagem = new GameImage(JogoMain.filepath + "assets/land.png");
		this.imagem.setDimension(125, 125);
		this.imagem.x = posicao.x;
		this.imagem.y = posicao.y;
		this.setLugares();
		this.terrenoMenu = new TerrenoMenu(this);
	}

	public void comprarTerreno(Jogador novoProprietario) {
		int novoSaldo = novoProprietario.getSaldo() - this.precoTerreno;
		novoProprietario.setSaldo(novoSaldo);
		this.comprado = true;
		this.compravel = false;
		this.proprietario = novoProprietario;
		
		ArrayList<Terreno> ter = this.getGrupoTerreno();
		for (Terreno terreno : ter) {
			terreno.setProprietario(novoProprietario);
		}
		
	}
	
	private void setLugares() {
		Posicao p1 = new Posicao(this.imagem.x, this.imagem.y + 35);
		Posicao p2 = new Posicao(this.imagem.x, this.imagem.y + 62);
		Posicao p3 = new Posicao(this.imagem.x, this.imagem.y + 87);
		Posicao p4 = new Posicao(this.imagem.x + 95, this.imagem.y + 35);
		Posicao p5 = new Posicao(this.imagem.x + 95, this.imagem.y + 62);
		Posicao p6 = new Posicao(this.imagem.x + 95, this.imagem.y + 87);
		this.lugaresJogadores.add(p1);
		this.lugaresJogadores.add(p2);
		this.lugaresJogadores.add(p3);
		this.lugaresJogadores.add(p4);
		this.lugaresJogadores.add(p5);
		this.lugaresJogadores.add(p6);
	}

	@Override
	public void addJogador(Jogador jogador) {
		jogador.setPosicaoAtual(this);
		for (int i = 0; i < lugaresJogadores.size(); i++) {
			if(this.lugaresOcupados[i] == null) {
				this.lugaresOcupados[i] = jogador;
				jogador.getPersonagem().x = this.lugaresJogadores.get(i).x;
				jogador.getPersonagem().y = this.lugaresJogadores.get(i).y;
				break;
			}
		}
		
	}

	public void cobrarAluguel(Jogador jogador) {
		if (this.qtd_casas == 0 && this.hotel == null) {
			int novoSaldoJog = jogador.getSaldo() - this.aluguelTerreno;
			jogador.setSaldo(novoSaldoJog);

			int novoSaldoProp = this.proprietario.getSaldo() + this.aluguelTerreno;
			this.proprietario.setSaldo(novoSaldoProp);

		} else if (this.qtd_casas == 1) {
			int novoSaldo = jogador.getSaldo() - aluguel1;
			jogador.setSaldo(novoSaldo);
		} else if (this.qtd_casas == 2) {
			int novoSaldo = jogador.getSaldo() - aluguel2;
			jogador.setSaldo(novoSaldo);
		} else if (this.qtd_casas == 3) {
			int novoSaldo = jogador.getSaldo() - aluguel3;
			jogador.setSaldo(novoSaldo);
		} else if (this.qtd_casas == 4) {
			int novoSaldo = jogador.getSaldo() - aluguel4;
			jogador.setSaldo(novoSaldo);
		} else if (this.hotel != null) {
			int novoSaldo = jogador.getSaldo() - this.hotel.getAluguelHotel();
			jogador.setSaldo(novoSaldo);
		}
	}

	public boolean isCompravel() {
		return compravel;
	}

	public void setCompravel(boolean compravel) {
		this.compravel = compravel;
	}

	public void desenhar() {
		this.imagem.draw();
	}

	public void setNome(String nome) {

	}

	public void adicionarCasa() {
		if (this.qtd_casas == 4) {
			return;
		}
		this.qtd_casas++;
		int newSaldo = this.proprietario.getSaldo() - this.precoCasa;
		this.proprietario.setSaldo(newSaldo);
	}

	public void adicionarHotel() {
		if (this.qtd_casas < 4) {
			return;
		}
		this.qtd_casas = 0;
		this.setHotel(new Hotel());
	}

	public boolean isComprado() {
		return comprado;
	}

	public void setComprado(boolean comprado) {
		this.comprado = comprado;
	}

	public int getAluguelTerreno() {
		return aluguelTerreno;
	}

	public void setAluguelTerreno(int aluguelTerreno) {
		this.aluguelTerreno = aluguelTerreno;
	}

	public Jogador getProprietario() {
		return proprietario;
	}

	public void setProprietario(Jogador proprietario) {
		this.proprietario = proprietario;
	}

	public int getPrecoTerreno() {
		return precoTerreno;
	}

	public void setPrecoTerreno(int precoTerreno) {
		this.precoTerreno = precoTerreno;
	}

	public int getPrecoCasa() {
		return precoCasa;
	}

	public void setPrecoCasa(int precoCasa) {
		this.precoCasa = precoCasa;
	}

	public int getPrecoHotel() {
		return precoHotel;
	}

	public void setPrecoHotel(int precoHotel) {
		this.precoHotel = precoHotel;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Override
	public void executarAcao(Jogador jogador) {
		if (!this.comprado & this.compravel) {
			this.terrenoMenu.desenharBuy();
//			Scanner enter = new Scanner(System.in);
//			System.out.println("Gostaria de comprar este terreno?\n |1| Sim \n |2| Nao");
//			String e = enter.nextLine();
//			if (e.equals("1")) {
//				this.comprarTerreno(jogador);
//				this.compravel = false;
//				ArrayList<Terreno> terrenosAgrupados = getGrupoTerreno();
//				reservarGrupoTerreno(terrenosAgrupados);
//			}
		} else if (!this.comprado & ehDono(jogador)) {
			Scanner enter = new Scanner(System.in);
			System.out.println("Gostaria de comprar este terreno?\n |1| Sim \n |2| Nao");
			String e = enter.nextLine();
			if (e.equals("1")) {
				this.comprarTerreno(jogador);
				this.compravel = false;
			}
		} else if (this.comprado && jogador != this.proprietario) {
			System.out.println("Pague " + this.aluguelTerreno + " Para " + this.proprietario.getNome());
			this.cobrarAluguel(jogador);
		} else if (this.comprado & jogador == this.proprietario) {
			Scanner enter = new Scanner(System.in);
			System.out.println("Gostaria de adicionar uma casa?\n |1| Sim \n |2| Nao");
			String e = enter.nextLine();
			if (e.equals("1")) {
				this.addPropriedade(jogador);
			}
		}
	}

	public void addPropriedade(Jogador jogador) {
		if(ehDonoTudo(jogador) & difrencaPossivel(jogador)) {
			if(this.getQtd_casas() == 4) this.setHotel(new Hotel());
			this.adicionarCasa();
		}
	}
	public boolean difrencaPossivel(Jogador jogador) {
		Terreno maior = this.Max(jogador);
		Terreno menor = this.Min(jogador);
		if(maior.getQtd_casas() - menor.getQtd_casas() > 1) return false; 
		return true;
	}
	
	public boolean ehDonoTudo(Jogador jogador) {
		boolean res = false;
		int terrenos = 0;
		ArrayList<Terreno> agrupamentoTerreno = getGrupoTerreno();
		for (Terreno terreno : agrupamentoTerreno) {
			if (terreno.getProprietario().equals(jogador))
				terrenos++;
		}
		if (terrenos == agrupamentoTerreno.size())
			res = true;
		return res;
	}

	public Terreno Max(Jogador jogador) {
		ArrayList<Terreno> agrupamentoTerreno = getGrupoTerreno();
		Terreno menor = agrupamentoTerreno.get(0);
		for (int i = 0; i < agrupamentoTerreno.size(); i++) {
			if (menor.getQtd_casas() > agrupamentoTerreno.get(i).getQtd_casas()) {
				menor = agrupamentoTerreno.get(i);
			}
		}
		return menor;

	}

	public Terreno Min(Jogador jogador) {
		ArrayList<Terreno> agrupamentoTerreno = getGrupoTerreno();
		Terreno maior = agrupamentoTerreno.get(0);
		for (int i = 0; i < agrupamentoTerreno.size(); i++) {
			if (maior.getQtd_casas() > agrupamentoTerreno.get(i).getQtd_casas()) {
				maior = agrupamentoTerreno.get(i);
			}
		}
		return maior;

	}

	public boolean ehDono(Jogador jogador) {
		
		ArrayList<Terreno> agrupamentoTerreno = getGrupoTerreno();
		for (Terreno terreno : agrupamentoTerreno) {
			if(terreno.getProprietario() == null) return true;
			if (terreno.getProprietario().equals(jogador) & terreno != this)
				return true;
		}
		return false;
	}

	public ArrayList<Terreno> getGrupoTerreno() {

		ArrayList<Terreno> mesmoGrupo = new ArrayList<>();
		IteradorCasa ic = IteradorCasa.getInstance();

		for (CasaTabuleiro casa : ic.getCasas()) {
			if (casa instanceof Terreno) {
				Terreno T = (Terreno) casa;
				if (T.grupo.equals(this.grupo))
					mesmoGrupo.add(T);
			}

		}
		return mesmoGrupo;
	}

	public void reservarGrupoTerreno(ArrayList<Terreno> grupoTerreno) {
		for (Terreno terreno : grupoTerreno) {
			terreno.setCompravel(false);
		}
	}

	public int getAluguel1() {
		return aluguel1;
	}

	public void setAluguel1(int aluguel1) {
		this.aluguel1 = aluguel1;
	}

	public int getAluguel2() {
		return aluguel2;
	}

	public void setAluguel2(int aluguel2) {
		this.aluguel2 = aluguel2;
	}

	public int getAluguel3() {
		return aluguel3;
	}

	public void setAluguel3(int aluguel3) {
		this.aluguel3 = aluguel3;
	}

	public int getAluguel4() {
		return aluguel4;
	}

	public void setAluguel4(int aluguel4) {
		this.aluguel4 = aluguel4;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getQtd_casas() {
		return qtd_casas;
	}

	public void setQtd_casas(int qtd_casas) {
		this.qtd_casas = qtd_casas;
	}

}
