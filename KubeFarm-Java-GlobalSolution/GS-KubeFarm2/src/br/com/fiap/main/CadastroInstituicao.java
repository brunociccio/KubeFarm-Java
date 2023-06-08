package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cadastro;
//import br.com.fiap.beans.Comunidade;
import br.com.fiap.beans.Contato;
import br.com.fiap.beans.Documentos;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Escola;

public class CadastroInstituicao {
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

		/* OBSERVAÇÃO -> Todos os itens relacionados a Comunidade estão comentados para facilitar
		 a inputação de dados e teste do sistema:
		import, objetos, setters, getters e system.out */
		
	public static void main(String[] args) {
		// instanciar objetos
		// info da Escola
				//(String razaoSocial, String nomeFantasia)
				Cadastro objCadastroEscola = new Cadastro(texto("Informe a Razão Social: "),
						texto("Informe o Nome Fantasia: "));
				//(int qtdAlunos, String categoriaEscola, String nivelEscolar)
				Escola objEscola = new Escola(inteiro("Informe a quantidade de Alunos: "),
						texto("Informe a Categoria da Escola, [1] Estadual ou [2] Municipal: "),
						texto("Informe o Modelo de ensino da Escola [1] Infantil [2] Fundamental [3] Médio [4] Jovens e Adultos,"
								+ "digite o número correspondente: "));
				//(String cep, String logradouro, int numero, String bairro, String cidade, String estado)
				Endereco objEnderecoEscola = new Endereco(texto("Informe o CEP: "),
						texto("Informe o logradouro: "),
						inteiro("Informe o número: "),
						texto("Informe o bairro: "),
						texto("Informe a cidade: "),
						texto("Informe o estado: "));
				//(String cnpj, String inscricaoEstadual)
				Documentos objDocumentosEscola = new Documentos(texto("Informe o CNPJ: "),
						texto("Informe a Inscrição Estadual: "));
				//(String telefoneComercial, String telefoneCelular, String email)
				Contato objContatoEscola = new Contato(texto("Informe o telefone comercial: "),
						texto("Informe o telefone celular: "),
						texto("Informe o email: "));
				
				/*
				// info da Comunidade 
				//(String razaoSocial, String nomeFantasia)
				Cadastro objCadastroComunidade = new Cadastro(texto("Informe a Razão Social: "),
						texto("Informe o Nome Fantasia: "));
				//(int qtdMoradores, float tempoDeComunidade)
				Comunidade objComunidade = new Comunidade(inteiro("Informe a quantidade de moradores da Comunidade: "),
						racional("Informe o tempo de Comunidade: "));
				//(String cep, String logradouro, int numero, String bairro, String cidade, String estado)
				Endereco objEnderecoComunidade = new Endereco(texto("Informe o CEP: "),
						texto("Informe o logradouro: "),
						inteiro("Informe o número: "),
						texto("Informe o bairro: "),
						texto("Informe a cidade: "),
						texto("Informe o estado: "));
				//(String cnpj, String inscricaoEstadual)
				Documentos objDocumentosComunidade = new Documentos(texto("Informe o CNPJ: "),
						texto("Informe a Inscrição Estadual: "));
				//(String telefoneComercial, String telefoneCelular, String email)
				Contato objContatoComunidade = new Contato(texto("Informe o telefone comercial: "),
						texto("Informe o telefone celular: "),
						texto("Informe o email: "));
				//(String nomeMorador, int idadeMorador, int qtdDependentes)
				BeneficiadoComunidade objBeneficiadoComunidade = new BeneficiadoComunidade(texto("Nome do beneficiado: "),
						inteiro("Idade: "),
						inteiro("Quantidade de dependentes: "));	
						*/
				// setters	
				objEscola.setEndereco(objEnderecoEscola);
				objEscola.setContato(objContatoEscola);
				objEscola.setDocumentos(objDocumentosEscola);
				
				//objComunidade.setEndereco(objEnderecoComunidade);
				//objComunidade.setContato(objContatoComunidade);
				//objComunidade.setDocumentos(objDocumentosComunidade);
				
				// getters	
				System.out.println("INFORMAÇÕES DA ESCOLA");
				System.out.println("\n1 - CADASTRO");
				System.out.println("\nInforme a Razão Social: " + objCadastroEscola.getRazaoSocial() +
						"\nInforme o Nome Fantasia: " + objCadastroEscola.getNomeFantasia() +
						"\nInforme a quantidade de Alunos da Escola: " + objEscola.getQtdAlunos() +
						"\nInforme Informe a categoria da Escola: " + objEscola.getCategoriaEscola() +
						"\nInforme o modelo de ensino da Escola: "+ objEscola.getNivelEscolar());
				System.out.println("\n2 - DOCUMENTOS COMPLEMENTARES");
				System.out.println("\nInforme o CNPJ: " + objDocumentosEscola.getCnpj() + 
						"\nInforme a Inscrição Estadual: " + objDocumentosEscola.getInscricaoEstadual());
				System.out.println("\n3 - ENDEREÇO");
				System.out.println("\nInforme o CEP: " + objEnderecoEscola.getCep() + 
						"\nInforme o logradouro: " + objEnderecoEscola.getLogradouro() +
						"\nInforme o número: " + objEnderecoEscola.getNumero() +
						"\nInforme o bairro: " + objEnderecoEscola.getBairro() + 
						"\nInforme a cidade: " + objEnderecoEscola.getCidade() +
						"\nInforme o estado: " + objEnderecoEscola.getEstado());
				System.out.println("\n4 - CONTATO");
				System.out.println("\nInforme o telefone comercial: " + objContatoEscola.getTelefoneComercial() +
						"\nInforme o telefone celular: " + objContatoEscola.getTelefoneCelular() + 
						"\nInforme um email para contato: " + objContatoEscola.getEmail());
				

	}

}
