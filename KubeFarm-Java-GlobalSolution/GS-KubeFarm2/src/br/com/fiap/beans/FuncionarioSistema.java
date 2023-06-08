package br.com.fiap.beans;

public class FuncionarioSistema extends CadastroFuncionario {
	// var
	private String cargo;
	private int idFuncionario;
	// const vazio
	public FuncionarioSistema() {
		super();
	}
	// const cheio
	public FuncionarioSistema(String cargo, int idFuncionario) {
		super();
		this.cargo = cargo;
		this.idFuncionario = idFuncionario;
	}
	// heranca
	public FuncionarioSistema(String nome, int idade, String cpf, String rg, String cargo, int idFuncionario) {
		super(nome, idade, cpf, rg);
		this.cargo = cargo;
		this.idFuncionario = idFuncionario;
	}
	// setters and getters
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
}