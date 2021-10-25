package main.java.Arrays;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        int[] a = new int[4];
//        List<Integer> a1 = new ArrayList<Integer>();
//        a1.add(1);
//        a1.add(2);
//        a1.add(3);
//        a1.forEach((item) -> {
//            System.out.println(item);
//        });

        Map<Integer,Integer> map = new HashMap<>();
        map.put(1, 11);
        map.put(2, 22);
        map.put(3, 33);
        map.put(4, 11);
        map.put(5, 22);
        map.put(6, 33);
        map.put(7, 11);
        map.put(8, 22);
        map.put(9, 33);
        map.forEach(
                (key, value) -> {
                    System.out.println("key is "+ key);
                    System.out.println("value is "+ value);
                }
        );

    }
}
