package StrTasks;

public class VowelsCount {
    public static int countVowels(String s) {
        if (s == null | s.isEmpty()) {
            throw new IllegalArgumentException("Строка не может быть пустой");
        }

        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiouаеёиоуыэюя".indexOf(c) >= 0) count++;
        }
        if (count == 0) {
            throw new IllegalArgumentException("В строке нет гласных");
        }

        return count;
    }
}
