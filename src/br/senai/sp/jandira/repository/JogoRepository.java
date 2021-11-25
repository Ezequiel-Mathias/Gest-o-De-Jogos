package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Jogo;

public class JogoRepository {
 
	private Jogo[] jogos;
	
	public JogoRepository() {
		jogos = new Jogo[32];
	}
	public JogoRepository(int quantidadedeJogos) {
		jogos = new Jogo[quantidadedeJogos];
	}
	public void gravar(Jogo jogos , int posicao) {
		this.jogos[posicao] = jogos;
	}
	public Jogo listarjogos(int posiçao) {
		return jogos[posiçao];
	}
	public Jogo[] listarJogos() {
		return jogos;
	}
}
