package com.company;

public class Main {

    public static void main(String[] args) {
        double[] nums = {1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9,1.0,11.1,11.2,12.3,43.55,12.2,1.1};
        double result = 0;
        for (double m:nums) {
            result+=m;
        }
        System.out.println("значение средней арифметики равно" +result/ nums.length);
    }
}