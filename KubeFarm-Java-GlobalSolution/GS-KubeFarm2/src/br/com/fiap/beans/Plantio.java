package br.com.fiap.beans;

public class Plantio extends CadastroBotanico {
	// var
	private String dataPlantio;
	private String dataColheita;
	// const vazio
	public Plantio() {
		super();
	}
	// const cheio
	public Plantio(String dataPlantio, String dataColheita) {
		super();
		this.dataPlantio = dataPlantio;
		this.dataColheita = dataColheita;
	}
	// heranca
	public Plantio(String nomePopular, String nomeCientifico, String categoria, Plantio plantio, Estoque estoque,
			String dataPlantio, String dataColheita) {
		super(nomePopular, nomeCientifico, categoria, plantio, estoque);
		this.dataPlantio = dataPlantio;
		this.dataColheita = dataColheita;
	}
	// setters and getters
	public String getDataPlantio() {
		return dataPlantio;
	}
	public void setDataPlantio(String dataPlantio) {
		this.dataPlantio = dataPlantio;
	}
	public String getDataColheita() {
		return dataColheita;
	}
	public void setDataColheita(String dataColheita) {
		this.dataColheita = dataColheita;
	}
	
}
