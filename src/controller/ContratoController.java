package controller;

import model.Contrato;

public class ContratoController {
	
	private Contrato contrato = null;
	
	public void criaContrato (String texto, String assinaturaEletronica) {
		Contrato contrato = new Contrato (texto, assinaturaEletronica);
		this.contrato = contrato;
	}
	
	public String getTexto() {
		return this.contrato.getTexto();
	}

	public String getAssinaturaEletronica() {
		return this.contrato.getAssinaturaEletronica();
	}

}
