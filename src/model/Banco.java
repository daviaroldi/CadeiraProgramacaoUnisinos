package model;

public class Banco {
    private int id;
    private String agencia;
    private String nome;

    public Banco(String agencia, String nome) {
//        this.id = id;
        this.agencia = agencia;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
