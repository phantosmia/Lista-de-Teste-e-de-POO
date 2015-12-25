package ex1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ex1TestCase {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		
		ex1 ex = new ex1();
		assertEquals("O valor deve ser 0",0,ex.calcularValor(0, 0));
	}

}
