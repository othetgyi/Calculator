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

    @Test
    public void testCalculateResultAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.calculateResult(5, 2, "add");
        assertEquals(7, result);
    }

    @Test
    public void testCalculateResultSubtract() {
        Calculator calculator = new Calculator();
        double result = calculator.calculateResult(10, 7, "subtract");
        assertEquals(3, result);
    }

    @Test
    public void testCalculateResultMultiply() {
        Calculator calculator = new Calculator();
        double result = calculator.calculateResult(4, 3, "multiply");
        assertEquals(12, result);
    }

    @Test
    public void testCalculateResultDivide() {
        Calculator calculator = new Calculator();
        double result = calculator.calculateResult(27, 9, "divide");
        assertEquals(3, result);
    }

    @Test
    public void testCalculateResultError() {
        Calculator calculator = new Calculator();
        double result = calculator.calculateResult(36, 24, "addition");
        String output = "That operator was not in the correct format";
        assertEquals(output, outputStreamCaptor.toString().trim());
    }
}
