package br.senai.sp.jandira.model;

public class Jogo {
	private String titulodojogo;
	private Console console;
	private Zerado zerado;
	private QuantidadesZeradas quantidadaDojogoszerados;
	private String valorestimado;
	private String observa�oes;
	
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
	public String getObserva�oes() {
		return observa�oes;
	}
	public void setObserva�oes(String observa�oes) {
		this.observa�oes = observa�oes;
	}
	
	
	
	

}
