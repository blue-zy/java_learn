package main.exam;

import java.util.*;
import java.util.concurrent.CountDownLatch;

public class Main {
    static int count;

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 5, 10};
        func(nums, 4, 0);
        System.out.println(count);
    }

    public static void func(int[] nums, int obj, int current){
        if(current == obj){
            count++;
        }else if (current < obj){
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]!=0){
                    current += nums[i];
                    func(nums, obj, current);
                    current -= nums[i];
                }
            }
        } else if (current > obj) {
            return;
        }

    }

}
