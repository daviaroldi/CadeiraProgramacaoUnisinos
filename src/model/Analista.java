package model;

import java.util.List;

public class Analista extends Usuario{
    private List<Proposta> propostas;

    public Analista(String nome, String cpf, String username, String password) {
        super(nome, cpf, username, password);
    }

    public List<Proposta> getPropostas() { return this.propostas; }

    public void addProposta(Proposta proposta) {
        if (proposta != null) {
            this.propostas.add(proposta);
        }
    }

    public void removeProposta(Proposta proposta) {
        if (proposta != null) {
            this.propostas.remove(proposta);
        }
    }

    public void cleanPropostas() {
        this.propostas.removeAll(this.propostas);
    }
}
