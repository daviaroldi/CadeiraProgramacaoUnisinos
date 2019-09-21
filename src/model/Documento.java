package model;

import java.util.Date;

public class Documento {
    private String tipo;
    private String numero;
    private String orgaoEmissor;
    private Date dataEmissao;

    public Documento(String tipo, String numero, String orgaoEmissor, Date dataEmissao) {
        this.tipo = tipo;
        this.setNumero(numero);
        this.setOrgaoEmissor(orgaoEmissor);
        this.setDataEmissao(dataEmissao);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}

	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
}
