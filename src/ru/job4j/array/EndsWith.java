package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int m = word.length;
        int n = post.length;
        for (int i = (post.length - 1); i > -1; i--) {
            m--;
            n--;
            if (word[m] != post[n]) {
                result = false;
            }
        }
        return result;
    }
}
