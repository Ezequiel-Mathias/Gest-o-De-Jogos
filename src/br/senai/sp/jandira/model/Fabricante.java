package br.senai.sp.jandira.model;

public class Fabricante {
	
	private String nome;
	private String local;
	private String numero;
	private String email;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String Fabricantes [] = {" Sony ", " Tencent " , " Nintendo "};

	public String[] getFabricantes() {
		return Fabricantes;
	}

	public void setFabricantes(String[] fabricantes) {
		Fabricantes = fabricantes;
	}
	
	
}
