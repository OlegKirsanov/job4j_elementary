package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap1to2() {
        int[] input = {22, 44, 33, 55};
        int[] expect = {22, 33, 44, 55};
        int[] rsl = SwitchArray.swap(input, 1, 2);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap3to6() {
        int[] input = {22, 33, 44, 88, 66, 77, 55};
        int[] expect = {22, 33, 44, 55, 66, 77, 88};
        int[] rsl = SwitchArray.swap(input, 3, 6);
        assertThat(rsl, is(expect));
    }
}
