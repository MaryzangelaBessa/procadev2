package casas;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Scanner;

import JGamePlay.GameImage;
import JGamePlay.Text;
import base.Jogador;
import base.JogoMain;
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
	private Hotel hotel;
	private Text txtNome;
	private Font font;

	public Terreno(Posicao posicao) {
		super(posicao);
		this.qtd_casas = 0;
		this.font = new Font("Gothic Pixel", Font.TRUETYPE_FONT, 15);
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
		} 
		else if (this.hotel != null) {
			int novoSaldo = jogador.getSaldo() - this.hotel.getAluguelHotel();
			jogador.setSaldo(novoSaldo);
		}
	}

	public void desenhar() {
		this.imagem.draw();
		this.txtNome.draw();
	}


	public void setNome(String nome) {
		int tx = (int) this.imagem.x;
		int ty = (int) this.imagem.y;
		this.txtNome = new Text(nome, tx + 60, ty + 70);
		this.txtNome.setFont(font);
		this.txtNome.setColor(Color.BLACK);
	}

	public void adicionarCasa() {
		if (this.qtd_casas == 4) {
			return;
		}
		this.qtd_casas++;
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
	public void addJogador(Jogador jogador) {
		// TODO Auto-generated method stub

	}

	@Override
	public void executarAcao(Jogador jogador) {
		if(!this.comprado) {
			Scanner enter = new Scanner(System.in);
			System.out.println("Gostaria de comprar este terreno?\n |1| Sim \n |2| Nao" );
			String e = enter.nextLine();
			if(e.equals("1")) {
				this.comprarTerreno(jogador);
				this.compravel = false;
			}
		}else if(this.comprado && jogador != this.proprietario) {
			System.out.println("Pague " + this.aluguelTerreno + " Para " + this.proprietario.getNome());
		this.cobrarAluguel(jogador);
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

}
