package controller;

import java.time.LocalDate;
import java.util.Date;

import model.Analista;
import model.Banco;
import model.Cliente;
import model.SalvaAnalista;

public class AnalistaController {
	private Analista analista = null;
	
	public void criaAnalista (String nome, String cpf, String username, String password, int matriculaBemPromotora) {
		try {
		analista = new Analista(nome, cpf, username, password, matriculaBemPromotora);
		
		SalvaAnalista salvaAnalista = new SalvaAnalista();
		salvaAnalista.salvaAnalista(analista);
		} catch (Exception e) {
			System.out.println("Erro ao criar analista: "+ e.getMessage());
		}
	}

	public void printInfo() {
		this.analista.printInfo();
	}
	
	public void adicionaProposta (double valor, Cliente cliente, LocalDate dataEmissao, String convenio, String matriculaConvenio) {
		try {
		if (analista != null) {
			analista.adicionaProposta(valor, cliente, dataEmissao, convenio, matriculaConvenio);
		}
		} catch (Exception e) {
			System.out.println("Erro ao adicionar proposta: "+ e.getMessage());
		}
	}
}
