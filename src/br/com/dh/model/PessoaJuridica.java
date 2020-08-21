package br.com.dh.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PessoaJuridica extends Funcionario {

	// atributos
	private String cnpj;

	// metodos construtores
	public PessoaJuridica() {

	}

	public PessoaJuridica(int id, String nome, String email, String endereco, String setor, LocalDate dataDeAdmissao,
			LocalDate dataDeDemissao, double salarioBase, String cnpj) {
		super(id, nome, email, endereco, setor, dataDeAdmissao, dataDeDemissao, salarioBase);
		this.cnpj = cnpj;
	}

	// metodos getters e setters
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	// metodos
	@Override
	public String toString() {
		return "PessoaJuridica [id=" + id + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco
				+ ", setor=" + setor + ", dataDeAdmissao=" + dataDeAdmissao + ", dataDeDemissao=" + dataDeDemissao
				+ ", salarioBase=" + salarioBase + ", cnpj=" + cnpj + "]";
	}

	@Override
	public void consultarContrachque() {
		System.out.println("################ Contra-cheque ################");
		System.out.println("Funcionario [id=" + id + ", nome=" + nome + ", setor=" + setor + ", dataDeAdmissao="
				+ dataDeAdmissao + ", dataDeDemissao=" + dataDeDemissao + ", salarioBase=" + salarioBase + "]");
		System.out.println("################################################");
	}

	@Override
	public void requisitarFerias() {
		LocalDate dataAtual = LocalDate.now();

		if (ChronoUnit.MONTHS.between(dataDeAdmissao, dataAtual) >= 11) {
			System.out.println("Suas ferias foram aprovadas.");
		}
	}

	@Override
	public void trabalhar() {
		LocalDate diaDeTrabalho = LocalDate.now();
		System.out.println("O funcionario " + this.nome + ", id " + this.id + " trabalhara no dia " + diaDeTrabalho);
	}

	@Override
	public void pedirDemissao() {
		LocalDate diaDeDemissao = LocalDate.now();
		System.out.println(
				"O funcionario " + this.nome + ", id " + this.id + " solicita sua demissao em " + diaDeDemissao);

		this.dataDeDemissao = diaDeDemissao;
	}

	@Override
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

	@Override
	public void funcionarioEmFeriasNaoPodeTrabalhar() {
		System.out.println("Os funcionarios em ferias nao podem trabalhar");
	}
}