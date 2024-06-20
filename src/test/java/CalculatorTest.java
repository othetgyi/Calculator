import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void testCalculateResultAdd() {
        double result = Calculator.calculateResult(5, 2, "add");
        assertEquals(7, result);
    }

    @Test
    public void testCalculateResultSubtract() {
        double result = Calculator.calculateResult(10, 7, "subtract");
        assertEquals(3, result);
    }

    @Test
    public void testCalculateResultMultiply() {
        double result = Calculator.calculateResult(4, 3, "multiply");
        assertEquals(12, result);
    }

    @Test
    public void testCalculateResultDivide() {
        double result = Calculator.calculateResult(27, 9, "divide");
        assertEquals(3, result);
    }

    @Test
    void testCalculateResultError() {
        String output = "That operator was not in the correct format";
        assertEquals(output, outputStreamCaptor.toString().trim());
    }
}
