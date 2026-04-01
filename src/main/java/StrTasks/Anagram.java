package StrTasks;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String a, String b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Строки не могут быть null");
        }
        if (a.isEmpty() || b.isEmpty()) {
            throw new IllegalArgumentException("Строки не могут быть пустыми");
        }
        char[] ca = a.toCharArray(), cb = b.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        return Arrays.equals(ca, cb);
    }
}
