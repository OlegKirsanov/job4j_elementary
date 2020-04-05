package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void areaWhenExist() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 4);
        Point c = new Point(3, 0);
        Triangle tri = new Triangle(a, b, c);
        double result = tri.area();
        assertThat(result, is(6.0));
    }

    @Test
    public void areaWhenNotExist() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(0, 0);
        Triangle tri = new Triangle(a, b, c);
        double result = tri.area();
        assertThat(result, is(-1.0));
    }
}
