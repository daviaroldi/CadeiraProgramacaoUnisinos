package controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import model.Cliente;
import model.Documento;
import model.Endereco;

public class ClienteController {
	
	private Cliente cliente = null;
	private List<Documento> documentos;
	private Endereco endereco = null;
	
	public void criaCliente (String nome, char sexo, LocalDate dataNascimento, String cpf, String nomeMae) throws Exception {
		Cliente cliente = new Cliente (nome, sexo, dataNascimento, cpf, nomeMae);
		this.cliente = cliente;
	}
	
    public void adicionaDocumento (String tipo, String numero, String orgaoEmissor, Date dataEmissao) {
    	Documento documento = new Documento (tipo, numero, orgaoEmissor, dataEmissao);
    	this.documentos.add(documento);
    }

	//Imprime endereço no formato:
	//Rua: aaaaa numero xxxxx; CEP: yyyyy
	public String printEndereco() {
		return "Rua: "+this.endereco.getRua()+ " "+ this.endereco.getNumero() +"; CEP: "+this.endereco.getCep();
	}
	
	public String getRua() {
		return this.endereco.getRua();
	}
	
	public int getNumero() {
		return this.endereco.getNumero();
	}

	public void setEndereco (String cep, String rua, int numero, String complemento) {
    	Endereco endereco = new Endereco (cep, rua, numero, complemento);
    	this.endereco = endereco;
    }

	public String getNome() {
		return this.cliente.getNome();
	}

	public char getSexo() {
		return this.cliente.getSexo();
	}

	public LocalDate getDataNascimento() {
		return this.cliente.getDataNascimento();
	}

	public String getCpf() {
		return this.cliente.getCpf();
	}

	public String getNomeMae() {
		return this.cliente.getNomeMae();
	}

}
