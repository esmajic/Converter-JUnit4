import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConverterJUnit4Test {
	
	ConverterJUnit4 convert;

	@Before
	public void setUp() {
		convert = new ConverterJUnit4();
		System.out.println("poundsToKgs");
	}

	@Test
	public void shouldConvertPoundsToKilograms() {
		double result = convert.poundsToKgs(1.0);
		assertEquals(0.4535923, result, 0.001);
	}

	@After
	public void tearDown() {
	}
	
	@Before
	public void setUp1() {
		convert = new ConverterJUnit4();
		System.out.println("kgsToPounds");
	}

	@Test
	public void shouldConvertKgsToPounds() {
		double result = convert.kgsToPounds(1.0);
		assertEquals(0.39370, result, 0.001);
	}

	@After
	public void tearDown1() {
	}

}
