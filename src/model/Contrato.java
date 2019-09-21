package model;

public class Contrato {
	private String texto;
	private String assinaturaEletronica;
	
	public Contrato (String texto, String assinaturaEletronica) {
		this.texto = texto;
		this.assinaturaEletronica = assinaturaEletronica;
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
