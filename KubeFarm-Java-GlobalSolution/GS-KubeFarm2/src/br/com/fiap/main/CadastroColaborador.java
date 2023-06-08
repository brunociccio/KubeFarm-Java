package br.com.fiap.main;

import javax.swing.JOptionPane;
import br.com.fiap.beans.CadastroFuncionario;
//import br.com.fiap.beans.FuncionarioComunidade;
//import br.com.fiap.beans.FuncionarioEscola;
import br.com.fiap.beans.FuncionarioSistema;

public class CadastroColaborador {
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

		/* OBSERVAÇÃO -> Todos os itens relacionados ao CadastroFuncionarioEscola e CadastroFuncionarioComunidade estão comentados para facilitar
		 a inputação de dados e teste do sistema:
		import, objetos, setters, getters e system.out */
		
		public static void main(String[] args) {
			// instanciar objetos

			/*
			// info relacionadas ao cadastro de funcionarios / colaboradores do sistema, escola e comunidade
			//(String nome, int idade, String cpf, String rg)
			CadastroFuncionario objCadastroFuncionarioEscola = new CadastroFuncionario(texto("Informe seu nome: "),
					inteiro("Informe sua idade: "),
					texto("Informe seu CPF: "),
					texto("Informe seu RG: "));
			//(String cargo, String escola)
			FuncionarioEscola objFuncionarioEscola = new FuncionarioEscola(texto("Informe seu cargo: "),
					texto("Informe o nome da Escola em que você trabalha: "));
			
			//(String nome, int idade, String cpf, String rg)
			CadastroFuncionario objCadastroFuncionarioComunidade = new CadastroFuncionario(texto("Informe seu nome: "),
					inteiro("Informe sua idade: "),
					texto("Informe seu CPF: "),
					texto("Informe seu RG: "));
			//(String cargo, String comunidade)
			FuncionarioComunidade objFuncionarioComunidade = new FuncionarioComunidade(texto("Informe seu cargo: "),
					texto("Informe o nome da Comunidade em que você trabalha: "));
					*/
			
			//(String nome, int idade, String cpf, String rg)
			CadastroFuncionario objCadastroFuncionarioSistema = new CadastroFuncionario(texto("Informe seu nome: "),
					inteiro("Informe sua idade: "),
					texto("Informe seu CPF: "),
					texto("Informe seu RG: "));
			//(String cargo, int idFuncionario)
			FuncionarioSistema objFuncionarioSistema = new FuncionarioSistema(texto("Informe seu cargo: "),
					inteiro("Informe seu ID de cadastro do sistema: "));
			
			// setters
			//objCadastroFuncionarioEscola.setFuncionarioEscola(objFuncionarioEscola);
			//objCadastroFuncionarioComunidade.setFuncionarioComunidade(objFuncionarioComunidade);
			objCadastroFuncionarioSistema.setFuncionarioSistema(objFuncionarioSistema);
			
			// getters	
			System.out.println("CADASTRO FUNCIONÁRIO KUBE FARM");
			System.out.println("\nNome Completo: " + objCadastroFuncionarioSistema.getNome() + 
					"\nIdade: " + objCadastroFuncionarioSistema.getIdade() + 
					"\nCPF: " + objCadastroFuncionarioSistema.getCpf() + 
					"\nRG: " + objCadastroFuncionarioSistema.getRg() +
					"\nCargo: " + objFuncionarioSistema.getCargo() + 
					"\nIdentificação do Sistema [ID]: " + objFuncionarioSistema.getIdFuncionario());
			
		}
}
