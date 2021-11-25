package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Fabricante;

public class App {
	public static void main(String[] args) {
		Fabricante nl = new Fabricante();
		
		String vetor[] = nl.getFabricantes();
		
		for (int contador = 0; contador < vetor.length; contador++) {
			System.out.println(vetor[contador]);
		}
	}

}
