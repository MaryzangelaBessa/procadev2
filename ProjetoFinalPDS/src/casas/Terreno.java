package casas;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import JGamePlay.GameImage;
import JGamePlay.Text;
import base.Jogador;
import base.JogoMain;
import util.Posicao;

public class Terreno extends CasaTabuleiro{
	private boolean comprado; // titulo
	private int aluguelTerreno;
	private Jogador proprietario;
	private int precoTerreno;
	private int precoCasa;
	private int precoHotel;
	private ArrayList<CasaPropriedade> casas = new ArrayList<CasaPropriedade>();
	private Hotel hotel = new Hotel();
	private Text txtNome;
	private Font font;
	
	public Terreno(Posicao posicao) {
		super(posicao);
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

	public void setNome(String nome) {
		int tx = (int) this.imagem.x;
		int ty = (int) this.imagem.y;
		this.txtNome = new Text(nome, tx + 60, ty + 70);
		this.txtNome.setFont(font);
		this.txtNome.setColor(Color.BLACK);
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

}
