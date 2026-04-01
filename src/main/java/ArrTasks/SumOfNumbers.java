package ArrTasks;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {
    public static int sum(List<Integer> list) {

        if (list == null || list.isEmpty() ) {
            throw new IllegalArgumentException("Список пуст!");
        }

        int sum = 0;
        for (int num : list) {
            sum += num;

        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        System.out.println("Сумма: " + SumOfNumbers.sum(list1));

        List<Integer> emptyList = Arrays.asList();
        try {
            System.out.println("Сумма: " + SumOfNumbers.sum(emptyList));
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            System.out.println("Сумма: " + SumOfNumbers.sum(null));
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

}
