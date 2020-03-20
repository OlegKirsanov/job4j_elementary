package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 1;
        double leftToPay = amount * (1 + percent / 100) - salary;
        while (leftToPay > 0) {
            leftToPay =  leftToPay * (1 + percent / 100) - salary;
            year++;
        }
        return year;
    }
}
