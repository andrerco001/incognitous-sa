package br.com.dh.model;

import java.time.LocalDate;

public class PessoaFisica extends Funcionario {
	
	// atributos
	private int nit;
	private String cpf;
	private TipoFuncionario cargo;
	
	// métodos construtores
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(int id, String nome, String email, String endereco, String setor, LocalDate dataDeAdmissao,
			LocalDate dataDeDemissao, double salarioBase, int nit, String cpf, TipoFuncionario cargo) {
		super(id, nome, email, endereco, setor, dataDeAdmissao, dataDeDemissao, salarioBase);
		this.nit = nit;
		this.cpf = cpf;
		this.cargo = cargo;
	}

	// métodos getters e setters
	public int getNit() {
		return nit;
	}

	public void setNit(int nit) {
		this.nit = nit;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public TipoFuncionario getCargo() {
		return cargo;
	}

	public void setCargo(TipoFuncionario cargo) {
		this.cargo = cargo;
	}
	
	// métodos
	@Override
	public String toString() {
		return "PessoaFisica [id=" + id + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco + 
				", setor=" + setor + ", dataDeAdmissao=" + dataDeAdmissao + ", dataDeDemissao=" 
				+ dataDeDemissao + ", salarioBase=" + salarioBase + ", nit=" + nit + ", cpf=" 
				+ cpf + ", cargo=" + cargo.getCargo() + "]";
	}
	
}
