package br.com.fiap.beans;

public class FuncionarioEscola extends CadastroFuncionario {
	// var
	private String cargo;
	private String escola;
	// const vazio
	public FuncionarioEscola() {
		super();
	}
	// const cheio
	public FuncionarioEscola(String cargo, String escola) {
		super();
		this.cargo = cargo;
		this.escola = escola;
	}
	// heranca
	public FuncionarioEscola(String nome, int idade, String cpf, String rg, String cargo, String escola) {
		super(nome, idade, cpf, rg);
		this.cargo = cargo;
		this.escola = escola;
	}
	// setters and getters
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getEscola() {
		return escola;
	}
	public void setEscola(String escola) {
		this.escola = escola;
	}
}
