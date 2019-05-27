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
		assertEquals(2.2046229, result, 0.001);
	}

	@After
	public void tearDown1() {
	}
	
	@Before
	public void setUp2() {
		convert = new ConverterJUnit4();
		System.out.println("inchesToCms");
	}

	@Test
	public void shouldConvertInchesToCms() {
		double result = convert.inchesToCms(1.0);
		assertEquals(2.540005, result, 0.001);
	}

	@After
	public void tearDown2() {
	}

}
