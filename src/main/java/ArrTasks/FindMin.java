package ArrTasks;

public class FindMin {
        public static int findMin(int[] arr) {
            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("Массив не может быть null или равнятся 0");

            }

            int min = arr[0];
            for (int num : arr) {
                if (num < min)
                    min = num;
            }
            return min;
        }

        public static void main(String[] args) {
            int[] array1 = {34, 44, 23, 4, 6};
            int[] array2 = {};
            int[] array3 = null;

            System.out.println("Минимальное число: " + findMin(array1));

            try {
                System.out.println("Минимальное число: " + findMin(array2));
                System.out.println("Минимальное число: " + findMin(array3));
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

