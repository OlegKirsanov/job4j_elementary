package ru.job4j.ex;

public class FactRec {
    public static long calc(long n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return calc(n - 1) * n;
    }

    public static void main(String[] args) {
        long rsl = calc(15);
        System.out.println(rsl);
    }
}
