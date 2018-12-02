package casas;

import java.util.ArrayList;

import base.Jogador;

public class Terreno extends CasaTabuleiro{
	private boolean comprado; // titulo
	private int aluguelTerreno;
	private Jogador proprietario;
	private int precoTerreno;
	private int precoCasa;
	private int precoHotel;
	private ArrayList<CasaPropriedade> casas = new ArrayList<CasaPropriedade>();
	private Hotel hotel = new Hotel();

	public void comprarTerreno(Jogador novoProprietario) {
		int novoSaldo = novoProprietario.getSaldo() - this.precoTerreno;
		novoProprietario.setSaldo(novoSaldo);
		this.comprado = true;
		this.proprietario = novoProprietario;
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

}
