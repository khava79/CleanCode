package ArrTasks;

import java.util.Arrays;
import java.util.List;

public class IsElementInTheList {
    public static boolean contains(List<Integer> list, int target) {

        if (list.isEmpty()) {
            throw new IllegalArgumentException("Список пуст");
        }
        return list.contains(target);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,6,7,8,9);
        System.out.println(list.contains(7));
        System.out.println(list.contains(4));
        System.out.println();
    }
}
