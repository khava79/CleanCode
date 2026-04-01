package ArrTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> list) {

        if (list == null) {
            throw new IllegalArgumentException("Список не должен быть null");
        }
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5, 6, 7, 5);
        System.out.println(removeDuplicates(list));

        try {
            removeDuplicates(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
