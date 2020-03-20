package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        CheckPrimeNumber check = new CheckPrimeNumber();
        for (int i = 2; i <= finish; i++) {
            if (check.check(i)) {
                count++;
            }
        }
        return count;
    }
}
