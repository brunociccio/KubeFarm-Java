package br.com.fiap.beans;

public class Comunidade extends Cadastro {
	// var
	private int qtdMoradores;
	private float tempoDeComunidade;
	private BeneficiadoComunidade beneficiadoComunidade;
	// const vazio
	public Comunidade() {
		super();
	}
	// const cheio
	public Comunidade(int qtdMoradores, float tempoDeComunidade, BeneficiadoComunidade beneficiadoComunidade) {
		super();
		this.qtdMoradores = qtdMoradores;
		this.tempoDeComunidade = tempoDeComunidade;
		this.beneficiadoComunidade = beneficiadoComunidade;
	}
	// const parcial
	public Comunidade(int qtdMoradores, float tempoDeComunidade) {
		super();
		this.qtdMoradores = qtdMoradores;
		this.tempoDeComunidade = tempoDeComunidade;
	}
	// heranca
		public Comunidade(Documentos documenos, Endereco endereco, Contato contato, String razaoSocial, String nomeFantasia,
				int qtdMoradores, float tempoDeComunidade, BeneficiadoComunidade beneficiadoComunidade) {
			super(documenos, endereco, contato, razaoSocial, nomeFantasia);
			this.qtdMoradores = qtdMoradores;
			this.tempoDeComunidade = tempoDeComunidade;
			this.beneficiadoComunidade = beneficiadoComunidade;
		}
	// setters and getters
	public int getQtdMoradores() {
		return qtdMoradores;
	}
	public void setQtdMoradores(int qtdMoradores) {
		this.qtdMoradores = qtdMoradores;
	}
	public float getTempoDeComunidade() {
		return tempoDeComunidade;
	}
	public void setTempoDeComunidade(float tempoDeComunidade) {
		this.tempoDeComunidade = tempoDeComunidade;
	}
	public BeneficiadoComunidade getBeneficiadoComunidade() {
		return beneficiadoComunidade;
	}
	public void setBeneficiadoComunidade(BeneficiadoComunidade beneficiadoComunidade) {
		this.beneficiadoComunidade = beneficiadoComunidade;
	}

}
