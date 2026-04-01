package ArrTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoLists {
    public static List<String> merge(List<String> a, List<String> b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Списки не должны быть null");
        }
        List<String> result = new ArrayList<>(a);
        result.addAll(b);
        return result;
    }

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A", "B", "C");
        List<String> list2 = Arrays.asList("D", "E");

        System.out.println(merge(list1, list2));

        List<String> empty = List.of();
        System.out.println(merge(list1, empty));
        System.out.println(merge(empty, empty));

        try {
            System.out.println(merge(null, list2));
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

    }
}
