import static org.junit.Assert.*;

import org.junit.Test;

public class CriptografadoraTeste {

	@Test
	public void testConversaoLetraA() {
		Criptografadora criptografador = new Criptografadora();
		int resultadoConversao = criptografador.Criptografa('A');
		assertEquals(resultadoConversao, 19);
	}
	
	@Test
	public void testConversaoLetraB() {
		Criptografadora criptografador = new Criptografadora();
		int resultadoConversao = criptografador.Criptografa('B');
		assertEquals(resultadoConversao, 11);
	}
	
	@Test
	public void testConversaoLetraC() {
		Criptografadora criptografador = new Criptografadora();
		int resultadoConversao = criptografador.Criptografa('C');
		assertEquals(resultadoConversao, 71);
	}

	@Test
	public void testConversaoLetra$() {
		Criptografadora criptografador = new Criptografadora();
		int resultadoConversao = criptografador.Criptografa('$');
		assertEquals(resultadoConversao, 0);
	}
}
