package br.com.fiap.beans;

public class Pedido extends CadastroBotanico {
	// var
		private int idPedido;
		private int idBotanico;
		private int qtdItens;
		private int idFuncionario;
	// const vazio
		public Pedido() {
			super();
		}
	// const cheio
		public Pedido(int idPedido, int idBotanico, int qtdItens, int idFuncionario) {
			super();
			this.idPedido = idPedido;
			this.idBotanico = idBotanico;
			this.qtdItens = qtdItens;
			this.idFuncionario = idFuncionario;
		}
	// heranca
		public Pedido(String nomePopular, String nomeCientifico, String categoria, Plantio plantio, Estoque estoque,
			int idPedido, int idBotanico, int qtdItens, int idFuncionario) {
			super(nomePopular, nomeCientifico, categoria, plantio, estoque);
			this.idPedido = idPedido;
			this.idBotanico = idBotanico;
			this.qtdItens = qtdItens;
			this.idFuncionario = idFuncionario;
				}
		// setters and getters
		public int getIdPedido() {
			return idPedido;
		}
		public void setIdPedido(int idPedido) {
			this.idPedido = idPedido;
		}
		public int getIdBotanico() {
			return idBotanico;
		}
		public void setIdBotanico(int idBotanico) {
			this.idBotanico = idBotanico;
		}
		public int getQtdItens() {
			return qtdItens;
		}
		public void setQtdItens(int qtdItens) {
			this.qtdItens = qtdItens;
		}
		public int getIdFuncionario() {
			return idFuncionario;
		}
		public void setIdFuncionario(int idFuncionario) {
			this.idFuncionario = idFuncionario;
		}
	}


