import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void testDodowania1() throws Exception {
		double a = 1.2;
		double b = 1.6;
		
		double wynik = classUnderTest.sum(a, b);
		
		Assert.assertEquals("bledny wynik dodawania", 2.8, wynik, 0.01);
	}
	
	@Test
	public void testDodowania2() throws Exception {
		double a = 3.2;
		double b = 1.6;
		
		double wynik = classUnderTest.sum(a, b);
		
		Assert.assertEquals("bledny wynik dodawania", 4.8, wynik, 0.01);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDzieleniaPrzezZero() throws Exception {
		double a = 3.2;
		double b = 0;
		
		classUnderTest.divide(a, b);
		
	}
	

}
