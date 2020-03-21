package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortArrayOf3() {
        int[] input = new int[] {5, 3, 4};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortArrayOf6() {
        int[] input = new int[] {5, 3, 4, 2, 0, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {0, 1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
}

