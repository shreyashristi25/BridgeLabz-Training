package com.junit.test.temperatureconverter;
import org.junit.jupiter.api.* ;
import com.junit.main.temperatureconverter.*;
import static org.junit.jupiter.api.Assertions.* ;

public class TemperatureTest {

	private final TemperatureConverter converter = new TemperatureConverter();

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.001, "0°C should be 32°F");
        assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.001, "100°C should be 212°F");
        assertEquals(98.6, converter.celsiusToFahrenheit(37), 0.001, "37°C should be 98.6°F");
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.001, "32°F should be 0°C");
        assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.001, "212°F should be 100°C");
        assertEquals(37.0, converter.fahrenheitToCelsius(98.6), 0.001, "98.6°F should be 37°C");
    }

}
