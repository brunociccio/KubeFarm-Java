package br.com.fiap.beans;

public class Contato {
	// var
	private String telefoneComercial;
	private String telefoneCelular;
	private String email;
	// const vazio
	public Contato() {
		super();
	}
	// const cheio
	public Contato(String telefoneComercial, String telefoneCelular, String email) {
		super();
		this.telefoneComercial = telefoneComercial;
		this.telefoneCelular = telefoneCelular;
		this.email = email;
	}
	// setters and getters
	public String getTelefoneComercial() {
		return telefoneComercial;
	}
	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
