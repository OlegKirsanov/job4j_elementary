package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] array = new int[5];
        for(int index = 0; index < array.length; index++) {
            array[index] = index * 2 + 3;
            System.out.println(array[index]);
        }
    }
}
