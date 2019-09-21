package model;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnalistaTest {
	
	private Analista analista = null;
	
	@BeforeEach
	void CreateAnalista() {
		Analista analista = new Analista("pedro", "00684932055", "prvalmeida", "123", 123456);
	}

	@Test
	void testAnalista() {
		assertEquals("pedro", this.analista.getNome());
	}

	@Test
	void testAdicionaProposta() {
//TODO corrigir exceção
//		LocalDate dataNascimentoCliente = LocalDate.of(1986, 11, 14);
//		Cliente cliente = new Cliente ("joao", 'm', dataNascimentoCliente, "0064932055", "maria");
//		LocalDate dataEmissao = LocalDate.of(2019, 9, 21);
//		
//		String idProposta = this.analista.adicionaProposta(3000, cliente, dataEmissao, "inss", "123456");
//		
//		ArrayList<Proposta> propostas = (ArrayList) this.analista.getPropostas();
//    	for (Proposta p : propostas) {
//    		if (p.getId() == idProposta) {
//    			assertEquals(p.getCliente(), cliente);
//    		}
//    	}
	}

	@Test
	void testAdicionaContrato() {
		fail("Not yet implemented");
	}

	@Test
	void testAdicionaBanco() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveProposta() {
		fail("Not yet implemented");
	}

	@Test
	void testPrintInfo() {
		fail("Not yet implemented");
	}

	@Test
	void testCleanPropostas() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMatriculaBemPromotora() {
		fail("Not yet implemented");
	}

	@Test
	void testSetMatriculaBemPromotora() {
		fail("Not yet implemented");
	}

}
