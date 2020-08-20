package br.com.dh.model;

public enum TipoFuncionario {
	
	FUNCIONARIO (1, "Funcionario"), 
	SUPERVISOR (2, "Supervisor"), 
	GERENTE (3, "Gerente");
	
	private int tipo;
	private String cargo;
	
	private TipoFuncionario(int tipo, String cargo) {
		this.tipo = tipo;
		this.cargo = cargo;
	}

	public int getTipo() {
		return tipo;
	}

	public String getCargo() {
		return cargo;
	}
}
