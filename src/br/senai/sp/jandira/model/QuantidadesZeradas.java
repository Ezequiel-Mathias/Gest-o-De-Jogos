package br.senai.sp.jandira.model;

public enum QuantidadesZeradas {
	
	Uma("Uma"),
	Duas("Duas"),
	Tr�s("Tr�s"),
	Quatro("Quatro")
;
	
	
	private String zeradoo;
	
	private QuantidadesZeradas(String zerado) {
		this.zeradoo = zerado;
	}
	
	public String getDescricao() {
		return zeradoo;
	}



}
