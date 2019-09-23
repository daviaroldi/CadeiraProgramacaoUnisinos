package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Analista extends Usuario{
    private List<Proposta> propostas = new ArrayList<Proposta>();
    private int matriculaBemPromotora;

    public Analista(String nome, String cpf, String username, String password, int matriculaBemPromotora) {
        super(nome, cpf, true, username, password);
        this.matriculaBemPromotora = matriculaBemPromotora;
    }

    public List<Proposta> getPropostas() { return this.propostas; }

    public String adicionaProposta(double valor, Cliente cliente, LocalDate dataEmissao, String convenio, String matriculaConvenio) throws Exception {
    	Proposta proposta = new Proposta(valor, cliente, dataEmissao, convenio, matriculaConvenio);
    	propostas.add(proposta);
    	
    	return proposta.getId();
    }
    
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

    public void removeProposta(String idProposta) {
    	Proposta proposta = this.findProposta(idProposta);
    	if (proposta != null) {
    		propostas.remove(proposta);
    	}
    }
    
	public void printInfo() {
		System.out.println("Informacoes do Analista:");
		System.out.println("ID: "+this.getId());
		System.out.println("Nome: "+this.getNome());
		System.out.println("CPF: "+this.getCpf());
		System.out.println("User Name: "+this.getUsername());
	}
    
    public void cleanPropostas() {
        this.propostas.removeAll(this.propostas);
    }
    
    private Proposta findProposta (String idProposta) {
    	for (Proposta p : propostas) {
    		if (p.getId() == idProposta) {
    			return p;
    		}
    	}
    	
    	return null;
    }

	public int getMatriculaBemPromotora() {
		return matriculaBemPromotora;
	}

	public void setMatriculaBemPromotora(int matriculaBemPromotora) {
		this.matriculaBemPromotora = matriculaBemPromotora;
	}
}
