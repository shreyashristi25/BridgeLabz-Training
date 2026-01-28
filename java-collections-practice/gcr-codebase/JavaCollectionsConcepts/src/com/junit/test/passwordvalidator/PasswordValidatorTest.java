package com.junit.test.passwordvalidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.junit.main.passwordvalidator.*;

public class PasswordValidatorTest {

	private final PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("StrongPass1"), "Password should be valid");
    }

    @Test
    void testTooShortPassword() {
        assertFalse(validator.isValid("Ab1"), "Password should be invalid (too short)");
    }

    @Test
    void testMissingUppercase() {
        assertFalse(validator.isValid("password1"), "Password should be invalid (no uppercase)");
    }

    @Test
    void testMissingDigit() {
        assertFalse(validator.isValid("Password"), "Password should be invalid (no digit)");
    }

    @Test
    void testNullPassword() {
        assertFalse(validator.isValid(null), "Password should be invalid (null)");
    }

}
