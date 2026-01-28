package com.junit.test.calculatortest;
import com.junit.main.exceptionhandling.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

	@Test
	void testDivideByZeroThrowsException() {
		Calculator  calculator = new Calculator() ;
		
		assertThrows(ArithmeticException.class, ()-> {
			calculator.divide(10, 0) ;
		}, "Division by zero should throw arithmetic exception" )  ;
	}
	
	@Test
	void testDivideNormalCase() {
		Calculator calculator = new Calculator() ;
		assertEquals(5, calculator.divide(10, 2)) ;
	}
	
}
