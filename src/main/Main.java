package main;

import java.io.InputStream;
import java.time.LocalDate;
import java.util.Scanner;

import controller.AnalistaController;
import model.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);

		System.out.println("Informe o nome:");
		String nome = input.nextLine();
		
		System.out.println("Informe o cpf:");
		String cpf = input.nextLine();
		
		System.out.println("Informe o user name:");
		String userName = input.nextLine();
		
		System.out.println("Informe a senha:");
		String senha = input.nextLine();
		
		System.out.println("Informe a matricula na bem promotora:");
		int matriculaBemPromotora = input.nextInt();
		
		AnalistaController analista = new AnalistaController();
		analista.criaAnalista(nome, cpf, userName, senha, matriculaBemPromotora);
		
		analista.printInfo();
		
		System.out.println("Adicionando um cliente ao analista");
		System.out.println("Digite o nome");
		String nomeCliente = input.nextLine();
		System.out.println("Digite o sexo (m/f)");
		char sexoCliente = input.next().charAt(0);
		System.out.println("Digite o dia de nascimento");
		int diaNascimentoCliente = input.nextInt();
		System.out.println("Digite o mês de nascimento");
		int mesNascimentoCliente = input.nextInt();
		System.out.println("Digite o ano de nascimento");
		int anoNascimentoCliente = input.nextInt();
		LocalDate dataNascimentoCliente = LocalDate.of(anoNascimentoCliente, mesNascimentoCliente, diaNascimentoCliente);
		System.out.println("Digite o cpf");
		String cpfCliente = input.nextLine();
		System.out.println("Digite o nome da mãe");
		String nomeMaeCliente = input.nextLine();
		
		Cliente cliente = new Cliente (nomeCliente, sexoCliente, dataNascimentoCliente, cpfCliente, nomeMaeCliente);
		
		System.out.println("Adicionando uma proposta do cliente");
		LocalDate dataEmissao = LocalDate.now();
		System.out.println("Digite o valor");
		int valorProposta = input.nextInt();
		System.out.println("Digite o convenio");
		String convenio = input.nextLine();
		System.out.println("Digite a matricula do convenio");
		String matriculaConvenio = input.nextLine();
		analista.adicionaProposta(valorProposta, cliente, dataEmissao, convenio, matriculaConvenio);

	}

}
