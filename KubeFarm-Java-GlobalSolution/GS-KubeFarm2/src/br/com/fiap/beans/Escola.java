package br.com.fiap.beans;

public class Escola extends Cadastro {
	// var
	private int qtdAlunos;
	private String categoriaEscola;
	private String nivelEscolar;
	private BeneficiadoEscola beneficiadoEscola;
	// const vazio
	public Escola() {
		super();
	}
	// const cheio
	public Escola(int qtdAlunos, String categoriaEscola, String nivelEscolar, BeneficiadoEscola beneficiadoEscola) {
		super();
		this.qtdAlunos = qtdAlunos;
		this.categoriaEscola = categoriaEscola;
		this.nivelEscolar = nivelEscolar;
		this.beneficiadoEscola = beneficiadoEscola;
	}
	// parcial
	public Escola(int qtdAlunos, String categoriaEscola, String nivelEscolar) {
		super();
		this.qtdAlunos = qtdAlunos;
		this.categoriaEscola = categoriaEscola;
		this.nivelEscolar = nivelEscolar;
	}
	// heranca
		public Escola(Documentos documenos, Endereco endereco, Contato contato, String razaoSocial, String nomeFantasia,
				int qtdAlunos, String categoriaEscola, String nivelEscolar, BeneficiadoEscola beneficiadoEscola) {
			super(documenos, endereco, contato, razaoSocial, nomeFantasia);
			this.qtdAlunos = qtdAlunos;
			this.categoriaEscola = categoriaEscola;
			this.nivelEscolar = nivelEscolar;
			this.beneficiadoEscola = beneficiadoEscola;
		}
	// setters and getters
	public int getQtdAlunos() {
		return qtdAlunos;
	}
	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}
	public String getCategoriaEscola() {
		return categoriaEscola;
	}
	public void setCategoriaEscola(String categoriaEscola) {
		this.categoriaEscola = categoriaEscola;
	}
	public String getNivelEscolar() {
		return nivelEscolar;
	}
	public void setNivelEscolar(String nivelEscolar) {
		this.nivelEscolar = nivelEscolar;
	}
	public BeneficiadoEscola getBeneficiadoEscola() {
		return beneficiadoEscola;
	}
	public void setBeneficiadoEscola(BeneficiadoEscola beneficiadoEscola) {
		this.beneficiadoEscola = beneficiadoEscola;
	}
	
}
