package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ufrn.first.Calculator;

public class CalculatorTest {

	@BeforeClass
	public static void testSetup() {
	}

	@AfterClass
	public static void testCleanup() {
		// Teardown for data used by the unit tests
	}

	@Test(expected = IllegalArgumentException.class)
	public void testExceptionIsThrown() {
		Calculator test = new Calculator();
		test.multiply(1000, 5);
	}

	@Test
	public void testMultiply() {
		Calculator test = new Calculator();
		assertEquals("10 x 5 must be 50", 50, test.multiply(10, 5));
	}
}
