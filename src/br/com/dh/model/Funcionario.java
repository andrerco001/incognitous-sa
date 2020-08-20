package br.com.dh.model;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
	
	private String setor;
	private LocalDate dataDeAdmissao;
	private LocalDate dataDeDemissao;
	private double salarioBase;
	
	public Funcionario() {
	
	}
	
	public Funcionario(String nome, String email, String endereco, String setor, LocalDate dataDeAdmissao, LocalDate dataDeDemissao, double salarioBase) {
		super(nome, email, endereco);
		this.setor = setor;
		this.dataDeAdmissao = dataDeAdmissao;
		this.dataDeDemissao = dataDeDemissao;
		this.salarioBase = salarioBase;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public LocalDate getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}

	public LocalDate getDataDeDemissao() {
		return dataDeDemissao;
	}

	public void setDataDeDemissao(LocalDate dataDeDemissao) {
		this.dataDeDemissao = dataDeDemissao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public String toString() {
		return "Funcionario [setor=" + setor + ", dataDeAdmissao=" + dataDeAdmissao + ", dataDeDemissao="
				+ dataDeDemissao + ", salarioBase=" + salarioBase + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((setor == null) ? 0 : setor.hashCode());
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
		Funcionario other = (Funcionario) obj;
		if (setor == null) {
			if (other.setor != null)
				return false;
		} else if (!setor.equals(other.setor))
			return false;
		return true;
	}

}
