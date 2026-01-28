package com.junit.test.cstringutils;
import com.junit.main.stringutils.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

	@Test
    void testReverse() {
        assertEquals("cba", StringUtils.reverse("abc"));
        assertEquals("madam", StringUtils.reverse("madam")); 
        assertEquals("", StringUtils.reverse("")); 
    }

    @Test
    void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"));
        assertTrue(StringUtils.isPalindrome("racecar"));
        assertFalse(StringUtils.isPalindrome("hello"));
        assertTrue(StringUtils.isPalindrome("")); 
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", StringUtils.convertToUpperCase("hello"));
        assertEquals("JAVA", StringUtils.convertToUpperCase("Java"));
        assertEquals("", StringUtils.convertToUpperCase("")); 
    }

}
