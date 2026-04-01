package ArrTasks;

import java.util.Arrays;

public class ReverseArray {
    public static void swapArrays(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Массив не должен быть null");
        }
        if (nums.length <= 1) {
            return;
        }
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        swapArrays(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1};
        swapArrays(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {};
        swapArrays(arr3);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = {1,2};
        swapArrays(arr4);
        System.out.println(Arrays.toString(arr4));

    }

}
