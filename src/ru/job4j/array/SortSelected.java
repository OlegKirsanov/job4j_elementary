package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int min = MinDiapason.findMin(data, 0, data.length - 1);
        int index = FindLoop.indexOfRange(data, min, 0, data.length - 1);
        int temp = data[0];
        data[0] = data[index];
        data[index] = temp;
        for (int i = 1; i < data.length; i++) {
            min = MinDiapason.findMin(data, i, data.length - 1);
            index = FindLoop.indexOfRange(data, min, i, data.length - 1);
            temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
        return data;
    }
}
