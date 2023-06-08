package br.com.fiap.beans;

public class Estoque extends CadastroBotanico {
	// var
	private int qtdEstoque;
	private int qtdPlantada;
	private float valor;
	private String validade;
	private String materialUtilizado;
	// const vazio
	public Estoque() {
		super();
	}
	// const cheio
	public Estoque(int qtdEstoque, int qtdPlantada, float valor, String validade, String materialUtilizado) {
		super();
		this.qtdEstoque = qtdEstoque;
		this.qtdPlantada = qtdPlantada;
		this.valor = valor;
		this.validade = validade;
		this.materialUtilizado = materialUtilizado;
	}
	// heranca
	public Estoque(String nomePopular, String nomeCientifico, String categoria, Plantio plantio, Estoque estoque,
			int qtdEstoque, int qtdPlantada, float valor, String validade, String materialUtilizado) {
		super(nomePopular, nomeCientifico, categoria, plantio, estoque);
		this.qtdEstoque = qtdEstoque;
		this.qtdPlantada = qtdPlantada;
		this.valor = valor;
		this.validade = validade;
		this.materialUtilizado = materialUtilizado;
	}
	// setters and getters
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	public int getQtdPlantada() {
		return qtdPlantada;
	}
	public void setQtdPlantada(int qtdPlantada) {
		this.qtdPlantada = qtdPlantada;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public String getMaterialUtilizado() {
		return materialUtilizado;
	}
	public void setMaterialUtilizado(String materialUtilizado) {
		this.materialUtilizado = materialUtilizado;
	}
}