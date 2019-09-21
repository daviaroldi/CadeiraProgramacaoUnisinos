package model;

public class Banco {
    private String nome;
	private String agencia;
	private String conta;

    public Banco(String nome, String agencia, String conta) {
        this.agencia = agencia;
        this.nome = nome;
        this.setConta(conta);
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

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}
}
