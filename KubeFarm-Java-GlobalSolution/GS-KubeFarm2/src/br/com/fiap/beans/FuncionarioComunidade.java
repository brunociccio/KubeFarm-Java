package br.com.fiap.beans;

public class FuncionarioComunidade extends CadastroFuncionario {
	// var
		private String cargo;
		private String comunidade;
		// const vazio
		public FuncionarioComunidade() {
			super();
		}
		// const cheio
		public FuncionarioComunidade(String cargo, String comunidade) {
			super();
			this.cargo = cargo;
			this.comunidade = comunidade;
		}
		// heranca
		public FuncionarioComunidade(String nome, int idade, String cpf, String rg, String cargo, String comunidade) {
			super(nome, idade, cpf, rg);
			this.cargo = cargo;
			this.comunidade = comunidade;
		}
		// setters and getters
		public String getCargo() {
			return cargo;
		}
		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
		public String getComunidade() {
			return comunidade;
		}
		public void setComunidade(String comunidade) {
			this.comunidade = comunidade;
		}
	}
