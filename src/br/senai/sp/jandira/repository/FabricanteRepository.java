package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Fabricante;

public class FabricanteRepository {
	
	private Fabricante[] fabricante;
	
	public FabricanteRepository() {
		fabricante = new Fabricante[10];
	}
	public FabricanteRepository(int quantidadedefabricantes) {
		fabricante = new Fabricante[quantidadedefabricantes];
	}
	public void gravar(Fabricante fabricantes, int posicao) {
		fabricante[posicao] = fabricantes;
	
	}
	public Fabricante listarFabricantes(int posiçao) {
		return fabricante [posiçao];
	}
	public Fabricante[] listartodos() {
		return fabricante;
	}
}
