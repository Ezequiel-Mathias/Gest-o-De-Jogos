package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Console;
import br.senai.sp.jandira.model.Fabricante;


public class FabricanteRepository {
	private Console console;
	private Fabricante[] fabricante;
	
	public FabricanteRepository() {
		fabricante = new Fabricante[32];
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
	public Console getconsole() {
		return console;
	}

	public void setconsole(Console console) {
		this.console = console;
	}
}
