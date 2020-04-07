package ru.job4j.inheritance;

public class Predator extends Animal {

    public Predator() {
        System.out.println("Predator");
    }

    public Predator(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Predator predator1 = new Predator();
        Predator predator2 = new Predator("Vasya");
    }
}
