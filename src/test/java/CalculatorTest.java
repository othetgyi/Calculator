import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.*;



public class CalculatorTest {
    //it should ask user for 2 numbers
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
//    public void testGetNumber1Input() {
//        Calculator.getNumber1Input();
//        assertEquals("Enter your first number", outContent.toString());
//
//    }
//    @Test
//    public void testGetNumber1Input() {
//        Calculator calculator = new Calculator();
//        assertEquals("Type in two numbers", calculator.getNumber1Input());
//    }


}
