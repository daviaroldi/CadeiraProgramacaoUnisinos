package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Consultor extends Usuario{
	private List<Proposta> propostas = new ArrayList<Proposta>();

    public Consultor(String nome, String cpf, String username, String password) {
        super(nome, cpf, username, password);
    }

    public void addProposta(double valor, Cliente cliente, LocalDate dataEmissao, String convenio, String matriculaConvenio) {
    	Proposta proposta = new Proposta(valor, cliente, dataEmissao, convenio, matriculaConvenio);
    	propostas.add(proposta);
    }
    
    public List<Proposta> getPropostas() { return this.propostas; }
    
    public void adicionaContrato(String idProposta, String texto, String assinaturaEletronica) {
    	Proposta proposta = this.findProposta(idProposta);
    	if (proposta != null) {
    		proposta.criaContrato(texto, assinaturaEletronica);
    	}
    }
    
    public void adicionaBanco (String idProposta, String nome, String agencia, String conta) {
    	Proposta proposta = this.findProposta(idProposta);
    	if (proposta != null) {
    		proposta.associaBanco(nome, agencia, conta);
    	}
    }
    
	public void printInfo() {
		System.out.println("Informacoes do Consultor:");
		System.out.println("ID: "+this.getId());
		System.out.println("Nome: "+this.getNome());
		System.out.println("CPF: "+this.getCpf());
		System.out.println("User Name: "+this.getUsername());
	}
    
    private Proposta findProposta (String idProposta) {
    	for (Proposta p : propostas) {
    		if (p.getId() == idProposta) {
    			return p;
    		}
    	}
    	
    	return null;
    }

}
