package br.senai.sp.jandira.model;

public enum Zerado {

	SIM("Sim"),
	N�O("N�o");
	
	
	private String zeradoo;
	
	private Zerado(String zerado) {
		this.zeradoo = zerado;
	}
	
	public String getDescricao() {
		return zeradoo;
	}

}
	
	

