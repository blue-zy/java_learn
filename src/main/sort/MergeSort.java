package main.sort;

import com.sun.javafx.sg.prism.web.NGWebView;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {11, 4, 25, 37, 21, 2, 1, 56, 7, 32, 534, 13, 2, 57, 23, 54};
        int[] temp = new int[arr.length];
        int[] arrCopy = Arrays.copyOf(arr,arr.length);
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arrCopy);
        System.out.println(Arrays.toString(arrCopy));

    }

    public static void sort(int[] arr, int left, int right){
        if(left<right){
            int middle = (left + right)/2;
            sort(arr, left, middle);
            sort(arr, middle+1, right);
            merge(arr, left, right);
        }
    }

    public static void merge(int[] arr, int left, int right){
        int middle = (left + right)/2;
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = middle + 1;
        int t = 0;
        while(i <= middle && j<=right){
            if(arr[i] < arr[j]){
                temp[t++] = arr[i++];
            }else{
                temp[t++] = arr[j++];
            }
        }
        while(i<=middle){
            temp[t++] = arr[i++];
        }
        while(j<=right){
            temp[t++] = arr[j++];
        }
        t = 0;
        while(left<=right){
            arr[left++] = temp[t++];
        }
    }
}
