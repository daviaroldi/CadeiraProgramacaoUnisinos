package model;

import java.util.List;

public class Carteira {
    private int id;
    private List<Proposta> propostas;

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
