package casas;

import java.util.ArrayList;
import java.util.Scanner;

import JGamePlay.GameImage;
import base.Jogador;
import base.JogoMain;
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

	public Terreno(Posicao posicao) {
		super(posicao);
		this.imagem = new GameImage(JogoMain.filepath + "assets/land.png");
		this.imagem.setDimension(125, 125);
		this.imagem.x = posicao.x;
		this.imagem.y = posicao.y;
	}

	public void comprarTerreno(Jogador novoProprietario) {
		int novoSaldo = novoProprietario.getSaldo() - this.precoTerreno;
		novoProprietario.setSaldo(novoSaldo);
		this.comprado = true;
		this.proprietario = novoProprietario;
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
	public void addJogador(Jogador jogador) {
		// TODO Auto-generated method stub

	}

	@Override
	public void executarAcao(Jogador jogador) {
		if(!this.comprado) {
			Scanner enter = new Scanner(System.in);
			System.out.println("Gostaria de comprar este terreno?\n |1| Sim \n |2| Nao" );
			String e = enter.nextLine();
			if(e.equals("1")) this.comprarTerreno(jogador);
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
