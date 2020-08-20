package br.com.dh.model;

import java.time.LocalDate;

public class PessoaJuridica extends Funcionario {

	private String cnpj;

	public PessoaJuridica() {

	}

	public PessoaJuridica(int id, String nome, String email, String endereco, String setor, LocalDate dataDeAdmissao,
			LocalDate dataDeDemissao, double salarioBase, String cnpj) {
		super(id, nome, email, endereco, setor, dataDeAdmissao, dataDeDemissao, salarioBase);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [id=" + id + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco
				+ ", setor=" + setor + ", dataDeAdmissao=" + dataDeAdmissao + ", dataDeDemissao=" + dataDeDemissao
				+ ", salarioBase=" + salarioBase + ", cnpj=" + cnpj + "]";
	}
	
}
