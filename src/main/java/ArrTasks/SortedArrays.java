package ArrTasks;

import java.util.Arrays;

public class SortedArrays {
    public static int[] mergeSortedArrays(int[] a, int[] b) {

        if (a == null) a = new int[0];
        if (b == null) b = new int[0];

        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            result[k++] = a[i] < b[j] ? a[i++] : b[j++];
        }

        while (i < a.length) result[k++] = a[i++];
        while (j < b.length) result[k++] = b[j++];
        return result;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 3 , 5};
        int[] b1 = {2, 4, 6,};
        System.out.println(Arrays.toString(mergeSortedArrays(a1, b1)));

        int[] a2 = {};
        int[] b2 = {2, 4, 6,};
        System.out.println(Arrays.toString(mergeSortedArrays(a2, b2)));

        int[] a3 = null;
        int[] b3 = {2, 4, 6,};
        System.out.println(Arrays.toString(mergeSortedArrays(a3, b3)));

        int[] a4 = {};
        int[] b4 = {};
        System.out.println(Arrays.toString(mergeSortedArrays(a4, b4)));
    }

    
}
