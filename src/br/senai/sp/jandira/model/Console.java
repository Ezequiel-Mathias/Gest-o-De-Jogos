package br.senai.sp.jandira.model;

public enum Console {
	
	PLAYSTATION4("Playstation 4"),
	XBOX("X box"),
	NINTENDOSWITCH("Nintendo Switch");
	
	private String console;
	
	private Console(String console) {
		this.console = console;
	}
	
	public String getDescricao() {
		return console;
	}

}


