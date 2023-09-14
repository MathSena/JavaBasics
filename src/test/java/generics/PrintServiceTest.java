package generics;

import br.com.mathsena.generics.Main;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.*;


public class PrintServiceTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    @DisplayName("Deve retonar o primeiro elemento de uma lista que o usuário digitou")
    public void testRunProgram() {
        // Simule a entrada do usuário
        ByteArrayInputStream input = new ByteArrayInputStream("3\nJohn\nDoe\nJane\n".getBytes());
        Scanner sc = new Scanner(input);

        Main main = new Main();
        main.runProgram(sc);

        String expectedOutput = "Quantos nomes?: \n" +
                "[\n" +
                "John\n" +
                ", Doe\n" +
                ", Jane\n" +
                "]\n" +
                "O primeiro é: John\n" +
                "";

        assertEquals(expectedOutput, outContent.toString());


    }
}
