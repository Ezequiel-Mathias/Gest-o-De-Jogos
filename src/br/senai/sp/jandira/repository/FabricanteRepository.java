package br.senai.sp.jandira.repository;

import java.time.LocalDate;
import java.util.Arrays;

import br.senai.sp.jandira.model.Console;
import br.senai.sp.jandira.model.Fabricante;


public class FabricanteRepository {
	
	private Fabricante[] fabricante;
	
	public FabricanteRepository() {
		
		fabricante = new Fabricante[3];
		
		Fabricante Tencent = new Fabricante();
		Tencent.setNome("Tencent");
		Tencent.setDataFundação(LocalDate.of(1946, 5, 7));
		fabricante[0] =  Tencent;
		
		Fabricante Apple = new Fabricante();
		Apple.setNome("Apple");
		Apple.setDataFundação(LocalDate.of(1979, 10, 1));
		fabricante[1] = Apple;
		
		Fabricante Microsoft = new Fabricante();
		Microsoft.setNome("Microsoft");
		Microsoft.setDataFundação(LocalDate.of(1889, 9, 23));
		fabricante[2] = Microsoft;
		
	}
	
	public Fabricante[] getFabricantes() {
		return fabricante;
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
	public int getTamanhoTotal() {
		return fabricante.length;
	}
	public int getIndex(Fabricante fabricante) {
		int getIndex = Arrays.asList(this.fabricante).indexOf(fabricante);
		return getIndex;
	}
	

}
