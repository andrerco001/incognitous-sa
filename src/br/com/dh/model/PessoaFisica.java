package br.com.dh.model;

import java.time.LocalDate;

public class PessoaFisica extends Funcionario {
	
	private int nit;
	private String cpf;
	private TipoFuncionario cargo;
	
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String nome, String email, String endereco, String setor, LocalDate dataDeAdmissao,
			LocalDate dataDeDemissao, double salarioBase, int nit, String cpf, TipoFuncionario cargo) {
		super(nome, email, endereco, setor, dataDeAdmissao, dataDeDemissao, salarioBase);
		this.nit = nit;
		this.cpf = cpf;
		this.cargo = cargo;
	}

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

	@Override
	public String toString() {
		return "PessoaFisica [nit=" + nit + ", cpf=" + cpf + ", cargo=" + cargo.getCargo() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + nit;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaFisica other = (PessoaFisica) obj;
		if (nit != other.nit)
			return false;
		return true;
	}

}
