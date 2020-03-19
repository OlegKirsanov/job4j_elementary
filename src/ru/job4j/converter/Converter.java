package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int dollar = Converter.rubleToDollar(140);
        int in = 140;
        int expected = 2;
        int out = rubleToDollar(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are " + dollar + " dollar. Test result: " + passed);
        int euro = Converter.rubleToEuro(140);
        in = 140;
        expected = 2;
        out = rubleToEuro(in);
        passed = expected == out;
        System.out.println("140 rubles are " + euro + " euro. Test result: " + passed);
    }
}
