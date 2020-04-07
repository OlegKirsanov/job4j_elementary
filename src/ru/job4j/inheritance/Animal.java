package ru.job4j.inheritance;

public class Animal {
    String name;

    public Animal() {
        super();
        System.out.println("Animal");
    }

    public Animal(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Kolya");
    }
}
