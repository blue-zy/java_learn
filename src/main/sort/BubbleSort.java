package main.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {11, 4, 25, 37, 21, 2, 1, 56, 7, 32, 534, 13, 2, 57, 23, 54};
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arrCopy);
        System.out.println(Arrays.toString(arrCopy));

    }

    public static void sort(int[] arr) {
        boolean isSort = false;
        for (int i = 0; i < arr.length && !isSort; i++) {
            // 每次让最大的泡泡升出来
            isSort = true;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    isSort = false;
                }
                // System.out.println(Arrays.toString(arr));
            }
        }
    }
}
