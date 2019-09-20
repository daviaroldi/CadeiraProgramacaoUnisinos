package model;

public class Contrato {
	private int id;
	private String texto;
	private String assinaturaEletronica;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getAssinaturaEletronica() {
		return assinaturaEletronica;
	}
	public void setAssinaturaEletronica(String assinaturaEletronica) {
		this.assinaturaEletronica = assinaturaEletronica;
	}

}
