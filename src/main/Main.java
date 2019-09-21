package main;

import java.io.InputStream;
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
		
		//TODO adicionar proposta ao analista
		
		//TODO adicionar criações de cliente

	}

}
