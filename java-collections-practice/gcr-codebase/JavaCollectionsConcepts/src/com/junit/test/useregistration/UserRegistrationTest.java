package com.junit.test.useregistration;
import org.junit.jupiter.api.* ;
import static org.junit.jupiter.api.Assertions.* ;
import com.junit.main.userregistration.*;
public class UserRegistrationTest {

	private final UserRegistration registration = new UserRegistration();

    @Test
    void testValidUserRegistration() {
        assertTrue(registration.registerUser("shreya", "shreya@example.com", "StrongPass1"),
                "Valid user should be registered successfully");
    }

    @Test
    void testEmptyUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("", "shreya@example.com", "StrongPass1");
        });
        assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("shreya", "invalidEmail", "StrongPass1");
        });
        assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    void testShortPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("shreya", "shreya@example.com", "123");
        });
        assertEquals("Password must be at least 6 characters long", exception.getMessage());
    }

    @Test
    void testNullInputs() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(null, null, null);
        });
    }
}


