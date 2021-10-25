package main.sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {11, 4, 25, 37, 21, 2, 1, 56, 7, 32, 534, 13, 2, 57, 23, 54};
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arrCopy);
        System.out.println(Arrays.toString(arrCopy));

    }

    public static void sort(int[] arr) {
        for (int step = arr.length/2; step >0 ; step/=2) {
            for (int i = step; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                while (j >= step && temp < arr[j - step]) {
                    int t = arr[j];
                    arr[j] = arr[j - step];
                    arr[j - step] = t;
                    j -= step;
                    System.out.println(Arrays.toString(arr));
                }
                arr[j] = temp;
            }
        }
    }
}
