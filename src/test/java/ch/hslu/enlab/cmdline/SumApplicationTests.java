package ch.hslu.enlab.cmdline;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class SumApplicationTests {

    @Test
    void testSum() {
        // Capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Invoke the main method with test parameters
        String[] args = {"1", "2"};
        SumApplication.main(args);

        // Restore the original System.out
        System.setOut(originalOut);

        // Validate the output
        String expectedOutput = "The sum of 1 and 2 is: 3";
        assertEquals(expectedOutput, outputStream.toString().trim());
    }
}
