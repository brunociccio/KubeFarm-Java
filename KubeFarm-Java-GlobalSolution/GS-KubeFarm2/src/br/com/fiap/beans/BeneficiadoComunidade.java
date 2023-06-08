package br.com.fiap.beans;

public class BeneficiadoComunidade {
	// var
	private String nomeMorador;
	private int idadeMorador;
	private int qtdDependentes;
	// const vazio
	public BeneficiadoComunidade() {
		super();
	}
	// const cheio
	public BeneficiadoComunidade(String nomeMorador, int idadeMorador, int qtdDependentes) {
		super();
		this.nomeMorador = nomeMorador;
		this.idadeMorador = idadeMorador;
		this.qtdDependentes = qtdDependentes;
	}
	// setters and getters
	public String getNomeMorador() {
		return nomeMorador;
	}
	public void setNomeMorador(String nomeMorador) {
		this.nomeMorador = nomeMorador;
	}
	public int getIdadeMorador() {
		return idadeMorador;
	}
	public void setIdadeMorador(int idadeMorador) {
		this.idadeMorador = idadeMorador;
	}
	public int getQtdDependentes() {
		return qtdDependentes;
	}
	public void setQtdDependentes(int qtdDependentes) {
		this.qtdDependentes = qtdDependentes;
	}
}
