package main.exam;

import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int selfPower = 0;
        int ePower = 0;
        int[] inArr = new int[m];
        int[] outArr = new int[m];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            inArr[i] = in.nextInt();
        }
        for (int i = 0; i < m; i++) {
            outArr[i] = in.nextInt();
            map.put(inArr[i], outArr[i]);
        }
        Arrays.sort(inArr);
        int startTime = inArr[0];
        selfPower = startTime - 1;
        int endTime = map.get(inArr[0]);
        int initCost = endTime - startTime;
        for (int j = 0; j < initCost; j++) {
            if (selfPower > 0) {
                selfPower--;
            } else {
                ePower++;
            }
        }
        for (int i = 1; i < inArr.length; i++) {
            int tempStartTime = inArr[i];
            int tempEndTime = map.get(inArr[i]);
            if (tempStartTime > endTime) {
                selfPower += tempStartTime - endTime;
                startTime = tempStartTime;
                endTime = tempEndTime;
                int cost = endTime - startTime;
                for (int j = 0; j < cost; j++) {
                    if (selfPower > 0) {
                        selfPower--;
                    } else {
                        ePower++;
                    }
                }
            }else {
                if (tempEndTime > endTime) {
                    int cost = tempEndTime - endTime;
                    endTime = tempEndTime;
                    for (int j = 0; j < cost; j++) {
                        if (selfPower > 0) {
                            selfPower--;
                        } else {
                            ePower++;
                        }
                    }
                }

            }

        }
        System.out.println(ePower);

    }

}