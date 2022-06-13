package by.it_academy.calculator;

import static by.it_academy.calculator.Calculator.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

    @ParameterizedTest
    @CsvSource(value = {"-5, 8, 3", "53.89, 24.11, 78", "2147483647, 1, 2147483648"})
    public void testSummarize(double x, double y, double result ) {
        assertEquals(toSummarize(x, y), result, "Not equal to " + result);
    }
}
