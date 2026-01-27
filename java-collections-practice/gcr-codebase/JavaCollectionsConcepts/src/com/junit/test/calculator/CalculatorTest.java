package com.junit.test.calculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.junit.main.calculator.*;
public class CalculatorTest {

	Calculator calculator = new Calculator();

	@Test
	void testAdd() {
		assertEquals(5, calculator.add(2, 3));
		assertEquals(-1, calculator.add(2, -3));
	}
		 
	@Test
	void testSubtract() {
		assertEquals(2, calculator.subtract(4, 2)) ;
		assertEquals(-2, calculator.subtract(2, 4)) ;
	}
	
	@Test
	void testMultiply() {
		assertEquals(6, calculator.multiply(3, 2)) ;
		assertEquals(-2, calculator.multiply(-1, 2)) ;
	}
	
	@Test
	void testDivide() {
		assertEquals(6, calculator.divide(12, 2)) ;
		assertEquals(-2, calculator.divide(-10, 5)) ;
	}	

}
