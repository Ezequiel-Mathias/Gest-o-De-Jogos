package br.senai.sp.jandira.model;

public enum Zerado {

	SIM("Sim"),
	NÃO("Não");
	
	
	private String zeradoo;
	
	private Zerado(String zerado) {
		this.zeradoo = zerado;
	}
	
	public String getDescricao() {
		return zeradoo;
	}

}
	
	

