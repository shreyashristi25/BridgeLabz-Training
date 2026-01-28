package com.junit.test.dateformatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.junit.main.dateformatter.*;
import java.text.ParseException;

public class DateFormatterTest {

	private final DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDateConversion() throws ParseException {
        String result = formatter.formatDate("2026-01-28");
        assertEquals("28-01-2026", result, "Date should be converted correctly");
    }

    @Test
    void testAnotherValidDateConversion() throws ParseException {
        String result = formatter.formatDate("2000-12-05");
        assertEquals("05-12-2000", result, "Date should be converted correctly");
    }

    @Test
    void testInvalidDateFormat() {
        assertThrows(ParseException.class, () -> {
            formatter.formatDate("28/01/2026"); 
        });
    }

    @Test
    void testEmptyDate() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("");
        });
    }

    @Test
    void testNullDate() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate(null);
        });
    }
}
