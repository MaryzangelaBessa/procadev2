package casas;

import java.awt.Color;
import java.awt.Font;

import JGamePlay.GameImage;
import JGamePlay.Text;
import atores.Jogador;
import telas.CompaniaMenu;
import telas.ControladorJogo;
import util.Posicao;

public class Compania extends CasaTabuleiro {
	private int taxa;
	private Jogador proprietario;
	private boolean comprado;
	private int precoCompania;
	private String nome;
	private Font fontNome = new Font("Gothic Pixel", Font.TRUETYPE_FONT, 14);
	private Text txtNome;
	private CompaniaMenu companiaMenu;

	public Compania(Posicao posicao) {
		super(posicao);
		this.comprado = false;
		this.imagem = new GameImage(ControladorJogo.filepath + "assets/company.png");
		this.imagem.setDimension(105, 114);
		this.imagem.x = posicao.x;
		this.imagem.y = posicao.y;
		this.setLugares();

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

	public void comprarCompania(Jogador novoProprietario) {
		int novoSaldo = novoProprietario.getSaldo() - this.precoCompania;
		novoProprietario.setSaldo(novoSaldo);
		this.comprado = true;
		this.proprietario = novoProprietario;
	}

	public void cobrarTaxa(Jogador jogador) { // rever
		jogador.setSaldo(jogador.getSaldo() - this.taxa);
		int novoSaldo = this.proprietario.getSaldo();
		novoSaldo += this.taxa;
		this.proprietario.setSaldo(novoSaldo);
	}

	public void executarAcao(Jogador jogador) {
		if (!comprado) {
			boolean escolheu = false;
			while(!escolheu) {
				ControladorJogo.getInstance().showTabuleiro();
				this.companiaMenu.desenharBuy();
				int opcao = this.companiaMenu.obterEscolha();
				if(opcao == 1) {
					System.out.println("Comprou");
					escolheu = true;
				} 
				if(opcao == 2) {
					System.out.println("Passou a vez");
					escolheu = true;
				}
				ControladorJogo.janela.display();
			}
			
			this.companiaMenu.desenharBuy();
		}
		else
			this.cobrarTaxa(jogador);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		int tx = (int) this.imagem.x + 16;
		int ty = (int) this.imagem.y + 20;
		this.txtNome = new Text(this.nome, tx, ty);
		this.txtNome.setFont(fontNome);
		this.txtNome.setColor(Color.WHITE);
		this.companiaMenu = new CompaniaMenu(this);
	}
	
	public void desenhar() {
		this.imagem.draw();
		this.txtNome.draw();
	}

	public int getTaxa() {
		return taxa;
	}

	public void setTaxa(int taxa) {
		this.taxa = taxa;
	}

	public Jogador getProprietario() {
		return proprietario;
	}

	public void setProprietario(Jogador proprietario) {
		this.proprietario = proprietario;
	}

	public boolean isComprado() {
		return comprado;
	}

	public void setComprado(boolean comprado) {
		this.comprado = comprado;
	}

	public int getPrecoCompania() {
		return precoCompania;
	}

	public void setPrecoCompania(int precoCompania) {
		this.precoCompania = precoCompania;
	}

}
