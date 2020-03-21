package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int n = array.length;
        for (int i = 0; i < (array.length / 2); i++) {
            n--;
            int temp = array[n];
            array[n] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
