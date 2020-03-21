package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas10Then2() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {9, 12, 10, 0};
        int value = 10;
        int result = find.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas20ThenMinus1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {3, 2, 19};
        int value = 20;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int end = 4;
        int result = FindLoop.indexOfRange(input, value, start, end);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind5() {
        int[] input = {5, 2, 10, 2, 4};
        int value = 5;
        int start = 1;
        int end = 3;
        int result = FindLoop.indexOfRange(input, value, start, end);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind4() {
        int[] input = {5, 22, 10, 4, 2, 12, 31, 0};
        int value = 2;
        int start = 2;
        int end = 7;
        int result = FindLoop.indexOfRange(input, value, start, end);
        int expect = 4;
        assertThat(result, is(expect));
    }
}
