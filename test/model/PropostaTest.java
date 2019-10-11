package model;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controller.ClienteController;
import controller.PropostaController;

class PropostaTest {
	
	private ClienteController cliente = null;
	private PropostaController proposta = null;
	
	@BeforeEach
	void CreateProposta() throws Exception {
		LocalDate dataNascimentoCliente = LocalDate.of(1986, 11, 14);
		ClienteController clienteController = new ClienteController();
		clienteController.criaCliente("joao", 'm', dataNascimentoCliente, "0064932055", "maria");
		this.cliente = clienteController;
	}

	@Test
	void criaProposta() throws Exception {
		PropostaController propostaController = new PropostaController ();
		propostaController.criaProposta(50000, this.cliente, LocalDate.of(2019, 10, 9), "inss", "123");
		this.proposta = propostaController;
		
		assertEquals(this.proposta.getConvenio(), "inss");
		assertEquals(this.proposta.getMatriculaConvenio(), "123");
	}

	@Test
	void criaPropostaValorInvalido() throws Exception {
		PropostaController propostaController = new PropostaController ();
		
	    assertThrows(Exception.class, () -> {
	    	propostaController.criaProposta(60001, this.cliente, LocalDate.of(2019, 10, 9), "inss", "123");
	    });
	}
	
	@Test
	void criaPropostaValorMaximo() throws Exception {
		PropostaController propostaController = new PropostaController ();
		propostaController.criaProposta(60000, this.cliente, LocalDate.of(2019, 10, 9), "inss", "123");
		this.proposta = propostaController;
		
		assertEquals(this.proposta.getValor(), 60000);
	}

	@Test
	void testMudaValor() throws Exception {
		PropostaController propostaController = new PropostaController ();
		propostaController.criaProposta(10000, this.cliente, LocalDate.of(2019, 10, 9), "inss", "123");
		this.proposta = propostaController;
		
		assertEquals(this.proposta.getValor(), 10000);
		
		this.proposta.setValor(20000);
		
		assertEquals(this.proposta.getValor(), 20000);
		
	    assertThrows(Exception.class, () -> {
	    	this.proposta.setValor(80000);
	    });
	}

	@Test
	void testAssociaBanco() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTextoContrato() {
		fail("Not yet implemented");
	}

	@Test
	void testGetId() {
		fail("Not yet implemented");
	}

	@Test
	void testGetValor() {
		fail("Not yet implemented");
	}

	@Test
	void testSetValor() {
		fail("Not yet implemented");
	}

	@Test
	void testGetStatus() {
		fail("Not yet implemented");
	}

	@Test
	void testSetStatus() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCliente() {
		fail("Not yet implemented");
	}

	@Test
	void testSetCliente() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDataEmissao() {
		fail("Not yet implemented");
	}

	@Test
	void testSetDataEmissao() {
		fail("Not yet implemented");
	}

	@Test
	void testGetConvenio() {
		fail("Not yet implemented");
	}

	@Test
	void testSetConvenio() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMatriculaConvenio() {
		fail("Not yet implemented");
	}

	@Test
	void testSetMatriculaConvenio() {
		fail("Not yet implemented");
	}

}
