package model;

import java.util.List;

public class Consultor extends Usuario{
    private List<Proposta> propostas;

    public Consultor(String nome, String cpf, String username, String password) {
        super(nome, cpf, username, password);
    }

    public void addProposta(Proposta proposta) {
    	if (proposta != null) {
    		this.propostas.add(proposta);
    	}
    }
    
    public List<Proposta> getPropostas() { return this.propostas; }

    public void removeProposta(Proposta proposta) {
        if (proposta != null) {
        	if (this.propostas.indexOf(proposta) != -1) {
        		this.propostas.remove(this.propostas.indexOf(proposta));
        	}
        }
    }

    public void cleanPropostas() {
        this.propostas.clear();
    }
}
