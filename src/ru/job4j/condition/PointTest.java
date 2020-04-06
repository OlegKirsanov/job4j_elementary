package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 2);
        double expected = 4.47;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3D() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(4, 2, 1);
        double expected = 4.58;
        double out = a.distance3D(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
