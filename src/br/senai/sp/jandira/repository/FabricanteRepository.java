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
	public Fabricante listarFabricantes(int posi�ao) {
		return fabricante [posi�ao];
	}
	public Fabricante[] listartodos() {
		return fabricante;
	}
}
