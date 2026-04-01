package ArrTasks;

import java.util.HashSet;
import java.util.Set;

public class UniqueUtils {
    public static int uniqueChar(String s) {

        if (s == null) {
            throw new IllegalArgumentException("Строка не должна быть null");
        }

        s = s.trim();

        if (s.isEmpty()) {
            return 0;
        }

        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                continue;
            }
            set.add(c);
        }

        return set.size();
    }
    public static void main(String[] args) {

        // 1️⃣ обычная строка
        System.out.println(UniqueUtils.uniqueChar("aaa"));
        // ожидаем 1

        // 2️⃣ разные символы
        System.out.println(UniqueUtils.uniqueChar("abc"));
        // ожидаем 3

        // 3️⃣ с повторениями
        System.out.println(UniqueUtils.uniqueChar("aabbcc"));
        // ожидаем 3

        // 4️⃣ пустая строка
        System.out.println(UniqueUtils.uniqueChar(""));
        // ожидаем 0

        // 5️⃣ строка из пробелов
        System.out.println(UniqueUtils.uniqueChar("     "));
        // ожидаем 0

        // 6️⃣ строка с пробелами внутри
        System.out.println(UniqueUtils.uniqueChar("a a a"));
        // ожидаем 1

        // 7️⃣ null
        try {
            System.out.println(UniqueUtils.uniqueChar(null));
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

}
