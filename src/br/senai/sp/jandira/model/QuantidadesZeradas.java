package br.senai.sp.jandira.model;

public enum QuantidadesZeradas {
	
	Uma("Uma"),
	Duas("Duas"),
	Três("Três"),
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
