package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("The bus is moving.");
    }

    @Override
    public void passengers(int passNum) {
        System.out.println("There are " + passNum + " passengers on the bus.");
    }

    @Override
    public double addFuel(double fuel) {
        double price = 45.0;
        return fuel * price;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.ride();
        bus.passengers(25);
        System.out.println("Added fuel by " + bus.addFuel(45) + " RUB");
    }
}
