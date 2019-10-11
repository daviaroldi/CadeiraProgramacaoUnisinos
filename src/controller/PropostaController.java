package controller;

import java.time.LocalDate;

import model.Cliente;
import model.Contrato;
import model.Proposta;

public class PropostaController {

	private Proposta proposta = null;
	private Cliente cliente = null;
	private ContratoController contrato = null;
	
	public void criaProposta (double valor, ClienteController cliente, LocalDate dataEmissao, String convenio, String matriculaConvenio  ) throws Exception {
		Cliente clienteObj = new Cliente (cliente.getNome(),cliente.getSexo(),cliente.getDataNascimento(),cliente.getCpf(),cliente.getNomeMae());
		Proposta proposta = new Proposta(valor, clienteObj, dataEmissao, convenio, matriculaConvenio);
		this.proposta = proposta;
	}
	
    public void criaContrato (String texto, String assinaturaEletronica) {
    	ContratoController contratoController = new ContratoController();
    	contratoController.criaContrato(texto, assinaturaEletronica);
    	this.contrato = contratoController;
    }
	
	public double getValor () {
		return this.proposta.getValor();
	}
	
	public void setValor (double valor) throws Exception {
		this.proposta.setValor(valor);
	}
	
	public LocalDate getDataEmissao () {
		return this.proposta.getDataEmissao();
	}
	
	public String getConvenio () {
		return this.proposta.getConvenio();
	}
	
	public String getMatriculaConvenio () {
		return this.proposta.getMatriculaConvenio();
	}
	
    public String getTextoContrato () {
    	return this.contrato.getTexto();
    }
	
}
