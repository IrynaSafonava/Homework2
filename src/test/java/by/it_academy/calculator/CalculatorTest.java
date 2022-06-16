package by.it_academy.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

   private Calculator testSubject = new Calculator();

    @ParameterizedTest
    @CsvSource(value = {"-5, 8, 3", "53.89, 24.11, 78", "2147483647, 1, 2147483648"})
    public void testSummarize(double x, double y, double expectedResult) {
        assertEquals(expectedResult, testSubject.toSummarize(x,y), "Not equal to " + expectedResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"-5, 8, -13", "53.89, 24.11, 29.78", "-2147483647, 1, -2.147483648E9"})
    public void testSubtract(double x, double y, double expectedResult) {
        assertEquals(expectedResult, testSubject.toSubtract(x,y), "Not equal to " + expectedResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"-5, 8, -40", "53.89, 24.11, 1299.2879", "-2147483647, 2, -4.294967294E9"})
    public void testMultiply(double x, double y, double expectedResult) {
        assertEquals(expectedResult, testSubject.toMultiply(x,y),"Not equal to " + expectedResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"-5, 8, -0.625", "53.89, 24.11, 2.2351721277", "-2147483647, 2, -1073741823.5"})
    public void testDivide(double x, double y, double expectedResult) {
        assertEquals(expectedResult, testSubject.toDivide(x,y), "Not equal to " + expectedResult);
    }

    @Test
    public void testDivisionByZero() {
        IllegalArgumentException result = assertThrows(
                IllegalArgumentException.class, () -> testSubject.toDivide(5, 0)
        );
        assertEquals("Argument 'divisor' is 0. Not allowed to divide a number by zero", result.getMessage());
    }
}
