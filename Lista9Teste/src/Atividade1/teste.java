package Atividade1;

import static org.junit.Assert.*;

import org.junit.Test;

public class teste {
	Atividade1 tester = new Atividade1();
	@Test
	public void verificarExtrairCentavos(){
		assertEquals("156",tester.extrairCentavos("1,156"));
	}
}
