package model;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Cliente {
    private List<Documento> documentos;
    private String nome;
    private char sexo;
    private LocalDate dataNascimento;
    private String cpf;
    private String nomeMae;
    private Contato contato;
    private Endereco endereco;

    public Cliente(String nome, char sexo, LocalDate dataNascimento, String cpf, String nomeMae) throws Exception {
    	
    	if (!validaIdade(dataNascimento)) {
    		throw new Exception("Idade do cliente fora dos limites");
    	}
    	
    	this.nome = nome;
    	this.sexo = sexo;
    	this.dataNascimento = dataNascimento;
    	this.cpf = cpf;
    	this.nomeMae = nomeMae;
    }
    
    private boolean validaIdade (LocalDate dataNascimento) {
    	LocalDate dataAtual = LocalDate.now();
    	int idade = dataAtual.getYear() - dataNascimento.getYear();
    	
    	if (idade < 18 || idade > 75) {
    		return false;
    	}
    	
    	return true;
    }

    public void adicionaDocumento (String tipo, String numero, String orgaoEmissor, Date dataEmissao) {
    	Documento documento = new Documento (tipo, numero, orgaoEmissor, dataEmissao);
    	this.documentos.add(documento);
    }
    
    public void adicionaEndereco (String cep, String rua, int numero, String complemento) {
    	Endereco endereco = new Endereco (cep, rua, numero, complemento);
    	this.endereco = endereco;
    }
    
    public void adicionaContato (String email, String telefone) {
    	Contato contato = new Contato (email, telefone);
    	this.contato = contato;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
    
}
