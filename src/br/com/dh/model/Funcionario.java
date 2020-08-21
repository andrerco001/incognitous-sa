package br.com.dh.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Funcionario {

	// atributos
	protected int id;
	protected String nome;
	protected String email;
	protected String endereco;
	protected String setor;
	protected LocalDate dataDeAdmissao;
	protected LocalDate dataDeDemissao;
	protected double salarioBase;

	// métodos construtores
	public Funcionario() {

	}

	public Funcionario(int id, String nome, String email, String endereco, String setor, LocalDate dataDeAdmissao,
			LocalDate dataDeDemissao, double salarioBase) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.setor = setor;
		this.dataDeAdmissao = dataDeAdmissao;
		this.dataDeDemissao = dataDeDemissao;
		this.salarioBase = salarioBase;
	}

	// métodos getters e setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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

	// métodos
	public void consultarContrachque() {

		System.out.println("################ Contra-cheque ################");
		System.out.println("Funcionario [id=" + id + ", nome=" + nome + ", setor=" + setor + ", dataDeAdmissao="
				+ dataDeAdmissao + ", dataDeDemissao=" + dataDeDemissao + ", salarioBase=" + salarioBase + "]");
		System.out.println("################################################");
	}

	public void requisitarFerias() {

		LocalDate dataAtual = LocalDate.now();

		if (ChronoUnit.MONTHS.between(dataDeAdmissao, dataAtual) >= 11) {
			System.out.println("Suas férias foram aprovadas.");
		}

	}

	public void trabalhar() {

		LocalDate diaDeTrabalho = LocalDate.now();
		System.out.println("O funcionário " + this.nome + ", id " + this.id + " trabalhará no dia " + diaDeTrabalho);
	}

	public void pedirDemissao() {

		LocalDate diaDeDemissao = LocalDate.now();
		System.out.println(
				"O funcionário " + this.nome + ", id " + this.id + " solicita sua demissao em " + diaDeDemissao);

		this.dataDeDemissao = diaDeDemissao;
	}

	public void solicitarAumento() {

		int resposta = (int) Math.floor(Math.random() * 10);

		if (resposta % 2 == 0) {
			System.out.println("O aumento salarial solicitado pelo funcionario " + this.nome + ", id " + this.id
					+ " foi aprovado.");
		} else {
			System.out.println(
					"O aumento salarial solicitado pelo funcionario " + this.nome + ", id " + this.id + " foi negado.");
		}
	}

	public void funcionarioEmFeriasNaoPodeTrabalhar() {

		System.out.println("Os funcionários em férias não podem trabalhar");
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco + ", setor="
				+ setor + ", dataDeAdmissao=" + dataDeAdmissao + ", dataDeDemissao=" + dataDeDemissao + ", salarioBase="
				+ salarioBase + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (id != other.id)
			return false;
		return true;
	}

}