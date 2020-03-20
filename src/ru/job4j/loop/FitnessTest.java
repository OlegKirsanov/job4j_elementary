package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FitnessTest {
    @Test
    public void whenIvanGreatNik() {
        int rsl = Fitness.calc(95, 90);
        int expected = 0;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenIvanLessByOneNik() {
        int rsl = Fitness.calc(90, 95);
        int expected = 1;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenIvanLessByFewNik() {
        int rsl = Fitness.calc(50, 90);
        int expected = 2;
        assertThat(rsl, is(expected));
    }
}
