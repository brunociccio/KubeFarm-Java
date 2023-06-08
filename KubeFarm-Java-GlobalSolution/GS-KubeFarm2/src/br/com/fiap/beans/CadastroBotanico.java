package br.com.fiap.beans;

public class CadastroBotanico {
	// var
	private String nomePopular;
	private String nomeCientifico;
	private String categoria;
	private Plantio plantio;
	private Estoque estoque;
	// const vazio
	public CadastroBotanico() {
		super();
	}
	// const cheio
	public CadastroBotanico(String nomePopular, String nomeCientifico, String categoria, Plantio plantio,
			Estoque estoque) {
		super();
		this.nomePopular = nomePopular;
		this.nomeCientifico = nomeCientifico;
		this.categoria = categoria;
		this.plantio = plantio;
		this.estoque = estoque;
	// const parcial
	}
	public CadastroBotanico(String nomePopular, String nomeCientifico, String categoria) {
		super();
		this.nomePopular = nomePopular;
		this.nomeCientifico = nomeCientifico;
		this.categoria = categoria;
	}
	// setters and getters
	public String getNomePopular() {
		return nomePopular;
	}
	public void setNomePopular(String nomePopular) {
		this.nomePopular = nomePopular;
	}
	public String getNomeCientifico() {
		return nomeCientifico;
	}
	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Plantio getPlantio() {
		return plantio;
	}
	public void setPlantio(Plantio plantio) {
		this.plantio = plantio;
	}
	public Estoque getEstoque() {
		return estoque;
	}
	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
}
