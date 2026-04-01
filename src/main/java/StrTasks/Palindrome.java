package StrTasks;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Строка не может быть пустой");
        }
        String clean = s.replaceAll("\\s+", "").toLowerCase();
        return new StringBuilder(clean).reverse().toString().equals(clean);
    }
}
