package ru.job4j.tracker;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ValidateInputTest {
    @Test
    public void whenInvalidInput() {
        ByteArrayOutputStream mem = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(mem));
        String[] data = {"one", "2"};
        ValidateStubInput input = new ValidateStubInput(data);
        input.askInt("Enter");
        assertThat(
                mem.toString(),
                is(String.format("Invalid data! Enter again, please.%n"))
        );
        System.setOut(out);
    }

    @Test
    public void whenOutOfBoundInput() {
        ByteArrayOutputStream mem = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(mem));
        String[] data = {"10", "2"};
        ValidateStubInput input = new ValidateStubInput(data);
        input.askInt("Enter", 7);
        assertThat(
                mem.toString(),
                is(String.format("Please, select another number.%n"))
        );
        System.setOut(out);
    }
}
