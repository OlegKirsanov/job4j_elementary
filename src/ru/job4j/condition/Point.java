package ru.job4j.condition;

import static java.lang.Math.*;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(0, 0, 4, 2);
        System.out.println("result (0, 0) to (4, 2) " + result);
        result = Point.distance(-1, -1, 6, 4);
        System.out.println("result (-1, -1) to (6, 4) " + result);
    }
}
