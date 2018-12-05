package cartoes;

import java.util.ArrayList;

import casas.IteradorCasa;
import casas.PontoPartida;

public class ConstrutorCartoes {
	private ArrayList<Cartao> cartoes = new ArrayList<Cartao>();
	private FabricaCartoes f = new FabricaCartoes();
	private IteradorCasa ic = IteradorCasa.getInstance();
	
	public ArrayList<Cartao> construirCartoes(){
		CartaoSorte c1 = (CartaoSorte) f.criarCartao("Sorte", "Voce fez acordo com um novo "
				+ "vassalo.");
		c1.setAcaoRecebe(25);
		cartoes.add(c1);
		
		CartaoReves c2 = (CartaoReves) f.criarCartao("Reves", "Voce travou uma batalha para "
				+ "conquistar um castelo mas perdeu varios soldados");
		c2.setAcaoPagar(40);
		cartoes.add(c2);
		
		CartaoReves c3 = (CartaoReves) f.criarCartao("Reves", "Um de seus filhos ficou doente "
				+ "chame um curandeiro.");
		c3.setAcaoPagar(50);
		cartoes.add(c3);
		
		CartaoSorte c4 = (CartaoSorte) f.criarCartao("Sorte", "Houve um assalto a sua loja, mas "
				+ "voce estava assegurado");
		c4.setAcaoRecebe(150);
		cartoes.add(c4);
		
		CartaoReves c5 = (CartaoReves) f.criarCartao("Reves", "Seu clube esta ampliando as piscinas "
				+ "Os socios devem contribuir");
		c5.setAcaoPagar(25);
		cartoes.add(c5);
		
		CartaoReves c6 = (CartaoReves) f.criarCartao("Reves", "Voce acaba de receber a comunicacao"
				+ "do imposto de renda");
		c6.setAcaoPagar(50);
		cartoes.add(c6);
		
		
		CartaoSorte c7 = (CartaoSorte) f.criarCartao("Sorte", "Voce foi promovido a diretor da sua"
				+ " empresa");
		c7.setAcaoRecebe(100);
		cartoes.add(c7);
		
		CartaoReves c8 =(CartaoReves) f.criarCartao("Reves", "Voce e papai outra vez!"
				+ "Despesas da maternidade.");
		c8.setAcaoPagar(100);
		cartoes.add(c8);
		
		CartaoReves c9 = (CartaoReves) f.criarCartao("Reves", "Parabens! Voce convidou seus amigos"
				+ " para comemorar seu aniversario!");
		c9.setAcaoPagar(100);
		cartoes.add(c9);
		
		CartaoSorte c10 = (CartaoSorte) f.criarCartao("Sorte", "Um amigo tinha lhe pedido um "
				+ "emprestimo e esqueceu de devolver. Ele acaba de se lembrar.");
		c10.setAcaoRecebe(80);
		cartoes.add(c10);
		
		CartaoSorte c11 = (CartaoSorte) f.criarCartao("Sorte", "Voce saiu de ferias e se hospedou"
				+ " na casa de um amigo. Voce economizou o hotel");
		c11.setAcaoRecebe(45);
		cartoes.add(c11);
		
		CartaoReves c12 = (CartaoReves) f.criarCartao("Reves", "Voce vai se casar e esta comprando "
				+ "um novo apartemento");
		c12.setAcaoPagar(25);
		cartoes.add(c12);		
		
		CartaoReves c13 = (CartaoReves) f.criarCartao("Reves", "Voce estacionou seu carro em local "
				+ "proibido e entrou na contra mao");
		c13.setAcaoPagar(30);
		cartoes.add(c13);
		
		CartaoReves c14 = (CartaoReves) f.criarCartao("Reves", "Seu medico lhe recomendou repouso "
				+ "num bom hotel de montanha");
		c14.setAcaoPagar(45);
		cartoes.add(c14);
		
		CartaoReves c15 = (CartaoReves) f.criarCartao("Reves", "A geada prejudicou sua plantacao "
				+ "de batatas");
		c15.setAcaoPagar(50);
		cartoes.add(c15);
		
		CartaoSorte c16 = (CartaoSorte) f.criarCartao("Sorte", "Avance ate a muralha e receba 200");
		//PontoPartida casa = new PontoPartida();
		c16.setAcaoMove((PontoPartida) ic.getCasas().get(0));
		cartoes.add(c16);
		
		CartaoSorte c17 = (CartaoSorte) f.criarCartao("Sorte", "Voce trocou sua carroca usada com "
				+ "um amigo e ainda saiu lucrando");
		c17.setAcaoRecebe(50);
		cartoes.add(c17);
		
		CartaoSorte c18 = (CartaoSorte) f.criarCartao("Sorte", "O seu cachorro policial tirou "
				+ "o primeiro premio na exposicao do Kennel Club");
		c18.setAcaoRecebe(100);
		cartoes.add(c18);
		
		CartaoReves c19 = (CartaoReves) f.criarCartao("Reves", "Seus parentes do interior vieram "
				+ "tirar umas ferias na sua casa");
		c19.setAcaoPagar(45);
		cartoes.add(c19);
		
		CartaoSorte c20 = (CartaoSorte) f.criarCartao("Sorte", "Voce jogou na loteria esportiva "
				+ "com um grupo de amigos. Ganharam!");
		c20.setAcaoRecebe(20);
		cartoes.add(c20);
				
		
		CartaoReves c21 = (CartaoReves) f.criarCartao("Reves", "Va para o calabouco sem receber "
				+ "nada, talvez eu lhe faca uma visita");
		//Prisao prisao = new Prisao();
		c21.setAcaoPrender();
		cartoes.add(c21);
		
		
		CartaoReves c22 = (CartaoReves) f.criarCartao("Reves", "Um amigo pediu-lhe um emprestimo "
				+ "Voce nao pode recusar.");
		c22.setAcaoPagar(15);
		cartoes.add(c22);
		
		CartaoSorte c23 = (CartaoSorte) f.criarCartao("Sorte", "Inesperadamente voce recebeu "
				+ "uma heranca que ja estava esquecida");
		c23.setAcaoRecebe(100);
		cartoes.add(c23);
		
		CartaoReves c24 = (CartaoReves) f.criarCartao("Reves", "Voce achou interresante assistir "
				+ "a estreia da temporada de ballet. Compre os ingressos");
		c24.setAcaoPagar(30);
		cartoes.add(c24);
		
		CartaoSorte c25 = (CartaoSorte) f.criarCartao("Sorte", "Voce apostou com os parceiros "
				+ "deste jogo e ganhou receba 50 de cada um");
		c25.setAcaoRecebe(50); // <--------------- DE CADA UM -------------------------
		cartoes.add(c25);
		
		CartaoSorte c26 = (CartaoSorte) f.criarCartao("Sorte", "Saida livre da prisao");
		c26.setAcaoSaiPrisao(); //<--- SAIDA LIVRE DA PRISAO
  		cartoes.add(c26);
		
		CartaoSorte c27 = (CartaoSorte) f.criarCartao("Sorte", "Voce esta com sorte, suas acoes na "
				+ " bolsa estao em alta");
		c27.setAcaoRecebe(200);
		cartoes.add(c27);
		
		CartaoReves c28 = (CartaoReves) f.criarCartao("Reves", "Renove a tempo a licenca de seu "
				+ "altomovel");
		c28.setAcaoPagar(30);
		cartoes.add(c28);
		
		CartaoSorte c29 = (CartaoSorte) f.criarCartao("Sorte", "Voce acaba de receber uma parcela "
				+ "do seu 13 salario");
		c29.setAcaoRecebe(50);
		cartoes.add(c29);
		
		CartaoSorte c30 = (CartaoSorte) f.criarCartao("Sorte", "Voce tirou o primeiro lugar no "
				+ "torneio de tenis do seu clube. Parabens!");
		c30.setAcaoRecebe(100);
		cartoes.add(c30);
		
		
		return this.cartoes;
	}
}
