package main.sort;

import javax.print.DocFlavor;
import java.util.*;

public class HeapSort {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,4,6,3,8,9,22,44,5,3,6};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums){
        buildHeap(nums);
        for (int i = nums.length - 1; i > 0; i--) {
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;
            heapify(nums,0,i-1);
        }
    }

    public static void buildHeap(int[] nums) {
        int len = nums.length-1;

        for (int i = (len-1)/2; i >= 0; i--) {
            heapify(nums,i,len);
        }
    }

    public static void heapify(int[] nums, int start, int end){
        int lastRootIndex = start;

        int max = lastRootIndex;
        int left = 2*lastRootIndex + 1;
        int right = 2*lastRootIndex + 2;

        if (left<=end && nums[left]>nums[max]){
            max = left;
        }

        if (right<=end && nums[right]>nums[max]){
            max = right;
        }

        if (max != lastRootIndex) {
            int temp = nums[max];
            nums[max] = nums[lastRootIndex];
            nums[lastRootIndex] = temp;
            heapify(nums,max,end);
        }

    }

}


