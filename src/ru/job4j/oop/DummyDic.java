package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String rsl = "Неизвестное слово. " + eng;
        return  rsl;
    }

    public static void main(String[] args) {
        DummyDic test = new DummyDic();
        System.out.println(test.engToRus("Hello"));
        System.out.println(test.engToRus("Goodbye"));
    }
}
