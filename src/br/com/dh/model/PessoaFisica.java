package br.com.dh.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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
	
	// metodos
	@Override
	public String toString() {
		return "PessoaFisica [id=" + id + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco + 
				", setor=" + setor + ", dataDeAdmissao=" + dataDeAdmissao + ", dataDeDemissao=" 
				+ dataDeDemissao + ", salarioBase=" + salarioBase + ", nit=" + nit + ", cpf=" 
				+ cpf + ", cargo=" + cargo.getCargo() + "]";
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
			System.out.println("Suas férias foram aprovadas.");
		}
	}

	@Override
	public void trabalhar() {
		LocalDate diaDeTrabalho = LocalDate.now();
		System.out.println("O funcionário " + this.nome + ", id " + this.id + " trabalhará no dia " + diaDeTrabalho);
	}

	@Override
	public void pedirDemissao() {
		LocalDate diaDeDemissao = LocalDate.now();
		System.out.println(
				"O funcionário " + this.nome + ", id " + this.id + " solicita sua demissao em " + diaDeDemissao);

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
		System.out.println("Os funcionários em ferias nao podem trabalhar");
	}
	
}