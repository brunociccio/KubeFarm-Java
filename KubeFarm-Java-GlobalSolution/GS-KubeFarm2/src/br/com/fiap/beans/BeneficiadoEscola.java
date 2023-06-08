package br.com.fiap.beans;

public class BeneficiadoEscola {
	// var
	private String nomeAluno;
	private int idadeAluno;
	private String escolaridade;
	// const vazio
	public BeneficiadoEscola() {
		super();
	}
	// const cheio
	public BeneficiadoEscola(String nomeAluno, int idadeAluno, String escolaridade) {
		super();
		this.nomeAluno = nomeAluno;
		this.idadeAluno = idadeAluno;
		this.escolaridade = escolaridade;
	}
	// setters and getters
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public int getIdadeAluno() {
		return idadeAluno;
	}
	public void setIdadeAluno(int idadeAluno) {
		this.idadeAluno = idadeAluno;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
}
