package ArrTasks;

public class ArraysTasks {
    public static int sumOfArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Массив не может быть null");
        }
        if (arr.length == 0) {
            return 0;
        }

        int total = 0;
        for (int num : arr) {
        total += num;
        }
        return total;

    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {};
        int[] array3 = null;

        System.out.println("Сумма чисел в массиве: " + ArraysTasks.sumOfArray(array1));
        System.out.println("Сумма чисел в массиве: " + ArraysTasks.sumOfArray(array2));

        try {
            System.out.println("Сумма array3: " + sumOfArray(array3));
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

    }
}



