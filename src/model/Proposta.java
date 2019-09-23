package model;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class Proposta {
    private String id;
    private double valor;
    private String status = "NOK";
    private Cliente cliente = null;
    private Banco banco = null;
    private LocalDate dataEmissao;
    private String convenio;
    private String matriculaConvenio;
    private Contrato contrato = null;

    public Proposta(double valor, Cliente cliente, LocalDate dataEmissao, String convenio, String matriculaConvenio) {
    	
    	//TODO fazer validações automáticas aqui (criar método)
    	
        this.valor = valor;
        
        //TODO remover cliente do construtor? estamos criando dependencia com essa classe para quem instanciar Proposta
        //Ao mesmo tempo, talvez seja bom a classe cliente ser conhecida, pois ela é um dos pilares do sistema
        this.cliente = cliente;
        
        this.dataEmissao = dataEmissao;
        this.convenio = convenio;
        this.matriculaConvenio = matriculaConvenio;
        
        this.id = java.util.UUID.randomUUID().toString();
    }
    
    public void criaContrato (String texto, String assinaturaEletronica) {
    	Contrato contrato = new Contrato(texto, assinaturaEletronica);
    	this.contrato = contrato;
    }
    
    public void associaBanco (String nome, String agencia, String conta) {
    	Banco banco = new Banco (nome, agencia, conta);
    	this.banco = banco;
    }
    
    public String getTextoContrato () {
    	return this.contrato.getTexto();
    }

    public String getId() {
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

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
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

}
