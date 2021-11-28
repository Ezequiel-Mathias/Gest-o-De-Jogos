package br.senai.sp.jandira.model;

public enum Console {
	
	NINTENDOSWITCH("Nintendo Switch"),
	PLAYSTATION4("Playstation 4"),
	XBOX("X box");
	
	private String console;
	
	private Console(String console) {
		this.console = console;
	}
	
	public String getDescricao() {
		return console;
	}

}


