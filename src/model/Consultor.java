package model;

import java.util.List;

public class Consultor extends Usuario{
    private Carteira carteira;

    public Consultor(String nome, String cpf, String username, String password) {
        super(nome, cpf, username, password);
    }
    
    public void createCarteira() {
    	this.carteira = new Carteira();
    }

    public Carteira getCarteira() {
        return carteira;
    }

    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }

    public void addProposta(Proposta proposta) {
    	if (proposta != null) {
    		this.carteira.addProposta(proposta);
    	}
    }
    
    public List<Proposta> getPropostas() { return this.carteira.getPropostas(); }

    public void removeProposta(Proposta proposta) {
        if (proposta != null) {
            this.carteira.removeProposta(proposta);
        }
    }

    public void cleanPropostas() {
        this.carteira.cleanPropostas();
    }
}
