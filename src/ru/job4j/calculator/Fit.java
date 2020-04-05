package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(183);
        double woman = Fit.womanWeight(165);
        System.out.println("Man 1.83 is " + man + " kg.");
        System.out.println("Woman 1.65 is " + woman + " kg.");
    }
}
