package main.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
//        int[] arr = {11, 4, 25, 37, 21, 2, 1, 56, 7, 32, 534, 13, 2, 57, 23, 54};
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arrCopy);
        System.out.println(Arrays.toString(arrCopy));

    }

    public static void sort(int[] arr, int lIndex, int rIndex) {
        if (lIndex < rIndex) {
            int i = lIndex;
            int j = rIndex;
            int temp = arr[lIndex];
            while (i < j) {
                while (i < j && arr[j] >= temp) {
                    j--;
                }

                if (i < j) {
                    arr[i] = arr[j];
                    i++;
                }

                while (i < j && arr[i] < temp) {
                    i++;
                }

                if (i < j) {
                    arr[j] = arr[i];
                    j--;
                }
            }
            arr[i] = temp;
            sort(arr, lIndex, i - 1);
            sort(arr, i + 1, rIndex);
        }
    }
}
