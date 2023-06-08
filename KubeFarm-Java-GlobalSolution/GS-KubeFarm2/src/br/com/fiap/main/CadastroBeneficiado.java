package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.BeneficiadoComunidade;
//import br.com.fiap.beans.BeneficiadoEscola;
import br.com.fiap.beans.Cadastro;
import br.com.fiap.beans.Comunidade;
//import br.com.fiap.beans.Escola;

public class CadastroBeneficiado {
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

		/* OBSERVAÇÃO -> Todos os itens relacionados ao BenefiadoEscola estão comentados para facilitar
		 a inputação de dados e teste do sistema:
		import, objetos, setters, getters e system.out */
		
		public static void main(String[] args) {
			// instanciar objetos

			/*
			// info da Escola
			//(String razaoSocial, String nomeFantasia)
			Cadastro objCadastroEscola = new Cadastro(texto("Informe a Razão Social: "),
					texto("Informe o Nome Fantasia: "));
			//(int qtdAlunos, String categoriaEscola, String nivelEscolar)
			Escola objEscola = new Escola(inteiro("Informe a quantidade de Alunos: "),
					texto("Informe a Categoria da Escola, [1] Estadual ou [2] Municipal: "),
					texto("Informe o Modelo de ensino da Escola [1] Infantil [2] Fundamental [3] Médio [4] Jovens e Adultos,"
							+ "digite o número correspondente: "));
			BeneficiadoEscola objBeneficiadoEscola = new BeneficiadoEscola(texto("Nome do beneficiado: "),
					inteiro("Idade: "),
					texto("Escolaridade: "));
					*/
			
			// info da Comunidade 
			//(String razaoSocial, String nomeFantasia)
			Cadastro objCadastroComunidade = new Cadastro(texto(null),
					texto("Informe o Nome Fantasia: "));
			//(int qtdMoradores, float tempoDeComunidade)
			Comunidade objComunidade = new Comunidade(inteiro("Informe a quantidade de moradores da Comunidade: "),
					racional("Informe o tempo de Comunidade: "));
			//(String nomeMorador, int idadeMorador, int qtdDependentes)
			BeneficiadoComunidade objBeneficiadoComunidade = new BeneficiadoComunidade(texto("Nome do beneficiado: "),
					inteiro("Idade: "),
					inteiro("Quantidade de dependentes: "));
			
			// setters
			//objEscola.setBeneficiadoEscola(objBeneficiadoEscola);
			
			objComunidade.setBeneficiadoComunidade(objBeneficiadoComunidade);
			
			// getters
			System.out.println("Informações para cadastro do novo beneficiado");
			System.out.println("\nINFORMAÇÕES SOBRE A COMUNIDADE E VOCÊ");
			System.out.println("\nInforme o nome da sua Comunidade: " + objCadastroComunidade.getNomeFantasia() +
					"\nInforme a quantidade de moradores de sua Comunidade[caso não souber, deixar em branco]:" + objComunidade.getQtdMoradores() +
					"\nInforme há quanto tempo você mora em sua Comunidade: " + objComunidade.getTempoDeComunidade() +
					"\nInforme seu nome: " + objBeneficiadoComunidade.getNomeMorador() + 
					"\nInforme a sua idade: " + objBeneficiadoComunidade.getIdadeMorador() + 
					"\nVocê possui dependentes? Se sim, informe quantos dependentes você possui: " +
					objBeneficiadoComunidade.getQtdDependentes());
			
		}
}
