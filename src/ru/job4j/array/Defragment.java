package ru.job4j.array;

import java.util.Arrays;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] == null) {
                int point = index;
                while (array[index] == null) {
                    point++;
                    String temp = array[index];
                    array[index] = array[point];
                    array[point] = temp;
                    if (point == array.length - 1) {
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
          System.out.print(compressed[index] + " ");
        }
    }
}
