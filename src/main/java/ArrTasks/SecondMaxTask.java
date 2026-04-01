package ArrTasks;

public class SecondMaxTask {
    public static int findSecondMax(int[] arr) {

        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Массив должен содержать минимум 2 элемента");
        }

        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                second = max;
                max = num;
            } else if (num > second && num != max) {
                second = num;
            }
        }
        return second;

    }

    public static void main(String[] args) {
        int[] array1 = {2, 4, 6, 7};
        int[] array2 = {5};
        int[] array3 = {2, 2, 2};
        int[] array4 = {7, 7, 6};
        int[] array5 = {-1, -7, -5};
        System.out.println(findSecondMax(array1));
        System.out.println(findSecondMax(array4));
        System.out.println(findSecondMax(array5));
        System.out.println(findSecondMax(array2));
        System.out.println(findSecondMax(array3));

    }
}
