package ru.job4j.array;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int index = 0;
        while (index < rsl.length) {
            if (left.length == 0 && right.length != 0) {
                rsl[index] = right[rightIndex];
                rightIndex++;
                index++;
            } else if (right.length == 0 && left.length != 0) {
                rsl[index] = left[leftIndex];
                leftIndex++;
                index++;
            } else if (left[leftIndex] <= right[rightIndex]) {
                rsl[index] = left[leftIndex];
                index++;
                if (leftIndex == left.length - 1) {
                    while (rightIndex < right.length) {
                        rsl[index] = right[rightIndex];
                        rightIndex++;
                        index++;
                    }
                } else {
                    leftIndex++;
                }
            } else if (left[leftIndex] > right[rightIndex]) {
                rsl[index] = right[rightIndex];
                index++;
                if (rightIndex == right.length - 1) {
                    while (leftIndex < left.length) {
                        rsl[index] = left[leftIndex];
                        leftIndex++;
                        index++;
                    }
                } else {
                    rightIndex++;
                }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 3, 5, 8},
                new int[] {1, 2, 4, 6, 7, 7}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
