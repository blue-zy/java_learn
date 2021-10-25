package main.sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 2, 2, 1, 56, 7, 32, 534, 13, 2, 57, 23, 54};
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arrCopy);
        System.out.println(Arrays.toString(arrCopy));

    }

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int temp = arr[j]; // 先把要插入的数挖出来
            // 当要插入的数比前一个数小的时候，前面元素往后移
            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }
}
