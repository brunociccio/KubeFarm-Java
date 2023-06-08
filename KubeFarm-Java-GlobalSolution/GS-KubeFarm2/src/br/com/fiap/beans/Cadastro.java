package br.com.fiap.beans;

public class Cadastro {
	// var
	private Documentos documentos;
	private Endereco endereco;
	private Contato contato;
	private String razaoSocial;
	private String nomeFantasia;
	// const vazio
	public Cadastro() {
		super();
	}
	// const cheio
	public Cadastro(Documentos documentos, Endereco endereco, Contato contato, String razaoSocial, String nomeFantasia) {
		super();
		this.documentos = documentos;
		this.endereco = endereco;
		this.contato = contato;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
	}
	// const parcial
	public Cadastro(String razaoSocial, String nomeFantasia) {
		super();
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
	}
	// setters and getters
	public Documentos getDocumentos() {
		return documentos;
	}
	public void setDocumentos(Documentos documentos) {
		this.documentos = documentos;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
}
