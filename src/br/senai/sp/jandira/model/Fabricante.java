package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Fabricante {
	
	private String nome;
	private LocalDate dataFunda��o;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDataFunda��o(LocalDate dataFunda��o) {
		this.dataFunda��o = dataFunda��o;
	}
	
	public LocalDate getDataFunda��o() {
		return dataFunda��o;
	}
	
	
}
