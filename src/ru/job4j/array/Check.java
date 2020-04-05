package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean key = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] != key) {
                result = false;
                break;
            }
        }
        return result;
    }
}
