package controller;

import java.time.LocalDate;
import java.util.Date;

import model.Analista;
import model.Banco;
import model.Cliente;

public class AnalistaController {
	private Analista analista = null;
	
	public void criaAnalista (String nome, String cpf, String username, String password, int matriculaBemPromotora) {
		analista = new Analista(nome, cpf, username, password, matriculaBemPromotora);
		
		//TODO chamar classe que salva no BD
	}

	public void printInfo() {
		this.analista.printInfo();
	}
	
	public void adicionaProposta (double valor, Cliente cliente, LocalDate dataEmissao, String convenio, String matriculaConvenio) {
		if (analista != null) {
			analista.adicionaProposta(valor, cliente, dataEmissao, convenio, matriculaConvenio);
		}
	}
}
