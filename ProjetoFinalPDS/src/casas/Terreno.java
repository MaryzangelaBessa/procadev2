package casas;

import java.util.ArrayList;
import java.util.Scanner;

import JGamePlay.GameImage;
import base.Jogador;
import base.JogoMain;
import base.TerrenoMenu;
import util.Posicao;

public class Terreno extends CasaTabuleiro {
	private boolean comprado; // titulo
	private String grupo;
	private int aluguelTerreno;
	private Jogador proprietario;
	private int precoTerreno;
	private int precoCasa;
	private int precoHotel;
	private ArrayList<CasaPropriedade> casas = new ArrayList<CasaPropriedade>();
	private Hotel hotel = new Hotel();
	private TerrenoMenu terrenoMenu;

	public Terreno(Posicao posicao) {
		super(posicao);
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
		this.proprietario = novoProprietario;
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
		if (this.casas.size() == 0 && this.hotel == null) {
			int novoSaldo = jogador.getSaldo() - this.aluguelTerreno;
			jogador.setSaldo(novoSaldo);
		} else if (this.casas.size() == 1) {
			int novoSaldo = jogador.getSaldo() - this.casas.get(0).getAluguel1();
			jogador.setSaldo(novoSaldo);
		} else if (this.casas.size() == 2) {
			int novoSaldo = jogador.getSaldo() - this.casas.get(0).getAluguel2();
			jogador.setSaldo(novoSaldo);
		} else if (this.casas.size() == 3) {
			int novoSaldo = jogador.getSaldo() - this.casas.get(0).getAluguel3();
			jogador.setSaldo(novoSaldo);
		}else if (this.casas.size() == 4) {
			int novoSaldo = jogador.getSaldo() - this.casas.get(0).getAluguel4();
			jogador.setSaldo(novoSaldo);
		}else if (this.hotel != null) {
			int novoSaldo = jogador.getSaldo() - this.hotel.getAluguelHotel();
			jogador.setSaldo(novoSaldo);
		}
	}

	public void desenhar() {
		this.imagem.draw();
	}


	public void setNome(String nome) {

	}

	public void adicionarCasa(CasaPropriedade novaCasa) {
		if (this.casas.size() == 4) {
			return;
		}
		this.casas.add(novaCasa);
	}

	public void adicionarHotel(Hotel hotel) {
		if (this.casas.size() < 4) {
			return;
		}
		for (int i = 0; i < this.casas.size(); i++) {
			this.casas.remove(i);
		}
		this.setHotel(hotel);
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
		if(!this.comprado) {
			this.terrenoMenu.desenharBuy();
//			Scanner enter = new Scanner(System.in);
//			System.out.println("Gostaria de comprar este terreno?\n |1| Sim \n |2| Nao" );
//			String e = enter.nextLine();
//			if(e.equals("1")) this.comprarTerreno(jogador);
		}else if(this.comprado && jogador != this.proprietario) {
			System.out.println("Pague " + this.aluguelTerreno + " Para " + this.proprietario.getNome());
		this.cobrarAluguel(jogador);
		}
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

}
