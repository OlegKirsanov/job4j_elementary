package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    @Test
    public void whenOddDataMonoByTrueThenTrue() {
        boolean[] input = new boolean[] {true, true, true};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenOddDataNotMonoByTrueThenFalse() {
        boolean[] input = new boolean[] {true, false, true};
        boolean result = Check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenEvenDataMonoByTrueThenTrue() {
        boolean[] input = new boolean[] {true, true, true, true};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenEvenDataMonoByFalseThenTrue() {
        boolean[] input = new boolean[] {false, false, false, false};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenEvenDataNotMonoByTrueThenFalse() {
        boolean[] input = new boolean[] {true, false, true, false};
        boolean result = Check.mono(input);
        assertThat(result, is(false));
    }
}
