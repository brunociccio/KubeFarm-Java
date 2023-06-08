package br.com.fiap.beans;

public class CadastroFuncionario {
	// var
	private String nome;
	private int idade;
	private String cpf;
	private String rg;
	private FuncionarioEscola funcionarioEscola;
	private FuncionarioComunidade funcionarioComunidade;
	private FuncionarioSistema funcionarioSistema;
	// const vazio
	public CadastroFuncionario() {
		super();
	}
	// const cheio
	public CadastroFuncionario(String nome, int idade, String cpf, String rg, FuncionarioEscola funcionarioEscola, FuncionarioComunidade funcionarioComunidade, FuncionarioSistema funcionarioSistema) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.rg = rg;
		this.funcionarioEscola = funcionarioEscola;
		this.funcionarioComunidade = funcionarioComunidade;
		this.funcionarioSistema = funcionarioSistema;
	}
	// const parcial
	public CadastroFuncionario(String nome, int idade, String cpf, String rg) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.rg = rg;
	}
	// setters and getters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public FuncionarioEscola getFuncionarioEscola() {
		return funcionarioEscola;
	}
	public void setFuncionarioEscola(FuncionarioEscola funcionarioEscola) {
		this.funcionarioEscola = funcionarioEscola;
	}
	public FuncionarioComunidade getFuncionarioComunidade() {
		return funcionarioComunidade;
	}
	public void setFuncionarioComunidade(FuncionarioComunidade funcionarioComunidade) {
		this.funcionarioComunidade = funcionarioComunidade;
	}
	public FuncionarioSistema getFuncionarioSistema() {
		return funcionarioSistema;
	}
	public void setFuncionarioSistema(FuncionarioSistema funcionarioSistema) {
		this.funcionarioSistema = funcionarioSistema;
	}
	
}
