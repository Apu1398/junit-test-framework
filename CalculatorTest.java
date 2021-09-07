import junit.framework.TestCase;

public class CalculatorTest extends TestCase{

	
	Calculator calculator = new Calculator(); 
	
	
	public void testSumar() {
		assertTrue(calculator.sumar(2, 2) == 4);
	}
	
	public void testRestar() {
		assertEquals(3, calculator.restar(5,2));
	}
	
	public void testMultiplicar() {
		assertFalse(calculator.multiplicar(3,3) == 8);
	}
	
	public void testDividir() {
		assertEquals(4, calculator.dividir(16,4));
	}
}

