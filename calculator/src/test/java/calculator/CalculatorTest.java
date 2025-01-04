package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
	@Test
	void addTwoPositiveNumbers_ReturnsSum() {
		Calculator calculator = new Calculator();
		int result = calculator.addTwoNumber(3, 5);
		assertEquals(8, result);
	}
	
}
