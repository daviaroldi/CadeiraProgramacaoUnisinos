package model;

import java.util.Date;

public class Proposta {
    private int id;
    private double valor;
    private String status;
    private Cliente cliente;
    private Banco banco;
    private Date dataEmissao;
    private String convenio;
    private String matriculaConvenio;
    private Contrato contrato;

    public Proposta(double valor, String status, Cliente cliente, Banco banco, Date dataEmissao, String convenio, String matriculaConvenio) {
        this.valor = valor;
        this.status = status;
        this.cliente = cliente;
        this.banco = banco;
        this.dataEmissao = dataEmissao;
        this.convenio = convenio;
        this.matriculaConvenio = matriculaConvenio;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getMatriculaConvenio() {
        return matriculaConvenio;
    }

    public void setMatriculaConvenio(String matriculaConvenio) {
        this.matriculaConvenio = matriculaConvenio;
    }

    public void changeProposta() {
        //TODO
    }

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
}
