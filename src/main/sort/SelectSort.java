package main.sort;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 2, 2, 1, 56, 7, 32, 534, 13, 2, 57, 23, 54};
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arrCopy);
        System.out.println(Arrays.toString(arrCopy));

    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j]<arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
