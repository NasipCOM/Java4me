package com.company.Practice.Arrays;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int [] nums = new int[10];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 100);
        }

        for (int x: nums) {
            sum = sum + x;
            System.out.print(x + " ");
        }
        System.out.println();
        int average = sum / nums.length;
        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < min)
                min = nums[i];
            if(nums[i] > max)
                max = nums[i];
        }
        System.out.println("Max num is " + max);
        System.out.println("Min num is " + min);
        System.out.println("Average is " + average);
    }
}

