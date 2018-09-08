package me.amarpandey.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import me.amarpandey.StringCalculator;

class StringCalculatorTest {

	private StringCalculator stringCalculator;

	@BeforeEach
	public void initStringCalculator() {
		stringCalculator = new StringCalculator();
	}

	@Test
	public void emptyStringReturnsZero() {
		int result = stringCalculator.add("");
		assertEquals(0, result);
	}

	@Test
	public void singleCharReturnSameValue() {
		int result = stringCalculator.add("2");
		assertEquals(2, result);
	}

	@Test
	public void shouldAddTwoNumberSeperatedByComma() {
		int result = stringCalculator.add("10,20");
		assertEquals(30, result);
	}

	@Test
	public void shouldAddTwoNumberSeperaedByNewLine() {
		int result = stringCalculator.add("4\n3");
		assertEquals(7, result);
	}

	@Test
	public void shouldAddNumbersSeperatedByNewLineAndComma() {
		int result = stringCalculator.add("1,2\n3,4");
		assertEquals(10, result);
	}

	@Test
	public void shouldThrowExceptionForNegativeNumber() {
		assertThrows(NumberFormatException.class,
				() -> stringCalculator.add("-1,2\n-3"));
	}

	@Test
	public void shouldAvoidNumberGreaterThanThousand() {
		int result = stringCalculator.add("1,2,1001\n4,3");
		assertEquals(10, result);
	}

}
