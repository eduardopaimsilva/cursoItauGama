package test;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class ContaTest {
	
	
  
	@Test
	public void deveRetornarNumeroContaPoupanca() {
		
		ContaPoupanca c = new ContaPoupanca(1234);

		int numero = c.getNumero();
		assertEquals(1234, numero);

	}
	
	@Test
   public void deveRetornarNumeroContaCorrente() {
		
		ContaCorrente c1 = new ContaCorrente(1238, 12.897);

		int numero = c1.getNumero();
		assertEquals(1238, numero);	
	
}
	@Test
  public void deveRetornarNumeroContaContaEspecial() {
		
		ContaPoupanca c3 = new ContaPoupanca(1237);

		int numero = c3.getNumero();
		assertEquals(1237, numero);
	
}	
   
}
