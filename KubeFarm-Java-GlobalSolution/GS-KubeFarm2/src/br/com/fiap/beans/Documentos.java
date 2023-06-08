package br.com.fiap.beans;

public class Documentos {
	// var
	private String cnpj;
	private String inscricaoEstadual;
	// const vazio
	public Documentos() {
		super();
	}
	// const cheio
	public Documentos(String cnpj, String inscricaoEstadual) {
		super();
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
	}
	// setters and getters
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
}
