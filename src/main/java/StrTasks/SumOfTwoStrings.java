package StrTasks;

public class SumOfTwoStrings {
    public static String join(String[] words) {
        if (words == null) {
            throw new IllegalArgumentException("Массив строк не может быть null и должен содержать хотя бы 2 элемента");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (i != words.length - 1) sb.append(" ");
        }
        return sb.toString();
    }
}
