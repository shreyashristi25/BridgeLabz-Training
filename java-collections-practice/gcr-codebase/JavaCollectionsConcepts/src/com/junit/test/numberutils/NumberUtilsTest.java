package com.junit.test.numberutils;
import com.junit.main.numberutils.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class NumberUtilsTest {

	private final NumberUtils utils = new NumberUtils() ;
	
	@ParameterizedTest
	@ValueSource(ints = {2, 4, 6}) 
	void testIsEven(int num) {
		assertTrue(utils.isEven(num), num +"should be even.") ;
	}
	
	@ParameterizedTest
	@ValueSource(ints = {3, 7})
	void testIsOdd(int num) {
		assertFalse(utils.isEven(num), num +"should be odd.") ;
	}
}
