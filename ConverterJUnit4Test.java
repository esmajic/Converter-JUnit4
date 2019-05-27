import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConverterJUnit4Test {
	
	ConverterJUnit4 convert;

	@Before
	public void setUp() {
		convert = new ConverterJUnit4();
		System.out.println("BEFORE");
	}

	@Test
	public void shouldConvertPoundsToKilograms() {
		double result = convert.poundsToKgs(1);
		asserEquals(0.4535923, result);
	}

	@After
	public void tearDown() {
		System.out.println("AFTER");
	}

}
