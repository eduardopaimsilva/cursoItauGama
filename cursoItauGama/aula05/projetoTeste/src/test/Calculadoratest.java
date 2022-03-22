package test;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Calculadora;



public class Calculadoratest {
	
	private Calculadora c;
	
	@BeforeEach
	public void setup() {
		c = new Calculadora();
	}

	@Test
	public void deveRetornarASomadosValores() {

		double resultado = c.somar(10, 20);
		assertEquals(30, resultado);

	}
	
	@Test
	public void deveRetornarAsubtracaoDosNumeros() {
		
		double resultado = c.subtair(20, 10);
		
	}
	
	@Test
	public void deveRetornarProdutosDosNumeros() {
		
		double resultado = c.multiplicar(5, 2);
		
		assertEquals(10, resultado);
		
	}
	
	@Test
	public void deveRetornarADivisaoQuandoDenominadorDiferenteZero() {
		double resultado = c.dividir(20, 5);
		
		assertEquals(4, resultado);
	}
	
	@Test
	public void deveRetornarNegativoQuandoDenominadorZero() {
          double resultado = c.dividir(20, 0);
		
		assertEquals(-1, resultado);
	}
		
	}
