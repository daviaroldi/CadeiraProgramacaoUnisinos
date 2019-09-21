package model;

public class Endereco {
    private String cep;
    private String rua;
    private int numero;
    private String complemento;
    
    public Endereco (String cep, String rua, int numero, String complemento) {
    	this.cep = cep;
    	this.rua = rua;
    	this.numero = numero;
    	this.complemento = complemento;
    }
    
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
