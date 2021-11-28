package br.senai.sp.jandira.model;

public enum QuantidadesZeradas {
	
	UMA("Uma"),
	DUAS("Duas"),
	TRES("Tr�s"),
	QUATRO("Quatro");
	
	
	private String zerado;
	
	private QuantidadesZeradas(String zerado) {
		this.zerado = zerado;
	}
	
	public String getDescricao() {
		return zerado;
	}



}
