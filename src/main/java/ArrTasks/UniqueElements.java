package ArrTasks;

import java.util.HashSet;
import java.util.Set;

public class UniqueElements {
    public static boolean allUnique(int[] arr) {

        if (arr == null) {
            throw new IllegalArgumentException("Массив не должен быть null");
        }

        if (arr.length == 0) {
            return true;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        System.out.println(allUnique(array1));
        int[] array2 = {};
        System.out.println(allUnique(array2));
        int[] array3 = {1, 2, 3, 4, 3};
        System.out.println(allUnique(array3));
        int[] array4 = {4, 1, 2, 3, 4};
        System.out.println(allUnique(array4));


        try {
            System.out.println(UniqueElements.allUnique(null));
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

    }
}
