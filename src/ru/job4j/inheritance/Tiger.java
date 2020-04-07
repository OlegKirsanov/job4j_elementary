package ru.job4j.inheritance;

public class Tiger extends Predator {

    public Tiger() {
        System.out.println("Tiger");
    }

    public Tiger(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Tiger tiger1 = new Tiger();
        Tiger tiger2 = new Tiger("Petya");
    }
}
