package br.senai.sp.jandira.model;

public class Jogo {
	private String titulodojogo;
	private Console console;
	private Zerado zerado;
	private QuantidadesZeradas quantidadaDojogoszerados;
	private String valorestimado;
	private String observaçoes;
	
	public QuantidadesZeradas getquantidadeDojogoszerados(){
		return quantidadaDojogoszerados;
	}
	public void setquantidadeDojogoszerados(QuantidadesZeradas quantidadeZeradas) {
		this.quantidadaDojogoszerados = quantidadeZeradas;
	}
	public Zerado getZerado() {
		return zerado;
	}
	public void setZerado(Zerado zerado) {
		this.zerado = zerado;
	}
	
	public String getTitulodojogo() {
		return titulodojogo;
	}
	public void setTitulodojogo(String titulodojogo) {
		this.titulodojogo = titulodojogo;
	}
	public Console getConsole() {
		return console;
	}
	public void setConsole(Console console) {
		this.console = console;
	}
	public String getValorestimado() {
		return valorestimado;
	}
	public void setValorestimado(String valorestimado) {
		this.valorestimado = valorestimado;
	}
	public String getObservaçoes() {
		return observaçoes;
	}
	public void setObservaçoes(String observaçoes) {
		this.observaçoes = observaçoes;
	}
	
	
	
	

}
