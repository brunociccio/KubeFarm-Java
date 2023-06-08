package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.CadastroBotanico;
import br.com.fiap.beans.Estoque;
import br.com.fiap.beans.Pedido;
import br.com.fiap.beans.Plantio;

public class CadastroPedido {
	// método static
		static String texto(String j) {
			return JOptionPane.showInputDialog(j);
		}
		static int inteiro(String j) {
			return Integer.parseInt(JOptionPane.showInputDialog(j));
		}
		static double decimal(String j) {
			return Double.parseDouble(JOptionPane.showInputDialog(j));
		}
		static float racional(String j) {
			return Float.parseFloat(JOptionPane.showInputDialog(j));
		}

		public static void main(String[] args) {
			// instanciar objetos
			
			// info relacionadas ao cadastro botanico dos plantios, datas e estoque
			//(String nomePopular, String nomeCientifico, String categoria) 
			CadastroBotanico objCadastroBotanico = new CadastroBotanico(texto("Nome popular do plantio: "),
					texto("Nome científico do plantio: "),
					texto("Informe a categoria desse plantio - [1] Vegetais [2] Tubérculos [3] Hortaliças, "
							+ "digite o número correspondente: "));
			//(String dataPlantio, String dataColheita)
			Plantio objPlantioBotanico = new Plantio(texto("DATA DO PLANTIO: "),
					texto("DATA DE COLHEITA: "));
			//(int qtdEstoque, int qtdPlantada, float valor, String validade, String materialUtilizado)
			Estoque objEstoqueBotanico = new Estoque(inteiro("Informe a quantidade em estoque: "),
					inteiro("Informe a quantidade plantada: "),
					racional("VALOR:  "),
					texto("VALIDADE: "),
					texto("Informe o material utilizado para o plantio: "));
			
			//(int idPedido, int idBotanico, int qtdItens, int idFuncionario)
			Pedido objPedido = new Pedido(inteiro("Informe o número do Pedido: "),
					inteiro("Informe o ID cadastrado do item que gostaria de reposição: "),
					inteiro("Informe a quantidade desejada para reposição desse item: "),
					inteiro("Informe o ID do funcionário que está requisitando esse pedido: "));
			
			// setters
			objCadastroBotanico.setPlantio(objPlantioBotanico);
			objCadastroBotanico.setEstoque(objEstoqueBotanico);
			
			// getters
			System.out.println("PEDIDO DE REPOSIÇÃO DE ESTOQUE");
			System.out.println("\nNúmero do pedido: " + objPedido.getIdPedido() +
					"\nNome popular: " + objCadastroBotanico.getNomePopular() +
					"\nNome científico: " + objCadastroBotanico.getNomeCientifico() + 
					"\nCategoria do plantio, digite [1]Vegetais, [2]Tubérculos ou [3]Hortaliçcas: " + objCadastroBotanico.getCategoria() +
					"\nQuantidade em estoque: " + objEstoqueBotanico.getQtdEstoque() + 
					"\nQuantidade plantada: " + objEstoqueBotanico.getQtdPlantada() +
					"\nVALOR: " + objEstoqueBotanico.getValor() + 
					"\nDATA DE VENCIMENTO: " + objEstoqueBotanico.getValidade() +
					"\nQuantidade desejada para reposição do estoque: " + objPedido.getIdPedido() +
					"\nIdentificação do funcionário que está requisitando esse pedido: " + objPedido.getIdFuncionario());
			
		}
}
