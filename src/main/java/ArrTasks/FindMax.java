package ArrTasks;

public class FindMax {
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Массив не может быть null или равнятся 0");

        }

        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
            max = num;
        }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array1 = {34, 44, 23, 4, 6};
        int[] array2 = {};
        int[] array3 = null;

        System.out.println("Максимальное число: " + findMax(array1));

        try {
            System.out.println("Максимальное число: " + findMax(array2));
            System.out.println("Максимальное число: " + findMax(array3));
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
